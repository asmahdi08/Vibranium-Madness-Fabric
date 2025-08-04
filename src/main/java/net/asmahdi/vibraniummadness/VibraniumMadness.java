package net.asmahdi.vibraniummadness;

import net.asmahdi.vibraniummadness.blocks.ModBlocks;
import net.asmahdi.vibraniummadness.component.ModDataComponentTypes;
import net.asmahdi.vibraniummadness.item.ModItems;
import net.asmahdi.vibraniummadness.trades.ModTrades;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VibraniumMadness implements ModInitializer {
	public static final String MOD_ID = "vibranium-madness";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		//ModItems.initialize();
		ModItems.registerModItems();
		ModBlocks.initialize();

		ModTrades.registerTrades();

		ModDataComponentTypes.registerDataComponentTypes();
	}
}