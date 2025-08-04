package net.asmahdi.vibraniummadness.toolmaterials;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModToolMaterials {
    public static final TagKey<Item> REPAIRS_VIBRANIUM_TOOLS = TagKey.of(
            RegistryKeys.ITEM,
            Identifier.of("vibranium-madness", "vibranium_tool_material")
    );

    public static final ToolMaterial VIBRANIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.AIR,
            2031,
            36.0F,
            16.0F,
            22,
            REPAIRS_VIBRANIUM_TOOLS
    );

}
