package com.mastersteve26.workshop.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.mastersteve26.workshop.main.Main;

public class Spawn implements CommandExecutor{

	public static Main plugin;
	public Spawn(Main instance) {
		plugin = instance;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("");
		}
		if(cmd.getName().equalsIgnoreCase("spawn")){
			
		}
		return true;
	}

}
