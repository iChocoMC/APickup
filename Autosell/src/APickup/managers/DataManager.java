package APickup.managers;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import APickup.APickup;
import APickup.listeners.BlockBreakListener;

public class DataManager {
  public static void setupPlugin(APickup plugin) {
	  
    registerEvents(plugin);
    
  }
  
  private static void registerEvents(APickup plugin) {
    plugin.getServer().getPluginManager().registerEvents((Listener)new BlockBreakListener(), (Plugin)plugin);
  }
}
