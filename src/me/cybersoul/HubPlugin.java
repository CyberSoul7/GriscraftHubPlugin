package me.cybersoul;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HubPlugin extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]) {
		
		if (cmd.getName().equalsIgnoreCase("main")) {
			
			sender.sendMessage("The hub plugin is currently working!");
			sender.sendMessage("It is also running version " + Bukkit.getPluginManager().getPlugin("HubPlugin").getDescription().getVersion());
			
		}
		
		return false;
		
	}
	
}
