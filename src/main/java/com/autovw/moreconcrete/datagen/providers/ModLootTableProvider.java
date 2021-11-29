package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.core.ModBlocks;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Author: Autovw
 */
public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> tables = ImmutableList.of(Pair.of(ModBlockProvider::new, LootContextParamSets.BLOCK));

    @Override
    public List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return this.tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext context) {}

    private static class ModBlockProvider extends BlockLoot {

        @Override
        protected void addTables() {
            this.add(ModBlocks.WHITE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.LIME_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.PINK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.CYAN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.BLUE_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.BROWN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.GREEN_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.RED_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(ModBlocks.BLACK_CONCRETE_SLAB.get(), BlockLoot::createSlabItemTable);

            this.dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());

            this.dropSelf(ModBlocks.WHITE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_WALL.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_WALL.get());

            this.dropSelf(ModBlocks.WHITE_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_LEVER.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_LEVER.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
