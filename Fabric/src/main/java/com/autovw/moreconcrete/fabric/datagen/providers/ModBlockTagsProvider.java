package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.common.core.util.ModTags;
import com.autovw.moreconcrete.fabric.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider
{
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        // Slabs
        tag(ModTags.MOD_SLABS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_SLAB.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_SLAB.builtInRegistryHolder().key());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_SLABS);
        tag(BlockTags.SLABS).addTag(ModTags.MOD_SLABS);

        // Stairs
        tag(ModTags.MOD_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_STAIRS.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_STAIRS.builtInRegistryHolder().key());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_STAIRS);
        tag(BlockTags.STAIRS).addTag(ModTags.MOD_STAIRS);

        // Walls
        tag(ModTags.MOD_WALLS)
                .add(ModBlocks.WHITE_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_WALL.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_WALL.builtInRegistryHolder().key());
        // Walls are added to the vanilla walls tag
        tag(BlockTags.WALLS).addTag(ModTags.MOD_WALLS);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_WALLS);

        // Levers
        tag(ModTags.MOD_LEVERS)
                .add(ModBlocks.WHITE_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_LEVER.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_LEVER.builtInRegistryHolder().key());

        // Pressure Plates
        tag(ModTags.MOD_PRESSURE_PLATES)
                .add(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.builtInRegistryHolder().key());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_PRESSURE_PLATES);
        tag(BlockTags.PRESSURE_PLATES).addTag(ModTags.MOD_PRESSURE_PLATES);

        // Fences
        tag(ModTags.MOD_FENCES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_FENCE.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_FENCE.builtInRegistryHolder().key());
        // Fences are added to the vanilla fences tag
        tag(BlockTags.FENCES).addTag(ModTags.MOD_FENCES);
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCES);

        // Fence Gates
        tag(ModTags.MOD_FENCE_GATES)
                .add(ModBlocks.WHITE_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_FENCE_GATE.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_FENCE_GATE.builtInRegistryHolder().key());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_FENCE_GATES);
        tag(BlockTags.FENCE_GATES).addTag(ModTags.MOD_FENCE_GATES);

        // Buttons
        tag(ModTags.MOD_BUTTONS)
                .add(ModBlocks.WHITE_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.ORANGE_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.MAGENTA_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.YELLOW_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.LIME_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.PINK_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.GRAY_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.CYAN_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.PURPLE_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.BLUE_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.BROWN_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.GREEN_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.RED_CONCRETE_BUTTON.builtInRegistryHolder().key())
                .add(ModBlocks.BLACK_CONCRETE_BUTTON.builtInRegistryHolder().key());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(ModTags.MOD_BUTTONS);
        tag(BlockTags.BUTTONS).addTag(ModTags.MOD_BUTTONS);
    }
}
