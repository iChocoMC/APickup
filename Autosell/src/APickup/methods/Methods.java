package APickup.methods;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Methods {
  
  public static void giveDrops(Player p, Block block, ItemStack item) {
    if (item == null || item.getType() == Material.AIR)
      return; 
    
    @SuppressWarnings("deprecation")
	ItemStack playerItem = p.getItemInHand();
    if (playerItem.hasItemMeta() && playerItem.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
      int level = playerItem.getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS);
      int random = (new Random()).nextInt(level) + 1;
            item.setAmount(random); 
      } 
      p.getInventory().addItem(new ItemStack[] { item });
    } 

  
  public static void removeDrops(BlockBreakEvent e) {
      e.getBlock().setType(Material.AIR);
    } 
}