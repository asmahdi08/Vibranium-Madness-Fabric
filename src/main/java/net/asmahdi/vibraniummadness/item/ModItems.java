package net.asmahdi.vibraniummadness.item;

import net.asmahdi.vibraniummadness.VibraniumMadness;
import net.asmahdi.vibraniummadness.item.ModItemClasses.VibraniumPickaxe;
import net.asmahdi.vibraniummadness.toolmaterials.ModToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> ItemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VibraniumMadness.MOD_ID, name));

        Item item = ItemFactory.apply(settings.registryKey(itemKey));

        //register
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }


    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));
    }

//    private static Item registerItem(String name, Item item) {
//        return Registry.register(Registries.ITEM, Identifier.of(VibraniumMadness.MOD_ID, name), item);
//
//    }

    public static final Item VIBRANIUM_INGOT = register("vibranium_ingot",Item::new, new Item.Settings());
    public static final Item RAW_VIBRANIUM = register("raw_vibranium",Item::new, new Item.Settings());

    public static final Item VIBRANIUM_PICKAXE = register(
            "vibranium_pickaxe",
            VibraniumPickaxe::new,
            new VibraniumPickaxe.Settings().pickaxe(ModToolMaterials.VIBRANIUM_TOOL_MATERIAL,1.0F,0.0F).enchantable(22)
    );

    public static void registerModItems(){
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        VibraniumMadness.LOGGER.info("Registering item");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> {
                    itemGroup.add(VIBRANIUM_INGOT);
                    itemGroup.add(RAW_VIBRANIUM);
                });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> {
                    itemGroup.add(VIBRANIUM_PICKAXE);
                });


    }
}
