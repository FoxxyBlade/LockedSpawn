package com.foxdev.spawnpl.Spawn;

import com.foxdev.spawnpl.SpawnPL;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
    private SpawnPL main;

    public Spawn(SpawnPL main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (main.getConfig().getLocation("spawn") != null) {

            p.teleport(main.getConfig().getLocation("spawn"));
            p.sendMessage("U bent geteleporteerd naar spawn");

        } else {
            p.sendMessage("U moet eerst /setspawn doen!");
        }


        return false;
    }
}
