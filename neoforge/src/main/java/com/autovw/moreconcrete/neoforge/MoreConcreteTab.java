package com.autovw.moreconcrete.neoforge;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

/**
 * @author Autovw
 */
@Mod.EventBusSubscriber(modid = MoreConcrete.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class MoreConcreteTab
{
    private MoreConcreteTab()
    {
    }

    @SubscribeEvent
    public static void onBuildCreativeModeTabContentsEvent(final BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS))
        {
            ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).filter(predicate -> {
                return predicate instanceof SlabBlock || predicate instanceof StairBlock ||
                        predicate instanceof WallBlock || predicate instanceof FenceBlock;
            }).forEach(event::accept);
        }

        if (event.getTabKey().equals(CreativeModeTabs.REDSTONE_BLOCKS))
        {
            ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).filter(predicate -> {
                return predicate instanceof LeverBlock || predicate instanceof PressurePlateBlock ||
                        predicate instanceof FenceGateBlock || predicate instanceof ButtonBlock;
            }).forEach(event::accept);
        }
    }
}
