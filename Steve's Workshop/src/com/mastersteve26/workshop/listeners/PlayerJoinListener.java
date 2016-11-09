package com.mastersteve26.workshop.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.mastersteve26.workshop.main.Main;

public class PlayerJoinListener implements Listener{
	
	public static Main plugin;
	public PlayerJoinListener(Main instance) {
		plugin = instance;
	}


	public void onPlayerJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		String motd = plugin.getConfig().getString("motd");
		
		p.sendMessage(ChatColor.GREEN + motd);
	}
}
