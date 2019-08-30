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

                if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores I");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            ""  + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 1)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores I");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                           "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 1)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 100),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 2) && level == 2) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores II");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 2)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 2) && level == 2) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores II");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                           "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 2)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 200),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores III");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 3)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Jogadores III");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 3)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 300),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores IV");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 4)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores IV");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 4)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 400),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores V");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 5)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setType(Material.STORAGE_MINECART);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Jogadores V");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 5)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 500),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                }
            }

            case MOB_KILL: {

                ItemStack minecart = new ItemStack(Material.MINECART);
                ItemMeta minecartMeta = minecart.getItemMeta();
                List<String> lore = new ArrayList<>();
                int playerKills = Main.data.get(p.getName() + ".mobs_killed").getAsInt();

                if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Monstros I");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 1)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bAssassino de Monstros I");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 1)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 100),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 2) && level == 2) {

                    minecartMeta.setDisplayName("§bAssassino de Monstros II");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 2)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 2) && level == 2) {
                    minecartMeta.setDisplayName("§bAssassino de Monstros II");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 2)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 200),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Monstros III");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 3)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bAssassino de Monstros III");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 3)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 300),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Monstros IV");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 4)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bAssassino de Monstros IV");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 4)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 400),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Monstros V");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 5)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setType(Material.STORAGE_MINECART);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bAssassino de Monstros V");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 5)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 500),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                }
            }

            case BREAK_BLOCKS: {
                ItemStack minecart = new ItemStack(Material.MINECART);
                ItemMeta minecartMeta = minecart.getItemMeta();
                List<String> lore = new ArrayList<>();
                int playerKills = Main.data.get(p.getName() + ".broken_blocks").getAsInt();

                if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bDetonador de Blocos I");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 1)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bDetonador de Blocos I");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 1)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 100),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 2) && level == 2) {

                    minecartMeta.setDisplayName("§bDetonador de Blocos II");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 2)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 2) && level == 2) {
                    minecartMeta.setDisplayName("§bDetonador de Blocos II");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 2)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 200),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bDetonador de Blocos III");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 3)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bDetonador de Blocos III");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 3)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 300),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bDetonador de Blocos IV");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 4)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bDetonador de Blocos IV");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 4)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 400),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bDetonador de Blocos V");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 5)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setType(Material.STORAGE_MINECART);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bDetonador de Blocos V");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 5)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 500),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                }
            }

            case PLACE_BLOCKS: {
                ItemStack minecart = new ItemStack(Material.MINECART);
                ItemMeta minecartMeta = minecart.getItemMeta();
                List<String> lore = new ArrayList<>();
                int playerKills = Main.data.get(p.getName() + ".placed_blocks").getAsInt();

                if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bColocador de Blocos I");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 1)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 1) && level == 1) {

                    minecartMeta.setDisplayName("§bColocador de Blocos I");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 1)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 100),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 2) && level == 2) {

                    minecartMeta.setDisplayName("§bColocador de Blocos II");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 2)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 2) && level == 2) {
                    minecartMeta.setDisplayName("§bColocador de Blocos II");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 2)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 200),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bColocador de Blocos III");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 3)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 3) && level == 3) {

                    minecartMeta.setDisplayName("§bColocador de Blocos III");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 3)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 300),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bColocador de Blocos IV");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 4)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecart.setType(Material.STORAGE_MINECART);
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;

                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 4) && level == 4) {
                    minecartMeta.setDisplayName("§bColocador de Blocos IV");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 4)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 400),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills >= ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bColocador de Blocos V");
                    lore.add("§7Status: §acompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f{}§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 5)) + ProgressBar.getProgressBar(
                            10,
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setType(Material.STORAGE_MINECART);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                } else if(playerKills < ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 5) && level == 5) {
                    minecartMeta.setDisplayName("§bColocador de Blocos V");
                    lore.add("§7Status: §cincompleta");
                    lore.add("");
                    lore.add("§7Progresso: §f" + playerKills + "§7/§f{} §7[".replace("{}",
                            "" + ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 5)) + ProgressBar.getProgressBar(
                            Math.round(playerKills / 500),
                            10, 10, "|", "§a", "§8") + "§7]");
                    minecartMeta.setLore(lore);
                    minecart.setItemMeta(minecartMeta);
                    return minecart;
                }
            }
        }
        return new ItemStack(Material.MINECART);
    }

}
