package net.snuckdev.snuckmissions.events;

import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;
import net.snuckdev.snuckmissions.utils.ConfigUtils;
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
        try {
            Main.data.save();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 1)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 2)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 3)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 4)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".placed_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLACE_BLOCKS, 5)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 5);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.PLACE_BLOCKS, p, 5);
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
        try {
            Main.data.save();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 1)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 2)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 2);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 3)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 3);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 4)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Main.missionManager.notifyLevelUp(MissionType.BREAK_BLOCKS, p, 4);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if(Main.data.get(p.getName() + ".broken_blocks").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.BREAK_BLOCKS, 5)) {
            Main.data.set(p.getName() + ".placed_blocks_level", 5);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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
        if(target instanceof Player && e.getEntity().getKiller() != null) {
            Player p = target.getKiller();
            Main.missionManager.addToMission(MissionType.PLAYER_KILL, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if(Main.data.get(p.getName() + ".players_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 1)) {
                Main.data.set(p.getName() + ".players_killed_level", 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.PLAYER_KILL, p, 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".players_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 2)) {
                Main.data.set(p.getName() + ".players_killed_level", 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.PLAYER_KILL, p, 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".players_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 3)) {
                Main.data.set(p.getName() + ".players_killed_level", 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.PLAYER_KILL, p, 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".players_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 4)) {
                Main.data.set(p.getName() + ".players_killed_level", 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.PLAYER_KILL, p, 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".players_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.PLAYER_KILL, 5)) {
                Main.data.set(p.getName() + ".players_killed_level", 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.PLAYER_KILL, p, 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if(target instanceof Monster && e.getEntity().getKiller() != null) {
            Player p = target.getKiller();
            Main.missionManager.addToMission(MissionType.MOB_KILL, p, 1);
            try {
                Main.data.save();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if(Main.data.get(p.getName() + ".mobs_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 1)) {
                Main.data.set(p.getName() + ".mobs_killed_level", 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.MOB_KILL, p, 1);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".mobs_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 2)) {
                Main.data.set(p.getName() + ".mobs_killed_level", 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.MOB_KILL, p, 2);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".mobs_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 3)) {
                Main.data.set(p.getName() + ".mobs_killed_level", 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.MOB_KILL, p, 3);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".mobs_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 4)) {
                Main.data.set(p.getName() + ".mobs_killed_level", 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.MOB_KILL, p, 4);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(Main.data.get(p.getName() + ".mobs_killed").getAsInt() == ConfigUtils.getLevelRequirement(MissionType.MOB_KILL, 5)) {
                Main.data.set(p.getName() + ".mobs_killed_level", 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.missionManager.notifyLevelUp(MissionType.MOB_KILL, p, 5);
                try {
                    Main.data.save();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
