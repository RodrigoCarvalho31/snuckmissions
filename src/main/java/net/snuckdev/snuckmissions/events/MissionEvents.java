package net.snuckdev.snuckmissions.events;

import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.io.IOException;

public class MissionEvents implements Listener {

    @EventHandler
    public void on(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Main.missionManager.addToMission(MissionType.PLACE_BLOCKS, p, 1);
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == 1000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 1);
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == 2000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 2);
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == 3000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 3);
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == 4000) {
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 4);
            Main.data.set(p.getName() + ".placed_blocks_level", 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == 5000) {
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 5);
            Main.data.set(p.getName() + ".placed_blocks_level", 5);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @EventHandler
    public void on(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Main.missionManager.addToMission(MissionType.BREAK_BLOCKS, p, 1);
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == 1000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 1);
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == 2000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 2);
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == 3000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 3);
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == 4000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 4);
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == 5000) {
            Main.data.set(p.getName() + ".placed_blocks_level", 5);
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 5);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @EventHandler
    public void on(EntityDeathEvent e) {
        LivingEntity target = e.getEntity();
        if(target instanceof Player) {
            Player p = target.getKiller();
            Main.missionManager.addToMission(MissionType.PLAYER_KILL, p, 1);
            if(Main.data.get(p.getName() + ".killed_players").getAsInt() == 1000) {
                Main.data.set(p.getName() + ".killed_players_level", 1);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_players").getAsInt() == 2000) {
                Main.data.set(p.getName() + ".killed_players_level", 2);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_players").getAsInt() == 3000) {
                Main.data.set(p.getName() + ".killed_players_level", 3);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_players").getAsInt() == 4000) {
                Main.data.set(p.getName() + ".killed_players_level", 4);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_players").getAsInt() == 5000) {
                Main.data.set(p.getName() + ".killed_players_level", 5);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if(target instanceof Monster) {
            Player p = target.getKiller();
            Main.missionManager.addToMission(MissionType.MOB_KILL, p, 1);
            if(Main.data.get(p.getName() + ".killed_mobs").getAsInt() == 1000) {
                Main.data.set(p.getName() + ".killed_mobs_level", 1);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_mobs").getAsInt() == 2000) {
                Main.data.set(p.getName() + ".killed_mobs_level", 2);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_mobs").getAsInt() == 3000) {
                Main.data.set(p.getName() + ".killed_mobs_level", 3);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_mobs").getAsInt() == 4000) {
                Main.data.set(p.getName() + ".killed_mobs_level", 4);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".killed_mobs").getAsInt() == 5000) {
                Main.data.set(p.getName() + ".killed_mobs_level", 5);
                Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
