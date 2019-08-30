package net.snuckdev.snuckmissions.utils;

import net.snuckdev.snuckmissions.Main;
import net.snuckdev.snuckmissions.enums.MissionType;

public class ConfigUtils {

    public static String get(String path) {
        return Main.plugin.getConfig().getString(path).replace("&", "§");
    }

    public static int getLevelRequirement(MissionType missionType, int level) {
        switch (missionType) {
            case PLACE_BLOCKS: {
                return Main.plugin.getConfig().getInt("requisitos.colocar-blocos.level-" + level);
            }
            case BREAK_BLOCKS: {
                return Main.plugin.getConfig().getInt("requisitos.quebrar-blocos.level-" + level);
            }
            case MOB_KILL: {
                return Main.plugin.getConfig().getInt("requisitos.matar-monstros.level-" + level);
            }
            case PLAYER_KILL: {
                return Main.plugin.getConfig().getInt("requisitos.matar-jogadores.level-" + level);
            }
        }
        return 1;
    }

}
