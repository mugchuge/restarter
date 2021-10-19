package com.io.restarter;

import org.bukkit.plugin.java.JavaPlugin;

public final class RestarterPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Restarter plugin enabled");
        getServer().getScheduler().runTaskTimer(this, new Restarter(), 216000L, 20L);
    }

    @Override
    public void onDisable() {
        System.out.println("Restarter plugin disabled");
    }
}
