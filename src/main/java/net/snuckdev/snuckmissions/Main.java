package net.snuckdev.snuckmissions;

import net.snuckdev.snuckmissions.commands.MissionsCommand;
import net.snuckdev.snuckmissions.events.ClickInventory;
import net.snuckdev.snuckmissions.events.MissionEvents;
import net.snuckdev.snuckmissions.events.JoinEvent;
import net.snuckdev.snuckmissions.licenceserver.Response;
import net.snuckdev.snuckmissions.objects.JsonConfig;
import net.snuckdev.snuckmissions.objects.MissionManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    public static Main plugin;
    private PluginManager pm;
    public static JsonConfig data;
    public static MissionManager missionManager;

    @Override
    public void onEnable() {
        plugin = this;
        try {
            data = new JsonConfig("data.json", new File(Main.plugin.getDataFolder(), "/data.json"));
            data.save();
        } catch (IOException e) {
            e.printStackTrace();
        }
        saveConfigs();
        Response.verifyLicence(Bukkit.getConsoleSender(), getConfig().getString("licenca"), this);
        missionManager = new MissionManager();
        pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new JoinEvent(), this);
        pm.registerEvents(new MissionEvents(), this);
        pm.registerEvents(new ClickInventory(), this);
        getCommand("missoes").setExecutor(new MissionsCommand());
        Bukkit.getConsoleSender().sendMessage("§e[SnuckMissions] §aHabilitado com sucesso.");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[SnuckMissions] Desabilitado com sucesso.");
        super.onDisable();
    }

    private void saveConfigs() {
        File f = new File(this.getDataFolder(), "config.yml");
        if (!(f.exists()))
            this.saveDefaultConfig();
    }
}
