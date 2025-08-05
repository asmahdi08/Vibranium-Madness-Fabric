package net.asmahdi.vibraniummadness.item.ModItemClasses;

import net.asmahdi.vibraniummadness.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.function.Consumer;

public class VibraniumPickaxe extends Item {
    public VibraniumPickaxe(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(!world.isClient()){
            BlockPos brokenBlock = context.getBlockPos();

            Direction playerhorizontaldirection = context.getHorizontalPlayerFacing();

            Direction.Axis facing = playerhorizontaldirection.getAxis();
            Direction.AxisDirection axisDirection = playerhorizontaldirection.getDirection();
            float playerPitch = context.getPlayer().getPitch();

            if(playerPitch < -45) {
                //looking up
                for(int y=0;y<3;y++) {
                    for (int x = -1; x < 2; x++) {
                        for (int z = -1; z < 2; z++) {
                            world.breakBlock(brokenBlock.add(x, y, z), true);
                        }
                    }
                }

            }else if(playerPitch > 45) {
                //looking down
                for( int y=0; y > -3; y--) {
                    for (int x = -1; x < 2; x++) {
                        for (int z = -1; z < 2; z++) {
                            world.breakBlock(brokenBlock.add(x, y, z), true);
                        }
                    }
                }
            }else{
                if(facing == Direction.Axis.X){
                    //facing X
                    if(axisDirection == Direction.AxisDirection.POSITIVE){
                        for( int y=-1; y < 2; y++) {
                            for (int x = 0; x < 3; x++) {
                                for (int z = -1; z < 2; z++) {
                                    world.breakBlock(brokenBlock.add(x, y, z), true);
                                }
                            }
                        }
                    }else if(axisDirection == Direction.AxisDirection.NEGATIVE){
                        for( int y=-1; y < 2; y++) {
                            for (int x = 0; x > -3; x--) {
                                for (int z = -1; z < 2; z++) {
                                    world.breakBlock(brokenBlock.add(x, y, z), true);
                                }
                            }
                        }
                    }

                }else if(facing == Direction.Axis.Z){
                    //facing Z
                    if(axisDirection == Direction.AxisDirection.POSITIVE){
                        for( int y=-1; y < 2; y++) {
                            for (int x = -1; x < 2; x++) {
                                for (int z = 0; z < 3; z++) {
                                    world.breakBlock(brokenBlock.add(x, y, z), true);
                                }
                            }
                        }
                    }else if(axisDirection == Direction.AxisDirection.NEGATIVE){
                        for( int y=-1; y < 2; y++) {
                            for (int x = -1; x < 2; x++) {
                                for (int z = 0; z > -3; z--) {
                                    world.breakBlock(brokenBlock.add(x, y, z), true);
                                }
                            }
                        }
                    }
                }
            }
            context.getPlayer().getItemCooldownManager().set(context.getStack(), 100);
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.literal(
                "Right Click to use power."
        ));
        textConsumer.accept(Text.literal(
                "5 second cooldown."
        ));
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);
    }
}
