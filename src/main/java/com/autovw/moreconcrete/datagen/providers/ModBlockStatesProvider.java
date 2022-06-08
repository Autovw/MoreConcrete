package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MoreConcrete.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        slabBlock(ModBlocks.WHITE_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.ORANGE_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.YELLOW_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.LIME_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.PINK_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.GRAY_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.CYAN_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.PURPLE_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.BLUE_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.BROWN_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.GREEN_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.RED_CONCRETE_SLAB.get());
        slabBlock(ModBlocks.BLACK_CONCRETE_SLAB.get());

        stairsBlock(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.LIME_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.PINK_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.RED_CONCRETE_STAIRS.get());
        stairsBlock(ModBlocks.BLACK_CONCRETE_STAIRS.get());

        wallBlock(ModBlocks.WHITE_CONCRETE_WALL.get());
        wallBlock(ModBlocks.ORANGE_CONCRETE_WALL.get());
        wallBlock(ModBlocks.MAGENTA_CONCRETE_WALL.get());
        wallBlock(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        wallBlock(ModBlocks.YELLOW_CONCRETE_WALL.get());
        wallBlock(ModBlocks.LIME_CONCRETE_WALL.get());
        wallBlock(ModBlocks.PINK_CONCRETE_WALL.get());
        wallBlock(ModBlocks.GRAY_CONCRETE_WALL.get());
        wallBlock(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        wallBlock(ModBlocks.CYAN_CONCRETE_WALL.get());
        wallBlock(ModBlocks.PURPLE_CONCRETE_WALL.get());
        wallBlock(ModBlocks.BLUE_CONCRETE_WALL.get());
        wallBlock(ModBlocks.BROWN_CONCRETE_WALL.get());
        wallBlock(ModBlocks.GREEN_CONCRETE_WALL.get());
        wallBlock(ModBlocks.RED_CONCRETE_WALL.get());
        wallBlock(ModBlocks.BLACK_CONCRETE_WALL.get());

        leverBlock(ModBlocks.WHITE_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.ORANGE_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.YELLOW_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.LIME_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.PINK_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.GRAY_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.CYAN_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.PURPLE_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.BLUE_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.BROWN_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.GREEN_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.RED_CONCRETE_LEVER.get());
        leverBlock(ModBlocks.BLACK_CONCRETE_LEVER.get());

        pressurePlateBlock(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
        pressurePlateBlock(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());

        fenceBlock(ModBlocks.WHITE_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.ORANGE_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.MAGENTA_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.YELLOW_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.LIME_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.PINK_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.GRAY_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.CYAN_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.PURPLE_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.BLUE_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.BROWN_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.GREEN_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.RED_CONCRETE_FENCE.get());
        fenceBlock(ModBlocks.BLACK_CONCRETE_FENCE.get());

        fenceGateBlock(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.LIME_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.PINK_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.RED_CONCRETE_FENCE_GATE.get());
        fenceGateBlock(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());

        buttonBlock(ModBlocks.WHITE_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.LIME_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.PINK_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.GRAY_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.CYAN_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.BLUE_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.BROWN_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.GREEN_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.RED_CONCRETE_BUTTON.get());
        buttonBlock(ModBlocks.BLACK_CONCRETE_BUTTON.get());
    }

    public void slabBlock(Block slab) {
        String slabPath = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(slab)).getPath();
        String parent = slabPath.replace("_slab", "");
        ResourceLocation txt = new ResourceLocation("block/" + parent);
        slabBlock((SlabBlock) slab, txt, txt, txt, txt);
        itemModels().withExistingParent(slabPath, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(slab).getNamespace(), "block/" + slabPath));
    }

    public void stairsBlock(Block stairs) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(stairs)).getPath();
        String parent = path.replace("_stairs", "");
        ResourceLocation txt = new ResourceLocation("block/" + parent);
        stairsBlock((StairBlock) stairs, txt);
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(stairs).getNamespace(), "block/" + path));
    }

    public void wallBlock(Block wall) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(wall)).getPath();
        String parent = path.replace("_wall", "");
        ResourceLocation txt = new ResourceLocation("block/" + parent);
        wallBlock((WallBlock) wall, txt);
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(wall).getNamespace(), "block/" + path + "_post"));
        itemModels().wallInventory(path, new ResourceLocation("block/" + parent));
    }

    /**
     * Helper method for registering blockstates/models for levers.
     *
     * @param lever Lever block
     */
    public void leverBlock(Block lever) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(lever)).getPath();
        String parent = path.replace("_lever", "");
        ResourceLocation texture = mcLoc("block/" + parent);

        // Creates lever_model model file
        BlockModelBuilder leverModel = models().withExistingParent(path, new ResourceLocation(MoreConcrete.MODID, "block/lever_model")).texture("base", texture);
        // Creates lever_model_on model file
        BlockModelBuilder leverModelOn = models().withExistingParent(path + "_on", new ResourceLocation(MoreConcrete.MODID, "block/lever_model_on")).texture("base", texture);

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

        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(lever).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for pressure plates.
     *
     * @param pressurePlate Registered pressure plate
     */
    public void pressurePlateBlock(Block pressurePlate) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(pressurePlate)).getPath();
        String parent = path.replace("_pressure_plate", "");
        ResourceLocation texture = mcLoc("block/" + parent);

        // Creates pressure plate model file
        BlockModelBuilder pressurePlateModel = models().withExistingParent(path, mcLoc("block/pressure_plate_up")).texture("texture", texture);
        // Creates pressure plate down model file
        BlockModelBuilder pressurePlateModelDown = models().withExistingParent(path + "_down", mcLoc("block/pressure_plate_down")).texture("texture", texture);

        getVariantBuilder(pressurePlate)
                .partialState().with(PressurePlateBlock.POWERED, true).addModels(new ConfiguredModel(pressurePlateModelDown))
                .partialState().with(PressurePlateBlock.POWERED, false).addModels(new ConfiguredModel(pressurePlateModel));

        // item model
        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(pressurePlate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for fences.
     *
     * @param fence Registered fence
     */
    public void fenceBlock(Block fence) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(fence)).getPath();
        String parent = path.replace("_fence", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceBlock((FenceBlock) fence, txt);

        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(fence).getNamespace(), "block/" + path + "_post"));
        itemModels().fenceInventory(path, txt);
    }

    /**
     * Helper method for registering blockstates/models for fence gates.
     *
     * @param fenceGate Registered fence gate
     */
    public void fenceGateBlock(Block fenceGate) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(fenceGate)).getPath();
        String parent = path.replace("_fence_gate", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceGateBlock((FenceGateBlock) fenceGate, txt);

        itemModels().withExistingParent(path, new ResourceLocation(ForgeRegistries.BLOCKS.getKey(fenceGate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for creating blockstates and models for buttons
     *
     * @param button Registered button block
     */
    public void buttonBlock(Block button) {
        String path = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(button)).getPath();
        String parent = path.replace("_button", "");
        ResourceLocation txt = mcLoc("block/" + parent);

        BlockModelBuilder buttonModel = models().withExistingParent(path, mcLoc("block/button")).texture("texture", txt);
        BlockModelBuilder buttonModelPressed = models().withExistingParent(path + "_pressed", mcLoc("block/button_pressed")).texture("texture", txt);
        BlockModelBuilder buttonModelInventory = models().withExistingParent(path + "_inventory", mcLoc("block/button_inventory")).texture("texture", txt);

        getVariantBuilder(button).forAllStates((blockState -> {
            Direction facing = blockState.getValue(ButtonBlock.FACING);
            AttachFace face = blockState.getValue(ButtonBlock.FACE);
            boolean powered = blockState.getValue(ButtonBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? buttonModelPressed : buttonModel)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .uvLock(face == AttachFace.WALL).build();
        }));

        itemModels().withExistingParent(path, buttonModelInventory.getLocation()); // item model
    }
}
