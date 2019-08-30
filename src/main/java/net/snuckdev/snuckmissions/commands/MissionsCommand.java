package net.snuckdev.snuckmissions.commands;

import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.items.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

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

        //region brokenblocks
        int brokenBlocksPosition = Main.plugin.getConfig().getInt("menu-principal.blocos-quebrados.posicao");
        String brokenBlocksMaterial = Main.plugin.getConfig().getString("menu-principal.blocos-quebrados.item");
        String brokenBlocksName = Main.plugin.getConfig().getString("menu-principal.blocos-quebrados.name");

        Inventory inv = Bukkit.getServer().createInventory(null, 9*3, "Menu de missões");
        ItemStack brokenBlocksPickaxe = new ItemBuilder(Material.valueOf(brokenBlocksMaterial)).
                setDisplayName(brokenBlocksName).build();
        ItemMeta brokenBlocksMeta = brokenBlocksPickaxe.getItemMeta();
        List<String> lore = new ArrayList<>();
        for(String s : Main.plugin.getConfig().getStringList("menu-principal.blocos-quebrados.lore")) {
            lore.add(s.replace("&", "§"));
        }
        brokenBlocksMeta.setLore(lore);
        brokenBlocksMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        brokenBlocksPickaxe.setItemMeta(brokenBlocksMeta);
        inv.setItem(brokenBlocksPosition, brokenBlocksPickaxe);
        //endregion

        //region placedblocks
        int placedBlocksPosition = Main.plugin.getConfig().getInt("menu-principal.blocos-colocados.posicao");
        String placedBlocksMaterial = Main.plugin.getConfig().getString("menu-principal.blocos-colocados.item");
        String placedBlocksName = Main.plugin.getConfig().getString("menu-principal.blocos-colocados.name");

        ItemStack placedBlocksDirt = new ItemBuilder(Material.valueOf(placedBlocksMaterial))
                .setDisplayName(placedBlocksName)
                .build();
        ItemMeta placedBlocksMeta = placedBlocksDirt.getItemMeta();
        List<String> placedBlocksLore = new ArrayList<>();
        for(String s : Main.plugin.getConfig().getStringList("menu-principal.blocos-colocados.lore")) {
            placedBlocksLore.add(s.replace("&", "§"));
        }
        placedBlocksMeta.setLore(placedBlocksLore);
        placedBlocksDirt.setItemMeta(placedBlocksMeta);
        inv.setItem(placedBlocksPosition, placedBlocksDirt);
        //endregion

        //region killedplayers
        int killedPlayersPosition = Main.plugin.getConfig().getInt("menu-principal.jogadores-mortos.posicao");
        String killedPlayersMaterial = Main.plugin.getConfig().getString("menu-principal.jogadores-mortos.item");
        String killedPlayersName = Main.plugin.getConfig().getString("menu-principal.jogadores-mortos.name");

        ItemStack killedPlayersSword = new ItemBuilder(Material.valueOf(killedPlayersMaterial))
                .setDisplayName(killedPlayersName)
                .build();

        ItemMeta killedPlayersMeta = killedPlayersSword.getItemMeta();
        List<String> killedPlayersLore = new ArrayList<>();
        for(String s : Main.plugin.getConfig().getStringList("menu-principal.jogadores-mortos.lore")) {
            killedPlayersLore.add(s.replace("&", "§"));
        }
        killedPlayersMeta.setLore(killedPlayersLore);
        killedPlayersSword.setItemMeta(killedPlayersMeta);
        inv.setItem(killedPlayersPosition, killedPlayersSword);
        //endregion

        //region killedmobs
        int killedMobsPosition = Main.plugin.getConfig().getInt("menu-principal.monstros-mortos.posicao");
        String killedMobsMaterial = Main.plugin.getConfig().getString("menu-principal.monstros-mortos.item");
        String killedMobsName = Main.plugin.getConfig().getString("menu-principal.monstros-mortos.name");

        ItemStack killedMobsEgg = new ItemBuilder(Material.valueOf(killedMobsMaterial))
                .build();

        ItemMeta killedMobsMeta = killedPlayersSword.getItemMeta();
        killedMobsMeta.setDisplayName(killedMobsName.replace("&", "§"));
        List<String> killedMobsLore = new ArrayList<>();
        for(String s : Main.plugin.getConfig().getStringList("menu-principal.monstros-mortos.lore")) {
            killedMobsLore.add(s.replace("&", "§"));
        }
        killedMobsMeta.setLore(killedMobsLore);
        killedMobsEgg.setItemMeta(killedMobsMeta);
        inv.setItem(killedMobsPosition, killedMobsEgg);
        //endregion
        p.openInventory(inv);

        return false;
    }
}
