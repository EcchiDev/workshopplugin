package com.mastersteve26.workshop.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.mastersteve26.workshop.commands.MOTD;
import com.mastersteve26.workshop.listeners.PlayerJoinListener;

public class Main extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public final PlayerJoinListener PJL = new PlayerJoinListener(this);
	

	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinListener(this), this);
        
        getCommand("motd").setExecutor(new MOTD(this));
        
		getConfig().options().copyDefaults(true);
		saveConfig();
		log.info("Plugin Enabled!");
	}
	
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Plugin Disabled!");
	}

}
