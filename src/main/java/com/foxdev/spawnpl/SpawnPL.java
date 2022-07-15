package com.foxdev.spawnpl;

import com.foxdev.spawnpl.Spawn.Spawn;
import com.foxdev.spawnpl.Spawn.setSpawn;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnPL extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("setspawn").setExecutor(new setSpawn(this));
        getCommand("spawn").setExecutor(new Spawn(this));

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
