package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Autovw
 */
public class ModLootTableProvider extends LootTableProvider {
    private final List<SubProviderEntry> tables = List.of(new LootTableProvider.SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK));

    public ModLootTableProvider(PackOutput packOutput) {
        super(packOutput, Set.of(), VanillaLootTableProvider.create(packOutput).getTables());
    }

    @Override
    public List<SubProviderEntry> getTables() {
        return this.tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext context) {}

    private static class ModBlockLootSubProvider extends BlockLootSubProvider {
        protected ModBlockLootSubProvider() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            this.add(ModBlocks.WHITE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.ORANGE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.YELLOW_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIME_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PINK_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.CYAN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.PURPLE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLUE_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BROWN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.GREEN_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.RED_CONCRETE_SLAB.get(), this::createSlabItemTable);
            this.add(ModBlocks.BLACK_CONCRETE_SLAB.get(), this::createSlabItemTable);

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

            this.dropSelf(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());

            this.dropSelf(ModBlocks.WHITE_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_FENCE.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_FENCE.get());

            this.dropSelf(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_FENCE_GATE.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());

            this.dropSelf(ModBlocks.WHITE_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.LIME_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.PINK_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.GRAY_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.CYAN_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.BLUE_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.BROWN_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.GREEN_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.RED_CONCRETE_BUTTON.get());
            this.dropSelf(ModBlocks.BLACK_CONCRETE_BUTTON.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
