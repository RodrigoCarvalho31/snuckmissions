package net.snuckdev.snuckmissions.events;

import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;
import net.snuckdev.snuckmissions.items.ItemBuilder;
import net.snuckdev.snuckmissions.utils.ItemStackUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;



public class ClickInventory implements Listener {

    @EventHandler
    public void on(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        String title = e.getInventory().getTitle();
        ItemStack item = e.getCurrentItem();
        String itemName = item.getItemMeta().getDisplayName();

        if (title.equals("Menu de missões")) {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;


            //region varios ifs
            if (itemName.equals("§eColocador de blocos")) {
                e.setCancelled(true);
                Inventory brokenBlocks = Bukkit.createInventory(null, 3 * 9, "Missões - blocos quebrados");
                brokenBlocks.setItem(11, ItemStackUtils.generateMinecart(MissionType.BREAK_BLOCKS, p, 1));
                brokenBlocks.setItem(12, ItemStackUtils.generateMinecart(MissionType.BREAK_BLOCKS, p, 2));
                brokenBlocks.setItem(13, ItemStackUtils.generateMinecart(MissionType.BREAK_BLOCKS, p, 3));
                brokenBlocks.setItem(14, ItemStackUtils.generateMinecart(MissionType.BREAK_BLOCKS, p, 4));
                brokenBlocks.setItem(15, ItemStackUtils.generateMinecart(MissionType.BREAK_BLOCKS, p, 5));
                p.openInventory(brokenBlocks);
            } else if (itemName.equals("§eDetonador de blocos")) {
                e.setCancelled(true);
                Inventory placedBlocks = Bukkit.createInventory(null, 3 * 9, "Missões - blocos colocados");
                placedBlocks.setItem(11, ItemStackUtils.generateMinecart(MissionType.PLACE_BLOCKS, p, 1));
                placedBlocks.setItem(12, ItemStackUtils.generateMinecart(MissionType.PLACE_BLOCKS, p, 2));
                placedBlocks.setItem(13, ItemStackUtils.generateMinecart(MissionType.PLACE_BLOCKS, p, 3));
                placedBlocks.setItem(14, ItemStackUtils.generateMinecart(MissionType.PLACE_BLOCKS, p, 4));
                placedBlocks.setItem(15, ItemStackUtils.generateMinecart(MissionType.PLACE_BLOCKS, p, 5));
                p.openInventory(placedBlocks);
            } else if (itemName.equals("§aJogadores mortos")) {
                e.setCancelled(true);
                Inventory killedPlayers = Bukkit.createInventory(null, 3 * 9, "Missões - jogadores mortos");
                killedPlayers.setItem(11, ItemStackUtils.generateMinecart(MissionType.PLAYER_KILL, p, 1));
                killedPlayers.setItem(12, ItemStackUtils.generateMinecart(MissionType.PLAYER_KILL, p, 2));
                killedPlayers.setItem(13, ItemStackUtils.generateMinecart(MissionType.PLAYER_KILL, p, 3));
                killedPlayers.setItem(14, ItemStackUtils.generateMinecart(MissionType.PLAYER_KILL, p, 4));
                killedPlayers.setItem(15, ItemStackUtils.generateMinecart(MissionType.PLAYER_KILL, p, 5));
                p.openInventory(killedPlayers);
            } else if (itemName.equals("§aMonstros mortos")) {
                e.setCancelled(true);
                Inventory killedMobs = Bukkit.createInventory(null, 3 * 9, "Missões - monstros mortos");
                killedMobs.setItem(11, ItemStackUtils.generateMinecart(MissionType.MOB_KILL, p, 1));
                killedMobs.setItem(12, ItemStackUtils.generateMinecart(MissionType.MOB_KILL, p, 2));
                killedMobs.setItem(13, ItemStackUtils.generateMinecart(MissionType.MOB_KILL, p, 3));
                killedMobs.setItem(14, ItemStackUtils.generateMinecart(MissionType.MOB_KILL, p, 4));
                killedMobs.setItem(15, ItemStackUtils.generateMinecart(MissionType.MOB_KILL, p, 5));
                p.openInventory(killedMobs);
            }

            //endregion


        } else if(title.equals("Missões - blocos quebrados") || title.equals("Missões - blocos colocados") || title.equals("Missões - jogadores mortos") || title.equals("" +
                "Missões - monstros mortos")) {
            if (e.getCurrentItem() == null) return;
            if (e.getCurrentItem().getType() == Material.AIR) return;
            if(itemName.contains("I") || itemName.contains("II") || itemName.contains("III") || itemName.contains("IV") || itemName.contains("V")) {e.setCancelled(true);}
        }

    }
}
