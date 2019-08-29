package net.snuckdev.snuckmissions.utils;


import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemStackUtils {

    public static ItemStack generateMinecart(MissionType mission, Player p, int level) {

        switch (mission) {
            case PLAYER_KILL: {

                ItemStack minecart = new ItemStack(Material.MINECART);
                ItemMeta minecartMeta = minecart.getItemMeta();
                List<String> lore = new ArrayList<>();
                int playerKills = Main.data.get(p.getName() + ".players_killed").getAsInt();

                if(playerKills >= 1000 && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores I");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f1000§7/§f1000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < 1000 && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores I");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f1000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= 2000 && level == 2) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores II");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f2000§7/§f2000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < 2000 && level == 2) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores II");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f2000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= 3000 && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores III");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f3000§7/§f3000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < 3000 && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores III");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f3000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= 4000 && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores IV");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f4000§7/§f4000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < 4000 && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores IV");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f4000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills >= 5000 && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores V");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f5000§7/§f5000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills < 5000 && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores V");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f5000");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                }
            }
        }
        return new ItemStack(Material.MINECART);
    }

}
