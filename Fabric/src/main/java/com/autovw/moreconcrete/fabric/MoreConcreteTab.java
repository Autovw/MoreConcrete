package com.autovw.moreconcrete.fabric;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.common.common.ColourUtil;
import com.autovw.moreconcrete.fabric.core.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;

/**
 * @author Autovw
 */
public final class MoreConcreteTab
{
    public static void init()
    {
        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MoreConcrete.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
                        .icon(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem()::getDefaultInstance)
                        .title(Component.translatable("itemGroup." + MoreConcrete.MOD_ID + ".tab"))
                        .build());

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register((itemGroup) -> {
            ColourUtil.sortTab(BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID)))
                    .filter(predicate -> {
                return predicate instanceof SlabBlock || predicate instanceof StairBlock ||
                        predicate instanceof WallBlock || predicate instanceof FenceBlock;
            }).forEach(itemGroup::accept);
        });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register((itemGroup) -> {
            ColourUtil.sortTab(BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID)))
                    .filter(predicate -> {
                        return predicate instanceof LeverBlock || predicate instanceof PressurePlateBlock ||
                                predicate instanceof FenceGateBlock || predicate instanceof ButtonBlock;
                    }).forEach(itemGroup::accept);
        });

        ItemGroupEvents.modifyEntriesEvent(tab).register((itemGroup) -> {
            ColourUtil.sortConcreteTab(BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID)))
                    .forEach(itemGroup::accept);
        });
    }
}
