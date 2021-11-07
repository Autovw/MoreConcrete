package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MoreConcrete.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        slabBlock((SlabBlock) ModBlocks.WHITE_CONCRETE_SLAB.get(), new ResourceLocation("block/white_concrete"), new ResourceLocation("block/white_concrete"), new ResourceLocation("block/white_concrete"), new ResourceLocation("block/white_concrete"));
        slabBlock((SlabBlock) ModBlocks.ORANGE_CONCRETE_SLAB.get(), new ResourceLocation("block/orange_concrete"), new ResourceLocation("block/orange_concrete"), new ResourceLocation("block/orange_concrete"), new ResourceLocation("block/orange_concrete"));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_CONCRETE_SLAB.get(), new ResourceLocation("block/magenta_concrete"), new ResourceLocation("block/magenta_concrete"), new ResourceLocation("block/magenta_concrete"), new ResourceLocation("block/magenta_concrete"));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), new ResourceLocation("block/light_blue_concrete"), new ResourceLocation("block/light_blue_concrete"), new ResourceLocation("block/light_blue_concrete"), new ResourceLocation("block/light_blue_concrete"));
        slabBlock((SlabBlock) ModBlocks.YELLOW_CONCRETE_SLAB.get(), new ResourceLocation("block/yellow_concrete"), new ResourceLocation("block/yellow_concrete"), new ResourceLocation("block/yellow_concrete"), new ResourceLocation("block/yellow_concrete"));
        slabBlock((SlabBlock) ModBlocks.LIME_CONCRETE_SLAB.get(), new ResourceLocation("block/lime_concrete"), new ResourceLocation("block/lime_concrete"), new ResourceLocation("block/lime_concrete"), new ResourceLocation("block/lime_concrete"));
        slabBlock((SlabBlock) ModBlocks.PINK_CONCRETE_SLAB.get(), new ResourceLocation("block/pink_concrete"), new ResourceLocation("block/pink_concrete"), new ResourceLocation("block/pink_concrete"), new ResourceLocation("block/pink_concrete"));
        slabBlock((SlabBlock) ModBlocks.GRAY_CONCRETE_SLAB.get(), new ResourceLocation("block/gray_concrete"), new ResourceLocation("block/gray_concrete"), new ResourceLocation("block/gray_concrete"), new ResourceLocation("block/gray_concrete"));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), new ResourceLocation("block/light_gray_concrete"), new ResourceLocation("block/light_gray_concrete"), new ResourceLocation("block/light_gray_concrete"), new ResourceLocation("block/light_gray_concrete"));
        slabBlock((SlabBlock) ModBlocks.CYAN_CONCRETE_SLAB.get(), new ResourceLocation("block/cyan_concrete"), new ResourceLocation("block/cyan_concrete"), new ResourceLocation("block/cyan_concrete"), new ResourceLocation("block/cyan_concrete"));
        slabBlock((SlabBlock) ModBlocks.PURPLE_CONCRETE_SLAB.get(), new ResourceLocation("block/purple_concrete"), new ResourceLocation("block/purple_concrete"), new ResourceLocation("block/purple_concrete"), new ResourceLocation("block/purple_concrete"));
        slabBlock((SlabBlock) ModBlocks.BLUE_CONCRETE_SLAB.get(), new ResourceLocation("block/blue_concrete"), new ResourceLocation("block/blue_concrete"), new ResourceLocation("block/blue_concrete"), new ResourceLocation("block/blue_concrete"));
        slabBlock((SlabBlock) ModBlocks.BROWN_CONCRETE_SLAB.get(), new ResourceLocation("block/brown_concrete"), new ResourceLocation("block/brown_concrete"), new ResourceLocation("block/brown_concrete"), new ResourceLocation("block/brown_concrete"));
        slabBlock((SlabBlock) ModBlocks.GREEN_CONCRETE_SLAB.get(), new ResourceLocation("block/green_concrete"), new ResourceLocation("block/green_concrete"), new ResourceLocation("block/green_concrete"), new ResourceLocation("block/green_concrete"));
        slabBlock((SlabBlock) ModBlocks.RED_CONCRETE_SLAB.get(), new ResourceLocation("block/red_concrete"), new ResourceLocation("block/red_concrete"), new ResourceLocation("block/red_concrete"), new ResourceLocation("block/red_concrete"));
        slabBlock((SlabBlock) ModBlocks.BLACK_CONCRETE_SLAB.get(), new ResourceLocation("block/black_concrete"), new ResourceLocation("block/black_concrete"), new ResourceLocation("block/black_concrete"), new ResourceLocation("block/black_concrete"));

        stairsBlock((StairBlock) ModBlocks.WHITE_CONCRETE_STAIRS.get(), new ResourceLocation("block/white_concrete"));
        stairsBlock((StairBlock) ModBlocks.ORANGE_CONCRETE_STAIRS.get(), new ResourceLocation("block/orange_concrete"));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), new ResourceLocation("block/magenta_concrete"));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), new ResourceLocation("block/light_blue_concrete"));
        stairsBlock((StairBlock) ModBlocks.YELLOW_CONCRETE_STAIRS.get(), new ResourceLocation("block/yellow_concrete"));
        stairsBlock((StairBlock) ModBlocks.LIME_CONCRETE_STAIRS.get(), new ResourceLocation("block/lime_concrete"));
        stairsBlock((StairBlock) ModBlocks.PINK_CONCRETE_STAIRS.get(), new ResourceLocation("block/pink_concrete"));
        stairsBlock((StairBlock) ModBlocks.GRAY_CONCRETE_STAIRS.get(), new ResourceLocation("block/gray_concrete"));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), new ResourceLocation("block/light_gray_concrete"));
        stairsBlock((StairBlock) ModBlocks.CYAN_CONCRETE_STAIRS.get(), new ResourceLocation("block/cyan_concrete"));
        stairsBlock((StairBlock) ModBlocks.PURPLE_CONCRETE_STAIRS.get(), new ResourceLocation("block/purple_concrete"));
        stairsBlock((StairBlock) ModBlocks.BLUE_CONCRETE_STAIRS.get(), new ResourceLocation("block/blue_concrete"));
        stairsBlock((StairBlock) ModBlocks.BROWN_CONCRETE_STAIRS.get(), new ResourceLocation("block/brown_concrete"));
        stairsBlock((StairBlock) ModBlocks.GREEN_CONCRETE_STAIRS.get(), new ResourceLocation("block/green_concrete"));
        stairsBlock((StairBlock) ModBlocks.RED_CONCRETE_STAIRS.get(), new ResourceLocation("block/red_concrete"));
        stairsBlock((StairBlock) ModBlocks.BLACK_CONCRETE_STAIRS.get(), new ResourceLocation("block/black_concrete"));

        wallBlock((WallBlock) ModBlocks.WHITE_CONCRETE_WALL.get(), new ResourceLocation("block/white_concrete"));
        wallBlock((WallBlock) ModBlocks.ORANGE_CONCRETE_WALL.get(), new ResourceLocation("block/orange_concrete"));
        wallBlock((WallBlock) ModBlocks.MAGENTA_CONCRETE_WALL.get(), new ResourceLocation("block/magenta_concrete"));
        wallBlock((WallBlock) ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), new ResourceLocation("block/light_blue_concrete"));
        wallBlock((WallBlock) ModBlocks.YELLOW_CONCRETE_WALL.get(), new ResourceLocation("block/yellow_concrete"));
        wallBlock((WallBlock) ModBlocks.LIME_CONCRETE_WALL.get(), new ResourceLocation("block/lime_concrete"));
        wallBlock((WallBlock) ModBlocks.PINK_CONCRETE_WALL.get(), new ResourceLocation("block/pink_concrete"));
        wallBlock((WallBlock) ModBlocks.GRAY_CONCRETE_WALL.get(), new ResourceLocation("block/gray_concrete"));
        wallBlock((WallBlock) ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), new ResourceLocation("block/light_gray_concrete"));
        wallBlock((WallBlock) ModBlocks.CYAN_CONCRETE_WALL.get(), new ResourceLocation("block/cyan_concrete"));
        wallBlock((WallBlock) ModBlocks.PURPLE_CONCRETE_WALL.get(), new ResourceLocation("block/purple_concrete"));
        wallBlock((WallBlock) ModBlocks.BLUE_CONCRETE_WALL.get(), new ResourceLocation("block/blue_concrete"));
        wallBlock((WallBlock) ModBlocks.BROWN_CONCRETE_WALL.get(), new ResourceLocation("block/brown_concrete"));
        wallBlock((WallBlock) ModBlocks.GREEN_CONCRETE_WALL.get(), new ResourceLocation("block/green_concrete"));
        wallBlock((WallBlock) ModBlocks.RED_CONCRETE_WALL.get(), new ResourceLocation("block/red_concrete"));
        wallBlock((WallBlock) ModBlocks.BLACK_CONCRETE_WALL.get(), new ResourceLocation("block/black_concrete"));
    }
}
