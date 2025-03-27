package com.autovw.moreconcrete.forge;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.common.common.ColourUtil;
import com.autovw.moreconcrete.forge.core.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.autovw.moreconcrete.common.MoreConcrete.MOD_ID;

/**
 * @author Autovw
 */
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class MoreConcreteTab
{
    static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreConcrete.MOD_ID);
    static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MoreConcrete.MOD_ID + ".tab"))
            .icon(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem()::getDefaultInstance)
            .build());

    private MoreConcreteTab()
    {
    }

    @SubscribeEvent
    public static void onCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS))
        {
            ColourUtil.sortTab(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(predicate -> {
                return predicate instanceof SlabBlock || predicate instanceof StairBlock ||
                        predicate instanceof WallBlock || predicate instanceof FenceBlock;
            })).forEach(event::accept);
        }

        if (event.getTabKey().equals(CreativeModeTabs.REDSTONE_BLOCKS))
        {
            ColourUtil.sortTab(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(predicate -> {
                return predicate instanceof LeverBlock || predicate instanceof PressurePlateBlock ||
                        predicate instanceof FenceGateBlock || predicate instanceof ButtonBlock;
            })).forEach(event::accept);
        }

        if (event.getTab().equals(TAB.get()))
        {
            ColourUtil.sortConcreteTab(ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)).forEach(event::accept);
        }
    }
}
