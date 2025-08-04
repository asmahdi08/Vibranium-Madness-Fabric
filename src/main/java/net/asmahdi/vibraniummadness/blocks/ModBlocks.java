package net.asmahdi.vibraniummadness.blocks;

import net.asmahdi.vibraniummadness.VibraniumMadness;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {

        //create registrykey
        RegistryKey<Block> blockKey = keyOfBlock(name);

        //block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);

    }
    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VibraniumMadness.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VibraniumMadness.MOD_ID, name));
    }

//    public static final Block VIBRANIUM_ORE = register(
//            "vibranium_ore",
//            Block::new,
//            AbstractBlock.Settings
//                    .create()
//                    .sounds(BlockSoundGroup.STONE)
//                    .strength(30F, 1200.0F)
//                    .requiresTool()
//                    ,
//            true
//    );

    public static final Block RAW_VIBRANIUM_BLOCK = register(
            "raw_vibranium_block",
            Block::new,
            AbstractBlock.Settings
                    .create()
                    .sounds(BlockSoundGroup.IRON)
                    .strength(50F, 1200.0F)
                    .requiresTool()
            ,
            true
    );

    public static void initialize() {
        VibraniumMadness.LOGGER.info("Registering blocks");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.RAW_VIBRANIUM_BLOCK.asItem());

        });

    }
}
