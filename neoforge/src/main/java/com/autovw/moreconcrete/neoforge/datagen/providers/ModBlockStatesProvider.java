package com.autovw.moreconcrete.neoforge.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Objects;

/**
 * @author Autovw
 */
public class ModBlockStatesProvider extends BlockStateProvider
{
    public ModBlockStatesProvider(PackOutput packOutput, ExistingFileHelper exFileHelper)
    {
        super(packOutput, MoreConcrete.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof SlabBlock)
                .forEach(this::slabBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof StairBlock)
                .forEach(this::stairsBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof WallBlock)
                .forEach(this::wallBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof LeverBlock)
                .forEach(this::leverBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof PressurePlateBlock)
                .forEach(this::pressurePlateBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof FenceBlock)
                .forEach(this::fenceBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof FenceGateBlock)
                .forEach(this::fenceGateBlock);

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof ButtonBlock)
                .forEach(this::buttonBlock);
    }

    public void slabBlock(Block slab)
    {
        String slabPath = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(slab)).getPath();
        String parent = slabPath.replace("_slab", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);
        slabBlock((SlabBlock) slab, txt, txt, txt, txt);
        itemModels().withExistingParent(slabPath, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(slab).getNamespace(), "block/" + slabPath));
    }

    public void stairsBlock(Block stairs)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(stairs)).getPath();
        String parent = path.replace("_stairs", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);
        stairsBlock((StairBlock) stairs, txt);
        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(stairs).getNamespace(), "block/" + path));
    }

    public void wallBlock(Block wall)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(wall)).getPath();
        String parent = path.replace("_wall", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);
        wallBlock((WallBlock) wall, txt);
        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(wall).getNamespace(), "block/" + path + "_post"));
        itemModels().wallInventory(path, ResourceLocation.withDefaultNamespace("block/" + parent));
    }

    /**
     * Helper method for registering blockstates/models for levers.
     *
     * @param lever Lever block
     */
    public void leverBlock(Block lever)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(lever)).getPath();
        String parent = path.replace("_lever", "");
        ResourceLocation texture = mcLoc("block/" + parent);

        // Creates lever_model model file
        BlockModelBuilder leverModel = models().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "block/lever_model")).texture("base", texture);
        // Creates lever_model_on model file
        BlockModelBuilder leverModelOn = models().withExistingParent(path + "_on", ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "block/lever_model_on")).texture("base", texture);

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
        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(lever).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for pressure plates.
     *
     * @param pressurePlate Registered pressure plate
     */
    public void pressurePlateBlock(Block pressurePlate)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(pressurePlate)).getPath();
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
        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(pressurePlate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for registering blockstates/models for fences.
     *
     * @param fence Registered fence
     */
    public void fenceBlock(Block fence)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fence)).getPath();
        String parent = path.replace("_fence", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceBlock((FenceBlock) fence, txt);

        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(fence).getNamespace(), "block/" + path + "_post"));
        itemModels().fenceInventory(path, txt);
    }

    /**
     * Helper method for registering blockstates/models for fence gates.
     *
     * @param fenceGate Registered fence gate
     */
    public void fenceGateBlock(Block fenceGate)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fenceGate)).getPath();
        String parent = path.replace("_fence_gate", "");
        ResourceLocation txt = mcLoc("block/" + parent);
        fenceGateBlock((FenceGateBlock) fenceGate, txt);

        itemModels().withExistingParent(path, ResourceLocation.fromNamespaceAndPath(BuiltInRegistries.BLOCK.getKey(fenceGate).getNamespace(), "block/" + path));
    }

    /**
     * Helper method for creating blockstates and models for buttons
     *
     * @param button Registered button block
     */
    public void buttonBlock(Block button)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(button)).getPath();
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
