package APickup.mechanics;

import java.util.Collection;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import APickup.methods.Methods;

public class AutoPickup {
  public static void processAutoPickup(BlockBreakEvent e) {
    Collection<ItemStack> blockDrops;
    if (e.isCancelled())
      return; 
    
    Block b = e.getBlock();
    Player p = e.getPlayer();
    
    blockDrops = b.getDrops();

    for (ItemStack drops : blockDrops)
      Methods.giveDrops(p, b, drops); 
      Methods.removeDrops(e);
    }
}