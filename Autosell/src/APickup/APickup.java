package APickup;

import org.bukkit.plugin.java.JavaPlugin;

import APickup.managers.DataManager;

public class APickup extends JavaPlugin {
  private static APickup instance;
	  
	 public void onEnable() {
		 instance = this;
		 DataManager.setupPlugin(this);
	 }
		  
		public static APickup getInstance() {
		   return instance;
     }
}
