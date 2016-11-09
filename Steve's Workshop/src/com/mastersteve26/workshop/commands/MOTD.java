package com.mastersteve26.workshop.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.mastersteve26.workshop.main.Main;

public class MOTD implements CommandExecutor {

	public static Main plugin;
	public MOTD(Main instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("motd")){
			sender.sendMessage(plugin.getConfig().getString("motd"));
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("setmotd")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Please specify a message");
				return true;
			}
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < args.length; i++) {
				str.append(args[i] + " ");
			}
			String motd = str.toString();
			plugin.getConfig().set("motd", motd);
			plugin.saveConfig();
			sender.sendMessage(ChatColor.GREEN + "MOTD set to: " + ChatColor.LIGHT_PURPLE + motd);
			return true;
		}
		return true;
	}

}
