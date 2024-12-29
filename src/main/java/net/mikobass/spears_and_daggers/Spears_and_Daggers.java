package net.mikobass.spears_and_daggers;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.mikobass.spears_and_daggers.block.ModBlocks;
import net.mikobass.spears_and_daggers.item.ModItemGroups;
import net.mikobass.spears_and_daggers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spears_and_Daggers implements ModInitializer {
	public static final String MOD_ID = "spears_and_daggers";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		FuelRegistry.INSTANCE.add(ModItems.NOXIUM_CRYSTAL, 2400);
		//put this in a method in the future
	}
}