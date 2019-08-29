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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
