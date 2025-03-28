package com.autovw.moreconcrete.neoforge.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
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
        MultiVariant slabBottomModel = BlockModelGenerators.plainVariant(ModelTemplates.SLAB_BOTTOM.create(slab, textureMapping, blockModels.modelOutput));
        MultiVariant slabTopModel = BlockModelGenerators.plainVariant(ModelTemplates.SLAB_TOP.create(slab, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(slab, slabBottomModel, slabTopModel, BlockModelGenerators.plainVariant(parentTexture)));

        blockModels.itemModelOutput.accept(slab.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void stairsBlock(BlockModelGenerators blockModels, Block stairs)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(stairs));
        String parent = id.getPath().replace("_stairs", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.BOTTOM, parentTexture).put(TextureSlot.SIDE, parentTexture).put(TextureSlot.TOP, parentTexture);
        MultiVariant stairsInnerModel = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.create(stairs, textureMapping, blockModels.modelOutput));
        ResourceLocation stairsStraightModelLoc = ModelTemplates.STAIRS_STRAIGHT.create(stairs, textureMapping, blockModels.modelOutput);
        MultiVariant stairsStraightModel = BlockModelGenerators.plainVariant(stairsStraightModelLoc);
        MultiVariant stairsOuterModel = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.create(stairs, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stairs, stairsInnerModel, stairsStraightModel, stairsOuterModel));

        blockModels.itemModelOutput.accept(stairs.asItem(), new BlockModelWrapper.Unbaked(stairsStraightModelLoc, Collections.emptyList()));
    }

    public void wallBlock(BlockModelGenerators blockModels, Block wall)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(wall));
        String parent = id.getPath().replace("_wall", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.WALL, parentTexture);
        MultiVariant wallPostModel = BlockModelGenerators.plainVariant(ModelTemplates.WALL_POST.create(wall, textureMapping, blockModels.modelOutput));
        MultiVariant wallLowSideModel = BlockModelGenerators.plainVariant(ModelTemplates.WALL_LOW_SIDE.create(wall, textureMapping, blockModels.modelOutput));
        MultiVariant wallTallSideModel = BlockModelGenerators.plainVariant(ModelTemplates.WALL_TALL_SIDE.create(wall, textureMapping, blockModels.modelOutput));
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
        MultiVariant leverModel = BlockModelGenerators.plainVariant(ModelTemplates.create(leverModelLoc.toString(), base).create(lever, textureMapping, blockModels.modelOutput));
        MultiVariant leverModelOn = BlockModelGenerators.plainVariant(ModelTemplates.create(leverModelOnLoc.toString(), "_on", base).create(lever, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(this.createLever(lever, leverModel, leverModelOn));

        blockModels.itemModelOutput.accept(lever.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    private MultiVariantGenerator createLever(Block lever, MultiVariant leverModel, MultiVariant leverModelOn)
    {
        return MultiVariantGenerator.dispatch(lever)
                .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.POWERED, leverModel, leverModelOn))
                .with(
                        PropertyDispatch.modify(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING)
                                .select(AttachFace.CEILING, Direction.NORTH, BlockModelGenerators.X_ROT_180.then(BlockModelGenerators.Y_ROT_180))
                                .select(AttachFace.CEILING, Direction.EAST, BlockModelGenerators.X_ROT_180.then(BlockModelGenerators.Y_ROT_270))
                                .select(AttachFace.CEILING, Direction.SOUTH, BlockModelGenerators.X_ROT_180)
                                .select(AttachFace.CEILING, Direction.WEST, BlockModelGenerators.X_ROT_180.then(BlockModelGenerators.Y_ROT_90))
                                .select(AttachFace.FLOOR, Direction.NORTH, BlockModelGenerators.NOP)
                                .select(AttachFace.FLOOR, Direction.EAST, BlockModelGenerators.Y_ROT_90)
                                .select(AttachFace.FLOOR, Direction.SOUTH, BlockModelGenerators.Y_ROT_180)
                                .select(AttachFace.FLOOR, Direction.WEST, BlockModelGenerators.Y_ROT_270)
                                .select(AttachFace.WALL, Direction.NORTH, BlockModelGenerators.X_ROT_90)
                                .select(AttachFace.WALL, Direction.EAST, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_90))
                                .select(AttachFace.WALL, Direction.SOUTH, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_180))
                                .select(AttachFace.WALL, Direction.WEST, BlockModelGenerators.X_ROT_90.then(BlockModelGenerators.Y_ROT_270))
                );
    }

    public void pressurePlateBlock(BlockModelGenerators blockModels, Block pressurePlate)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(pressurePlate));
        String parent = id.getPath().replace("_pressure_plate", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        MultiVariant plateModelUp = BlockModelGenerators.plainVariant(ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlate, textureMapping, blockModels.modelOutput));
        MultiVariant plateModelDown = BlockModelGenerators.plainVariant(ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlate, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(pressurePlate, plateModelUp, plateModelDown));

        blockModels.itemModelOutput.accept(pressurePlate.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void fenceBlock(BlockModelGenerators blockModels, Block fence)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fence));
        String parent = id.getPath().replace("_fence", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        MultiVariant fencePostModel = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_POST.create(fence, textureMapping, blockModels.modelOutput));
        MultiVariant fenceSideModel = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_SIDE.create(fence, textureMapping, blockModels.modelOutput));
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
        MultiVariant fenceGateModelOpen = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_OPEN.create(fenceGate, textureMapping, blockModels.modelOutput));
        MultiVariant fenceGateModelClosed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput));
        MultiVariant fenceGateWallModelOpen = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGate, textureMapping, blockModels.modelOutput));
        MultiVariant fenceGateWallModelClosed = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGate, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGate, fenceGateModelOpen, fenceGateModelClosed, fenceGateWallModelOpen, fenceGateWallModelClosed, true));

        blockModels.itemModelOutput.accept(fenceGate.asItem(), new BlockModelWrapper.Unbaked(this.blockStateLocation(id), Collections.emptyList()));
    }

    public void buttonBlock(BlockModelGenerators blockModels, Block button)
    {
        ResourceLocation id = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(button));
        String parent = id.getPath().replace("_button", "");
        ResourceLocation parentTexture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.TEXTURE, parentTexture);
        MultiVariant buttonModel = BlockModelGenerators.plainVariant(ModelTemplates.BUTTON.create(button, textureMapping, blockModels.modelOutput));
        MultiVariant buttonPressedModel = BlockModelGenerators.plainVariant(ModelTemplates.BUTTON_PRESSED.create(button, textureMapping, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(BlockModelGenerators.createButton(button, buttonModel, buttonPressedModel));

        ResourceLocation buttonInventoryModel = ModelTemplates.BUTTON_INVENTORY.create(button, textureMapping, blockModels.modelOutput);
        blockModels.itemModelOutput.accept(button.asItem(), new BlockModelWrapper.Unbaked(buttonInventoryModel, Collections.emptyList()));
    }

    private ResourceLocation blockStateLocation(ResourceLocation id)
    {
        return ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + id.getPath());
    }
}
