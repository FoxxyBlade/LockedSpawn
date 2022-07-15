package com.foxdev.spawnpl.Spawn;

import com.foxdev.spawnpl.SpawnPL;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawn implements CommandExecutor {
    private SpawnPL main;

    public setSpawn(SpawnPL main){
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p =(Player) sender;

        Location location = p.getLocation();
        main.getConfig().set("spawn", location);
        main.saveConfig();
        p.sendMessage("Je hebt de spawn gemaakt!");

        return false;
    }

}
