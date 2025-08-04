package net.asmahdi.vibraniummadness.component;

import com.mojang.serialization.Codec;
import net.asmahdi.vibraniummadness.VibraniumMadness;
import net.minecraft.component.Component;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
    public static final ComponentType<Boolean> charged =
        register("charged", builder -> builder.codec(Codec.BOOL));

    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(VibraniumMadness.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes(){
        VibraniumMadness.LOGGER.info("Registering Data Components");
    }
}
