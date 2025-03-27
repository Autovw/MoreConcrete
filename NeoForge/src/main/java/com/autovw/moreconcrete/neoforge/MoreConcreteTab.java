package com.autovw.moreconcrete.neoforge;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.common.common.ColourUtil;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * @author Autovw
 */
@EventBusSubscriber(modid = MoreConcrete.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class MoreConcreteTab
{
    static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreConcrete.MOD_ID);
    static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MoreConcrete.MOD_ID + ".tab"))
            .icon(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS::toStack)
            .build());

    private MoreConcreteTab()
    {
    }

    @SubscribeEvent
    public static void onBuildCreativeModeTabContentsEvent(final BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS))
        {
            ColourUtil.sortTab(ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).filter(predicate -> {
                return predicate instanceof SlabBlock || predicate instanceof StairBlock ||
                        predicate instanceof WallBlock || predicate instanceof FenceBlock;
            })).forEach(event::accept);
        }

        if (event.getTabKey().equals(CreativeModeTabs.REDSTONE_BLOCKS))
        {
            ColourUtil.sortTab(ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get).filter(predicate -> {
                return predicate instanceof LeverBlock || predicate instanceof PressurePlateBlock ||
                        predicate instanceof FenceGateBlock || predicate instanceof ButtonBlock;
            })).forEach(event::accept);
        }

        if (event.getTab().equals(TAB.get()))
        {
            ColourUtil.sortConcreteTab(ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)).forEach(event::accept);
        }
    }
}
