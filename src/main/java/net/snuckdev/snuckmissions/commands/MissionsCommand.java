package net.snuckdev.snuckmissions.commands;

import net.snuckdev.snuckmissions.items.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.Arrays;

public class MissionsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args) {

        if(!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage("§c[SnuckMissions] Apenas jogadores in-game podem executar este comando.");
            return true;
        }

        Player p = (Player) sender;

        if(!(p.hasPermission("snuckmissions.open"))) {
            p.sendMessage("§cVocê não tem permissão para abrir o menu de missões.");
            return true;
        }

        Inventory inv = Bukkit.getServer().createInventory(null, 9*3, "Menu de missões");
        inv.setItem(10, new ItemBuilder(Material.DIAMOND_PICKAXE).setDisplayName("§aBlocos quebrados").setLore(Arrays.asList(
                "§7Veja aqui o progresso das suas conquistas",
                "§7de quebrar blocos."
        )).build());

        inv.setItem(12, new ItemBuilder(Material.DIRT).setDisplayName("§aBlocos colocados").setLore(Arrays.asList(
                "§7Veja aqui o progresso das suas conquistas",
                "§7de colocar blocos."
        )).build());

        inv.setItem(14, new ItemBuilder(Material.DIAMOND_SWORD).setDisplayName("§aJogadores mortos").setLore(Arrays.asList(
                "§7Veja aqui o progresso das suas conquistas",
                "§7de matar jogadores."
        )).build());

        inv.setItem(16, new ItemBuilder(Material.MONSTER_EGG).setDisplayName("§aMonstros mortos").setLore(Arrays.asList(
                "§7Veja aqui o progresso das suas conquistas",
                "§7de matar monstros."
        )).build());

        p.openInventory(inv);

        return false;
    }
}
