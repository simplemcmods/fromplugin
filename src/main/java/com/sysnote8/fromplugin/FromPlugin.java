package com.sysnote8.fromplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FromPlugin extends JavaPlugin {
    public static FromPlugin INSTANCE;
    @Override
    public void onEnable() {
        // Plugin startup logic
        INSTANCE = this;
        getLogger().info("FromPlugin was initialized!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
