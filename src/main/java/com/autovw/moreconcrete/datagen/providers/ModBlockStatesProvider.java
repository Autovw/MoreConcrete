package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.data.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;
import java.util.function.Consumer;

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

        stairsBlock((StairsBlock) ModBlocks.WHITE_CONCRETE_STAIRS.get(), new ResourceLocation("block/white_concrete"));
        stairsBlock((StairsBlock) ModBlocks.ORANGE_CONCRETE_STAIRS.get(), new ResourceLocation("block/orange_concrete"));
        stairsBlock((StairsBlock) ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), new ResourceLocation("block/magenta_concrete"));
        stairsBlock((StairsBlock) ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), new ResourceLocation("block/light_blue_concrete"));
        stairsBlock((StairsBlock) ModBlocks.YELLOW_CONCRETE_STAIRS.get(), new ResourceLocation("block/yellow_concrete"));
        stairsBlock((StairsBlock) ModBlocks.LIME_CONCRETE_STAIRS.get(), new ResourceLocation("block/lime_concrete"));
        stairsBlock((StairsBlock) ModBlocks.PINK_CONCRETE_STAIRS.get(), new ResourceLocation("block/pink_concrete"));
        stairsBlock((StairsBlock) ModBlocks.GRAY_CONCRETE_STAIRS.get(), new ResourceLocation("block/gray_concrete"));
        stairsBlock((StairsBlock) ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), new ResourceLocation("block/light_gray_concrete"));
        stairsBlock((StairsBlock) ModBlocks.CYAN_CONCRETE_STAIRS.get(), new ResourceLocation("block/cyan_concrete"));
        stairsBlock((StairsBlock) ModBlocks.PURPLE_CONCRETE_STAIRS.get(), new ResourceLocation("block/purple_concrete"));
        stairsBlock((StairsBlock) ModBlocks.BLUE_CONCRETE_STAIRS.get(), new ResourceLocation("block/blue_concrete"));
        stairsBlock((StairsBlock) ModBlocks.BROWN_CONCRETE_STAIRS.get(), new ResourceLocation("block/brown_concrete"));
        stairsBlock((StairsBlock) ModBlocks.GREEN_CONCRETE_STAIRS.get(), new ResourceLocation("block/green_concrete"));
        stairsBlock((StairsBlock) ModBlocks.RED_CONCRETE_STAIRS.get(), new ResourceLocation("block/red_concrete"));
        stairsBlock((StairsBlock) ModBlocks.BLACK_CONCRETE_STAIRS.get(), new ResourceLocation("block/black_concrete"));

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

        leverBlock(ModBlocks.WHITE_CONCRETE_LEVER.get(), "white");
        leverBlock(ModBlocks.ORANGE_CONCRETE_LEVER.get(), "orange");
        leverBlock(ModBlocks.MAGENTA_CONCRETE_LEVER.get(), "magenta");
        leverBlock(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), "light_blue");
        leverBlock(ModBlocks.YELLOW_CONCRETE_LEVER.get(), "yellow");
        leverBlock(ModBlocks.LIME_CONCRETE_LEVER.get(), "lime");
        leverBlock(ModBlocks.PINK_CONCRETE_LEVER.get(), "pink");
        leverBlock(ModBlocks.GRAY_CONCRETE_LEVER.get(), "gray");
        leverBlock(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), "light_gray");
        leverBlock(ModBlocks.CYAN_CONCRETE_LEVER.get(), "cyan");
        leverBlock(ModBlocks.PURPLE_CONCRETE_LEVER.get(), "purple");
        leverBlock(ModBlocks.BLUE_CONCRETE_LEVER.get(), "blue");
        leverBlock(ModBlocks.BROWN_CONCRETE_LEVER.get(), "brown");
        leverBlock(ModBlocks.GREEN_CONCRETE_LEVER.get(), "green");
        leverBlock(ModBlocks.RED_CONCRETE_LEVER.get(), "red");
        leverBlock(ModBlocks.BLACK_CONCRETE_LEVER.get(), "black");
    }

    /**
     * Helper method for registering blockstates/models for levers.
     *
     * @param lever Registered lever
     * @param concreteColor Color of the concrete texture ("block/{color}_concrete")
     */
    public void leverBlock(Block lever, String concreteColor) {
        ResourceLocation texture = mcLoc("block/" + concreteColor + "_concrete");

        // Creates lever_model model file
        BlockModelBuilder leverModel = models().withExistingParent(Objects.requireNonNull(lever.getRegistryName()).getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lever_model")).texture("particle", texture).texture("base", texture);
        // Creates lever_model_on model file
        BlockModelBuilder leverModelOn = models().withExistingParent(lever.getRegistryName().getPath() + "_on", new ResourceLocation(MoreConcrete.MODID, "block/lever_model_on")).texture("particle", texture).texture("base", texture);

        getVariantBuilder(lever).forAllStates(blockState -> {
            Direction facing = blockState.getValue(LeverBlock.FACING);
            AttachFace face = blockState.getValue(LeverBlock.FACE);
            boolean powered = blockState.getValue(LeverBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? leverModel : leverModelOn)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .build();
        });
    }
}
