package com.autovw.moreconcrete;

import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static com.autovw.moreconcrete.MoreConcrete.MODID;

/**
 * @author Autovw
 */
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreConcreteTab {
    private MoreConcreteTab() {
    }

    @SubscribeEvent
    public static void onCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTab().equals(CreativeModeTabs.COLORED_BLOCKS)) {
            ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(predicate -> {
                return predicate instanceof SlabBlock || predicate instanceof StairBlock ||
                        predicate instanceof WallBlock || predicate instanceof FenceBlock;
            }).forEach(event::accept);
        }

        if (event.getTab().equals(CreativeModeTabs.REDSTONE_BLOCKS)) {
            ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(predicate -> {
                return predicate instanceof LeverBlock || predicate instanceof PressurePlateBlock ||
                        predicate instanceof FenceGateBlock || predicate instanceof ButtonBlock;
            }).forEach(event::accept);
        }
    }
}
