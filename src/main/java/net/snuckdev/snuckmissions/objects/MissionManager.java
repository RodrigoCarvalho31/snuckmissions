package net.snuckdev.snuckmissions.objects;

import com.google.gson.JsonElement;
import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;
import net.snuckdev.snuckmissions.utils.ConfigUtils;
import org.bukkit.entity.Player;

import java.io.IOException;

public class MissionManager {

    public void addToMission(MissionType missionType, Player p, int quantity) {


        switch (missionType) {
            case MOB_KILL: {
                JsonElement jsonElement = Main.data.get(p.getName() + ".mobs_killed");
                Main.data.set(p.getName() + ".mobs_killed", jsonElement.getAsInt() + quantity);
                try {
                    Main.data.save();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

            case PLAYER_KILL: {
                JsonElement jsonElement = Main.data.get(p.getName() + ".players_killed");
                Main.data.set(p.getName() + ".players_killed", jsonElement.getAsInt() + quantity);
                try {
                    Main.data.save();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

            case BREAK_BLOCKS: {
                JsonElement jsonElement = Main.data.get(p.getName() + ".broken_blocks");
                Main.data.set(p.getName() + ".broken_blocks", jsonElement.getAsInt() + quantity);
                try {
                    Main.data.save();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

            case PLACE_BLOCKS: {
                JsonElement jsonElement = Main.data.get(p.getName() + ".placed_blocks");
                Main.data.set(p.getName() + ".placed_blocks", jsonElement.getAsInt() + quantity);
                try {
                    Main.data.save();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

            default: {
                break;
            }
        }

    }

    public boolean hasLevel(MissionType missionType, Player p, int level) {
        switch (missionType) {
            case PLACE_BLOCKS: {
                return Main.data.get(p.getName() + ".placed_blocks_level").getAsInt() >= level;
            }

            case BREAK_BLOCKS: {
                return Main.data.get(p.getName() + ".broken_blocks_level").getAsInt() >= level;
            }

            case PLAYER_KILL: {
                return Main.data.get(p.getName() + ".players_killed_level").getAsInt() >= level;
            }

            case MOB_KILL: {
                return Main.data.get(p.getName() + ".mobs_killed_level").getAsInt() >= level;
            }

            default: {
                break;
            }
        }
        return false;
    }

    public void notifyLevelUp(MissionType missionType, Player p, int level) {
        switch (missionType) {
            case MOB_KILL: {
                if(level == 1) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Monstros I"));
                } else if(level == 2) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Monstros II"));
                } else if(level == 3) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Monstros III"));
                } else if(level == 4) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Monstros IV"));
                } else if(level == 5) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Monstros V"));
                }
                break;
            }

            case PLAYER_KILL: {
                if(level == 1) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Jogadores I"));
                } else if(level ==2) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Jogadores II"));
                } else if(level == 3) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Jogadores III"));
                } else if(level == 4) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Jogadores IV"));
                } else if(level == 5) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bAssassino de Jogadores V"));
                }
                break;
            }
            case BREAK_BLOCKS: {
                if(level == 1) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bDetonador de Blocos I"));
                } else if(level == 2) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bDetonador de Blocos II"));
                } else if(level == 3) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bDetonador de Blocos III"));
                } else if(level == 4) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bDetonador de Blocos IV"));
                } else if(level == 5) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bDetonador de Blocos V"));
                }
                break;
            }

            case PLACE_BLOCKS: {
                if(level == 1) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bColocador de Blocos I"));
                } else if(level == 2) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bColocador de Blocos II"));
                } else if(level == 3) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bColocador de Blocos III"));
                } else if(level == 4) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bColocador de Blocos IV"));
                } else if(level == 5) {
                    p.sendMessage(ConfigUtils.get("conquista-alcancada").replace("{conquista}",
                            "§bColocador de Blocos V"));
                }
                break;
            }

            default: {
                break;
            }
        }
    }

}