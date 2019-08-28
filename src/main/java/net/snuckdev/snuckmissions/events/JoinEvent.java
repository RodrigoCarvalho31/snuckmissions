package net.snuckdev.snuckmissions.events;


import net.snuckdev.snuckmissions.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class JoinEvent implements Listener {

    @EventHandler
    public void on(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String name = p.getName();

        if(Main.data.get(name).isJsonNull()) {
            Main.data.set(name + ".broken_blocks", 0);
            Main.data.set(name + ".broken_blocks_level", 0);
            Main.data.set(name + ".placed_blocks", 0);
            Main.data.set(name + ".placed_blocks_level", 0);
            Main.data.set(name + ".players_killed", 0);
            Main.data.set(name + ".players_killed_level", 0);
            Main.data.set(name + ".mobs_killed", 0);
            Main.data.set(name + ".mobs_killed_level", 0);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
