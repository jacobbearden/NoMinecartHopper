package com.aefonix.nominecarthopper;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class NoMinecartHopper extends JavaPlugin implements Listener {
  @Override
  public void onEnable() {
    this.getServer().getPluginManager().registerEvents(this, this);
  }

  @Override
  public void onDisable() {}

  @EventHandler
  public void onCraftItem(PrepareItemCraftEvent event) {
    Material itemType = event.getRecipe().getResult().getType();

    if (itemType == Material.HOPPER_MINECART) {
      event.getInventory().setResult(new ItemStack(Material.AIR));
    }
  }
}
