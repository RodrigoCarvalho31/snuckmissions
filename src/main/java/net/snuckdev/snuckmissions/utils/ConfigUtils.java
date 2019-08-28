package net.snuckdev.snuckmissions.utils;

import net.snuckdev.snuckmissions.Main;

public class ConfigUtils {

    public static String get(String path) {
        return Main.plugin.getConfig().getString(path).replace("&", "§");
    }

}
