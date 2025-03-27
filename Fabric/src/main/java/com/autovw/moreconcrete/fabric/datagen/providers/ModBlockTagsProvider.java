package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.common.core.util.ModTags;
import com.autovw.moreconcrete.fabric.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        // Slabs
        getOrCreateTagBuilder(ModTags.MOD_SLABS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_SLAB);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_SLABS);
        getOrCreateTagBuilder(BlockTags.SLABS).addTag(ModTags.MOD_SLABS);

        // Stairs
        getOrCreateTagBuilder(ModTags.MOD_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModBlocks.RED_CONCRETE_STAIRS)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_STAIRS);
        getOrCreateTagBuilder(BlockTags.STAIRS).addTag(ModTags.MOD_STAIRS);

        // Walls
        getOrCreateTagBuilder(ModTags.MOD_WALLS)
                .add(ModBlocks.WHITE_CONCRETE_WALL)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)
                .add(ModBlocks.LIME_CONCRETE_WALL)
                .add(ModBlocks.PINK_CONCRETE_WALL)
                .add(ModBlocks.GRAY_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)
                .add(ModBlocks.BLUE_CONCRETE_WALL)
                .add(ModBlocks.BROWN_CONCRETE_WALL)
                .add(ModBlocks.GREEN_CONCRETE_WALL)
                .add(ModBlocks.RED_CONCRETE_WALL)
                .add(ModBlocks.BLACK_CONCRETE_WALL);
        // Walls are added to the vanilla walls getOrCreateTagBuilder
        getOrCreateTagBuilder(BlockTags.WALLS).addTag(ModTags.MOD_WALLS);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_WALLS);

        // Levers
        getOrCreateTagBuilder(ModTags.MOD_LEVERS)
                .add(ModBlocks.WHITE_CONCRETE_LEVER)
                .add(ModBlocks.ORANGE_CONCRETE_LEVER)
                .add(ModBlocks.MAGENTA_CONCRETE_LEVER)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER)
                .add(ModBlocks.YELLOW_CONCRETE_LEVER)
                .add(ModBlocks.LIME_CONCRETE_LEVER)
                .add(ModBlocks.PINK_CONCRETE_LEVER)
                .add(ModBlocks.GRAY_CONCRETE_LEVER)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER)
                .add(ModBlocks.CYAN_CONCRETE_LEVER)
                .add(ModBlocks.PURPLE_CONCRETE_LEVER)
                .add(ModBlocks.BLUE_CONCRETE_LEVER)
                .add(ModBlocks.BROWN_CONCRETE_LEVER)
                .add(ModBlocks.GREEN_CONCRETE_LEVER)
                .add(ModBlocks.RED_CONCRETE_LEVER)
                .add(ModBlocks.BLACK_CONCRETE_LEVER);

        // Pressure Plates
        getOrCreateTagBuilder(ModTags.MOD_PRESSURE_PLATES)
                .add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_PRESSURE_PLATES);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).addTag(ModTags.MOD_PRESSURE_PLATES);

        // Fences
        getOrCreateTagBuilder(ModTags.MOD_FENCES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE)
                .add(ModBlocks.ORANGE_CONCRETE_FENCE)
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE)
                .add(ModBlocks.YELLOW_CONCRETE_FENCE)
                .add(ModBlocks.LIME_CONCRETE_FENCE)
                .add(ModBlocks.PINK_CONCRETE_FENCE)
                .add(ModBlocks.GRAY_CONCRETE_FENCE)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE)
                .add(ModBlocks.CYAN_CONCRETE_FENCE)
                .add(ModBlocks.PURPLE_CONCRETE_FENCE)
                .add(ModBlocks.BLUE_CONCRETE_FENCE)
                .add(ModBlocks.BROWN_CONCRETE_FENCE)
                .add(ModBlocks.GREEN_CONCRETE_FENCE)
                .add(ModBlocks.RED_CONCRETE_FENCE)
                .add(ModBlocks.BLACK_CONCRETE_FENCE);
        // Fences are added to the vanilla fences getOrCreateTagBuilder
        getOrCreateTagBuilder(BlockTags.FENCES).addTag(ModTags.MOD_FENCES);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCES);

        // Fence Gates
        getOrCreateTagBuilder(ModTags.MOD_FENCE_GATES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE_GATE)
                .add(ModBlocks.ORANGE_CONCRETE_FENCE_GATE)
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE)
                .add(ModBlocks.YELLOW_CONCRETE_FENCE_GATE)
                .add(ModBlocks.LIME_CONCRETE_FENCE_GATE)
                .add(ModBlocks.PINK_CONCRETE_FENCE_GATE)
                .add(ModBlocks.GRAY_CONCRETE_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE)
                .add(ModBlocks.CYAN_CONCRETE_FENCE_GATE)
                .add(ModBlocks.PURPLE_CONCRETE_FENCE_GATE)
                .add(ModBlocks.BLUE_CONCRETE_FENCE_GATE)
                .add(ModBlocks.BROWN_CONCRETE_FENCE_GATE)
                .add(ModBlocks.GREEN_CONCRETE_FENCE_GATE)
                .add(ModBlocks.RED_CONCRETE_FENCE_GATE)
                .add(ModBlocks.BLACK_CONCRETE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCE_GATES);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).addTag(ModTags.MOD_FENCE_GATES);

        // Buttons
        getOrCreateTagBuilder(ModTags.MOD_BUTTONS)
                .add(ModBlocks.WHITE_CONCRETE_BUTTON)
                .add(ModBlocks.ORANGE_CONCRETE_BUTTON)
                .add(ModBlocks.MAGENTA_CONCRETE_BUTTON)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON)
                .add(ModBlocks.YELLOW_CONCRETE_BUTTON)
                .add(ModBlocks.LIME_CONCRETE_BUTTON)
                .add(ModBlocks.PINK_CONCRETE_BUTTON)
                .add(ModBlocks.GRAY_CONCRETE_BUTTON)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON)
                .add(ModBlocks.CYAN_CONCRETE_BUTTON)
                .add(ModBlocks.PURPLE_CONCRETE_BUTTON)
                .add(ModBlocks.BLUE_CONCRETE_BUTTON)
                .add(ModBlocks.BROWN_CONCRETE_BUTTON)
                .add(ModBlocks.GREEN_CONCRETE_BUTTON)
                .add(ModBlocks.RED_CONCRETE_BUTTON)
                .add(ModBlocks.BLACK_CONCRETE_BUTTON);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_BUTTONS);
        getOrCreateTagBuilder(BlockTags.BUTTONS).addTag(ModTags.MOD_BUTTONS);
    }
}
