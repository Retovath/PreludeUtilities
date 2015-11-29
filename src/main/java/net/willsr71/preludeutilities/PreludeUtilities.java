package net.willsr71.preludeutilities;

import org.bukkit.plugin.java.JavaPlugin;

public class PreludeUtilities extends JavaPlugin {
    public static PreludeUtilities instance;
    public static String version = "1.0-DEV";

    public void onEnable() {
        instance = this;
    }

    public void onDisable() {

    }
}
