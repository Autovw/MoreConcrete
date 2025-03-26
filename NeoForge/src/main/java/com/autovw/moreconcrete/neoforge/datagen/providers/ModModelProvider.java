package com.autovw.moreconcrete.neoforge.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.*;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Collections;
import java.util.Objects;

/**
 * @author Autovw
 */
public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput packOutput, String modId)
    {
        super(packOutput, modId);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels)
    {
        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof SlabBlock)
                .forEach((block) -> this.slabBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof StairBlock)
                .forEach((block) -> this.stairsBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof WallBlock)
                .forEach((block) -> this.wallBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof LeverBlock)
                .forEach((block) -> this.leverBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof PressurePlateBlock)
                .forEach((block) -> this.pressurePlateBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof FenceBlock)
                .forEach((block) -> this.fenceBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof FenceGateBlock)
                .forEach((block) -> this.fenceGateBlock(blockModels, block));

        ModBlocks.BLOCKS.getEntries().stream().map(DeferredHolder::get)
                .filter(predicate -> predicate instanceof ButtonBlock)
                .forEach((block) -> this.buttonBlock(blockModels, block));
    }

    public void slabBlock(BlockModelGenerators blockModels, Block slab)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(slab));
        String parent = id.getPath().replace("_slab", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.BOTTOM, parentTexture).put(TextureSlot.TOP, parentTexture).put(TextureSlot.SIDE, parentTexture);
        ResourceLocation slabBottomModel = ModelTemplates.SLAB_BOTTOM.create(slab, textureMapping, blockModels.modelOutput);
        ResourceLocation slabTopModel = ModelTemplates.SLAB_TOP.create(slab, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(slab, slabBottomModel, slabTopModel, parentTexture));

        blockModels.itemModelOutput.accept(slab.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void stairsBlock(BlockModelGenerators blockModels, Block stairs)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(stairs));
        String parent = id.getPath().replace("_stairs", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.BOTTOM, parentTexture).put(TextureSlot.SIDE, parentTexture).put(TextureSlot.TOP, parentTexture);
        ResourceLocation stairsInnerModel = ModelTemplates.STAIRS_INNER.create(stairs, textureMapping, blockModels.modelOutput);
        ResourceLocation stairsStraightModel = ModelTemplates.STAIRS_STRAIGHT.create(stairs, textureMapping, blockModels.modelOutput);
        ResourceLocation stairsOuterModel = ModelTemplates.STAIRS_OUTER.create(stairs, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stairs, stairsInnerModel, stairsStraightModel, stairsOuterModel));

        blockModels.itemModelOutput.accept(stairs.asItem(), new BlockModelWrapper.Unbaked(stairsStraightModel, Collections.emptyList()));
    }

    public void wallBlock(BlockModelGenerators blockModels, Block wall)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(wall));
        String parent = id.getPath().replace("_wall", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.WALL, parentTexture);
        ResourceLocation wallPostModel = ModelTemplates.WALL_POST.create(wall, textureMapping, blockModels.modelOutput);
        ResourceLocation wallLowSideModel = ModelTemplates.WALL_LOW_SIDE.create(wall, textureMapping, blockModels.modelOutput);
        ResourceLocation wallTallSideModel = ModelTemplates.WALL_TALL_SIDE.create(wall, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(wall, wallPostModel, wallLowSideModel, wallTallSideModel));

        ResourceLocation wallInventoryModel = ModelTemplates.WALL_INVENTORY.create(wall, textureMapping, blockModels.modelOutput);
        blockModels.itemModelOutput.accept(wall.asItem(), new BlockModelWrapper.Unbaked(wallInventoryModel, Collections.emptyList()));
    }

    public void leverBlock(BlockModelGenerators blockModels, Block lever)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(lever));
        String parent = id.getPath().replace("_lever", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureSlot base = TextureSlot.create("base");
        TextureMapping textureMapping = new TextureMapping().put(base, parentTexture);
        ResourceLocation leverModelLoc = ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "lever_model");
        ResourceLocation leverModelOnLoc = ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "lever_model_on");
        ResourceLocation leverModel = ModelTemplates.create(leverModelLoc.toString(), base).create(lever, textureMapping, blockModels.modelOutput);
        ResourceLocation leverModelOn = ModelTemplates.create(leverModelOnLoc.toString(), "_on", base).create(lever, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(this.createLever(lever, leverModel, leverModelOn));

        blockModels.itemModelOutput.accept(lever.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    private BlockStateGenerator createLever(Block lever, ResourceLocation leverModelLoc, ResourceLocation leverModelOnLoc)
    {
        return MultiVariantGenerator.multiVariant(lever)
                .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.POWERED, leverModelLoc, leverModelOnLoc))
                .with(
                        PropertyDispatch.properties(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING)
                                .select(
                                        AttachFace.CEILING,
                                        Direction.NORTH,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                                )
                                .select(
                                        AttachFace.CEILING,
                                        Direction.EAST,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                                )
                                .select(AttachFace.CEILING, Direction.SOUTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180))
                                .select(
                                        AttachFace.CEILING,
                                        Direction.WEST,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R180)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                                )
                                .select(AttachFace.FLOOR, Direction.NORTH, Variant.variant())
                                .select(AttachFace.FLOOR, Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                                .select(AttachFace.FLOOR, Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                                .select(AttachFace.FLOOR, Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                                .select(AttachFace.WALL, Direction.NORTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90))
                                .select(
                                        AttachFace.WALL,
                                        Direction.EAST,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R90)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                                )
                                .select(
                                        AttachFace.WALL,
                                        Direction.SOUTH,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R90)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                                )
                                .select(
                                        AttachFace.WALL,
                                        Direction.WEST,
                                        Variant.variant()
                                                .with(VariantProperties.X_ROT, VariantProperties.Rotation.R90)
                                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                                )
                );
    }

    public void pressurePlateBlock(BlockModelGenerators blockModels, Block pressurePlate)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(pressurePlate));
        String parent = id.getPath().replace("_pressure_plate", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        ResourceLocation plateModelUp = ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlate, textureMapping, blockModels.modelOutput);
        ResourceLocation plateModelDown = ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlate, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(pressurePlate, plateModelUp, plateModelDown));

        blockModels.itemModelOutput.accept(pressurePlate.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void fenceBlock(BlockModelGenerators blockModels, Block fence)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fence));
        String parent = id.getPath().replace("_fence", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        ResourceLocation fencePostModel = ModelTemplates.FENCE_POST.create(fence, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceSideModel = ModelTemplates.FENCE_SIDE.create(fence, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFence(fence, fencePostModel, fenceSideModel));

        ResourceLocation fenceInventoryModel = ModelTemplates.FENCE_INVENTORY.create(fence, textureMapping, blockModels.modelOutput);
        blockModels.itemModelOutput.accept(fence.asItem(), new BlockModelWrapper.Unbaked(fenceInventoryModel, Collections.emptyList()));
    }

    public void fenceGateBlock(BlockModelGenerators blockModels, Block fenceGate)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fenceGate));
        String parent = id.getPath().replace("_fence_gate", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        ResourceLocation fenceGateModelOpen = ModelTemplates.FENCE_GATE_OPEN.create(fenceGate, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceGateModelClosed = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceGateWallModelOpen = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGate, textureMapping, blockModels.modelOutput);
        ResourceLocation fenceGateWallModelClosed = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGate, fenceGateModelOpen, fenceGateModelClosed, fenceGateWallModelOpen, fenceGateWallModelClosed, true));

        blockModels.itemModelOutput.accept(fenceGate.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void buttonBlock(BlockModelGenerators blockModels, Block button)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(button));
        String parent = id.getPath().replace("_button", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        ResourceLocation buttonModel = ModelTemplates.BUTTON.create(button, textureMapping, blockModels.modelOutput);
        ResourceLocation buttonPressedModel = ModelTemplates.BUTTON_PRESSED.create(button, textureMapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createButton(button, buttonModel, buttonPressedModel));

        ResourceLocation buttonInventoryModel = ModelTemplates.BUTTON_INVENTORY.create(button, textureMapping, blockModels.modelOutput);
        blockModels.itemModelOutput.accept(button.asItem(), new BlockModelWrapper.Unbaked(buttonInventoryModel, Collections.emptyList()));
    }

    private ResourceLocation blockStateLocation(ResourceLocation id)
    {
        return ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + id.getPath());
    }
}
