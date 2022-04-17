package APickup.listeners;

import APickup.mechanics.AutoPickup;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {
	
  @EventHandler(priority = EventPriority.HIGHEST)
  public void onBlockBreak(BlockBreakEvent e) {
    if (e.isCancelled())
    	return; 

    AutoPickup.processAutoPickup(e);
  }
}
