package net.asmahdi.vibraniummadness.trades;

import net.asmahdi.vibraniummadness.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 10),
                    new ItemStack(ModItems.RAW_VIBRANIUM,1),
                    20,
                    15,
                    2F
            ));
        });
    }
}
