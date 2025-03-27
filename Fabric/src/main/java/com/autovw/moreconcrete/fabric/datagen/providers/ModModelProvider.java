package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;

import java.util.Objects;
import java.util.Optional;

/**
 * @author Autovw
 */
public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModels)
    {
        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof SlabBlock)
                .forEach((block) -> this.slabBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof StairBlock)
                .forEach((block) -> this.stairsBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof WallBlock)
                .forEach((block) -> this.wallBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof LeverBlock)
                .forEach((block) -> this.leverBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof PressurePlateBlock)
                .forEach((block) -> this.pressurePlateBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof FenceBlock)
                .forEach((block) -> this.fenceBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof FenceGateBlock)
                .forEach((block) -> this.fenceGateBlock(blockModels, block));

        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof ButtonBlock)
                .forEach((block) -> this.buttonBlock(blockModels, block));
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {
    }

    public void slabBlock(BlockModelGenerators blockModels, Block slab)
    {
        String slabPath = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(slab)).getPath();
        String parent = slabPath.replace("_slab", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.BOTTOM, txt).put(TextureSlot.SIDE, txt).put(TextureSlot.TOP, txt);
        ResourceLocation modelBottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, blockModels.modelOutput);
        ResourceLocation modelTop = ModelTemplates.SLAB_TOP.create(slab, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createSlab(slab, modelBottom, modelTop, txt));
        blockModels.delegateItemModel(slab, modelBottom);
    }

    public void stairsBlock(BlockModelGenerators blockModels, Block stairs)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(stairs)).getPath();
        String parent = path.replace("_stairs", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.BOTTOM, txt).put(TextureSlot.SIDE, txt).put(TextureSlot.TOP, txt);
        ResourceLocation modelInner = ModelTemplates.STAIRS_INNER.create(stairs, mapping, blockModels.modelOutput);
        ResourceLocation modelStraight = ModelTemplates.STAIRS_STRAIGHT.create(stairs, mapping, blockModels.modelOutput);
        ResourceLocation modelOuter = ModelTemplates.STAIRS_OUTER.create(stairs, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stairs, modelInner, modelStraight, modelOuter));
        blockModels.delegateItemModel(stairs, modelStraight);
    }

    public void wallBlock(BlockModelGenerators blockModels, Block wall)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(wall)).getPath();
        String parent = path.replace("_wall", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.WALL, txt);
        ResourceLocation modelPost = ModelTemplates.WALL_POST.create(wall, mapping, blockModels.modelOutput);
        ResourceLocation modelLowSide = ModelTemplates.WALL_LOW_SIDE.create(wall, mapping, blockModels.modelOutput);
        ResourceLocation modelTallSide = ModelTemplates.WALL_TALL_SIDE.create(wall, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createWall(wall, modelPost, modelLowSide, modelTallSide));

        ResourceLocation modelInventory = ModelTemplates.WALL_INVENTORY.create(wall, mapping, blockModels.modelOutput);
        blockModels.delegateItemModel(wall, modelInventory);
    }

    /**
     * Helper method for registering blockstates/models for levers.
     *
     * @param lever Lever block
     */
    public void leverBlock(BlockModelGenerators blockModels, Block lever)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(lever)).getPath();
        String parent = path.replace("_lever", "");
        ResourceLocation texture = ResourceLocation.withDefaultNamespace("block/" + parent);

        ResourceLocation leverModel = ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "block/lever_model");
        ResourceLocation leverModelOn = ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, "block/lever_model_on");

        TextureSlot base = TextureSlot.create("base");
        TextureMapping mapping = new TextureMapping().put(base, texture);

        ModelTemplate modelTemplate = new ModelTemplate(Optional.of(leverModel), Optional.empty(), base);
        ModelTemplate modelOnTemplate = new ModelTemplate(Optional.of(leverModelOn), Optional.of("_on"), base);

        ResourceLocation model = modelTemplate.create(lever, mapping, blockModels.modelOutput);
        ResourceLocation modelOn = modelOnTemplate.create(lever, mapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.multiVariant(lever)
                        .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.POWERED, model, modelOn))
                        .with(PropertyDispatch.properties(BlockStateProperties.ATTACH_FACE, BlockStateProperties.HORIZONTAL_FACING)
                                .select(AttachFace.CEILING, Direction.NORTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                                .select(AttachFace.CEILING, Direction.EAST, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                                .select(AttachFace.CEILING, Direction.SOUTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180))
                                .select(AttachFace.CEILING, Direction.WEST, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R180).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                                .select(AttachFace.FLOOR, Direction.NORTH, Variant.variant())
                                .select(AttachFace.FLOOR, Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                                .select(AttachFace.FLOOR, Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                                .select(AttachFace.FLOOR, Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
                                .select(AttachFace.WALL, Direction.NORTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90))
                                .select(AttachFace.WALL, Direction.EAST, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                                .select(AttachFace.WALL, Direction.SOUTH, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                                .select(AttachFace.WALL, Direction.WEST, Variant.variant().with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)))
        );
    }

    /**
     * Helper method for registering blockstates/models for pressure plates.
     *
     * @param pressurePlate Registered pressure plate
     */
    public void pressurePlateBlock(BlockModelGenerators blockModels, Block pressurePlate)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(pressurePlate)).getPath();
        String parent = path.replace("_pressure_plate", "");
        ResourceLocation texture = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE, texture);
        ResourceLocation modelUp = ModelTemplates.PRESSURE_PLATE_UP.create(pressurePlate, mapping, blockModels.modelOutput);
        ResourceLocation modelDown = ModelTemplates.PRESSURE_PLATE_DOWN.create(pressurePlate, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(pressurePlate, modelUp, modelDown));
    }

    /**
     * Helper method for registering blockstates/models for fences.
     *
     * @param fence Registered fence
     */
    public void fenceBlock(BlockModelGenerators blockModels, Block fence)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fence)).getPath();
        String parent = path.replace("_fence", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE, txt);
        ResourceLocation modelPost = ModelTemplates.FENCE_POST.create(fence, mapping, blockModels.modelOutput);
        ResourceLocation modelSide = ModelTemplates.FENCE_SIDE.create(fence, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFence(fence, modelPost, modelSide));
        ResourceLocation modelInventory = ModelTemplates.FENCE_INVENTORY.create(fence, mapping, blockModels.modelOutput);
        blockModels.delegateItemModel(fence, modelInventory);
    }

    /**
     * Helper method for registering blockstates/models for fence gates.
     *
     * @param fenceGate Registered fence gate
     */
    public void fenceGateBlock(BlockModelGenerators blockModels, Block fenceGate)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(fenceGate)).getPath();
        String parent = path.replace("_fence_gate", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE, txt);
        ResourceLocation modelOpen = ModelTemplates.FENCE_GATE_OPEN.create(fenceGate, mapping, blockModels.modelOutput);
        ResourceLocation modelClosed = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGate, mapping, blockModels.modelOutput);
        ResourceLocation modelWallOpen = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGate, mapping, blockModels.modelOutput);
        ResourceLocation modelWallClosed = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGate, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGate, modelOpen, modelClosed, modelWallOpen, modelWallClosed, true));
    }

    /**
     * Helper method for creating blockstates and models for buttons
     *
     * @param button Registered button block
     */
    public void buttonBlock(BlockModelGenerators blockModels, Block button)
    {
        String path = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(button)).getPath();
        String parent = path.replace("_button", "");
        ResourceLocation txt = ResourceLocation.withDefaultNamespace("block/" + parent);

        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE, txt);
        ResourceLocation buttonModel = ModelTemplates.BUTTON.create(button, mapping, blockModels.modelOutput);
        ResourceLocation buttonModelOn = ModelTemplates.BUTTON_PRESSED.create(button, mapping, blockModels.modelOutput);
        blockModels.blockStateOutput.accept(BlockModelGenerators.createButton(button, buttonModel, buttonModelOn));

        ResourceLocation buttonModelInventory = ModelTemplates.BUTTON_INVENTORY.create(button, mapping, blockModels.modelOutput);
        blockModels.delegateItemModel(button, buttonModelInventory);
    }
}
