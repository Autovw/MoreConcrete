package com.autovw.moreconcrete.neoforge.core;

import com.autovw.moreconcrete.common.MoreConcrete;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author Autovw
 */
public final class ModBlocks
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreConcrete.MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreConcrete.MOD_ID);

    // Slabs
    public static final DeferredBlock<Block> WHITE_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_SLAB = registerSlab(Blocks.CONCRETE.black());

    // Stairs
    public static final DeferredBlock<Block> WHITE_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_STAIRS = registerStair(Blocks.CONCRETE.black());

    // Walls
    public static final DeferredBlock<Block> WHITE_CONCRETE_WALL = registerWall(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_WALL = registerWall(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_WALL = registerWall(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_WALL = registerWall(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_WALL = registerWall(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_WALL = registerWall(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_WALL = registerWall(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_WALL = registerWall(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_WALL = registerWall(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_WALL = registerWall(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_WALL = registerWall(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_WALL = registerWall(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_WALL = registerWall(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_WALL = registerWall(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_WALL = registerWall(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_WALL = registerWall(Blocks.CONCRETE.black());

    // Levers
    public static final DeferredBlock<Block> WHITE_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_LEVER = registerLever(Blocks.CONCRETE.black());

    // Pressure Plates
    public static final DeferredBlock<Block> WHITE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CONCRETE.black());

    // Fences
    public static final DeferredBlock<Block> WHITE_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_FENCE = registerFence(Blocks.CONCRETE.black());

    // Fence Gates
    public static final DeferredBlock<Block> WHITE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_FENCE_GATE = registerFenceGate( Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CONCRETE.black());

    // Buttons
    public static final DeferredBlock<Block> WHITE_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.white());
    public static final DeferredBlock<Block> ORANGE_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.orange());
    public static final DeferredBlock<Block> MAGENTA_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.magenta());
    public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.lightBlue());
    public static final DeferredBlock<Block> YELLOW_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.yellow());
    public static final DeferredBlock<Block> LIME_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.lime());
    public static final DeferredBlock<Block> PINK_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.pink());
    public static final DeferredBlock<Block> GRAY_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.gray());
    public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.lightGray());
    public static final DeferredBlock<Block> CYAN_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.cyan());
    public static final DeferredBlock<Block> PURPLE_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.purple());
    public static final DeferredBlock<Block> BLUE_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.blue());
    public static final DeferredBlock<Block> BROWN_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.brown());
    public static final DeferredBlock<Block> GREEN_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.green());
    public static final DeferredBlock<Block> RED_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.red());
    public static final DeferredBlock<Block> BLACK_CONCRETE_BUTTON = registerButton(Blocks.CONCRETE.black());


    /* ================== Registry helper methods ================== */


    /**
     * Template for block + item registries, used internally by the mod
     * @param parent Parent of the block
     * @param blockSupplier Block class + properties
     * @param itemProperties Item properties
     * @return registered {@link Block} + {@link BlockItem}
     */
    private static DeferredBlock<Block> createRegistry(Block parent, String type, Supplier<Block> blockSupplier, BlockBehaviour.Properties blockProperties, Item.Properties itemProperties)
    {
        String name = Objects.requireNonNull(BuiltInRegistries.BLOCK.getKey(parent)).getPath() + "_" + type;
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreConcrete.MOD_ID, name));
        blockProperties.setId(blockKey);
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoreConcrete.MOD_ID, name));
        itemProperties.useBlockDescriptionPrefix().setId(itemKey);
        DeferredBlock<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), itemProperties));
        return block;
    }

    private static DeferredBlock<Block> registerSlab(Block parent)
    {
        BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.ofFullCopy(parent);
        return createRegistry(parent, "slab", () -> new SlabBlock(blockProperties), blockProperties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerStair(Block parent)
    {
        BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.ofFullCopy(parent);
        return createRegistry(parent, "stairs", () ->  new StairBlock(parent.defaultBlockState(), blockProperties), blockProperties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerWall(Block parent)
    {
        BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.ofFullCopy(parent);
        return createRegistry(parent, "wall", () -> new WallBlock(blockProperties), blockProperties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerLever(Block parent)
    {
        BlockBehaviour.Properties blockProperties = BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER);
        return createRegistry(parent, "lever", () -> new LeverBlock(blockProperties), blockProperties, new Item.Properties());
    }

    // Concrete Pressure Plates are similar to vanilla Stone Pressure Plates
    private static DeferredBlock<Block> registerPressurePlate(Block parent)
    {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE);
        return createRegistry(parent, "pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, properties), properties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerFence(Block parent)
    {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().mapColor(parent.defaultMapColor()).forceSolidOn().requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE);
        return createRegistry(parent, "fence", () -> new FenceBlock(properties), properties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerFenceGate(Block parent)
    {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().mapColor(parent.defaultMapColor()).forceSolidOn().requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE);
        return createRegistry(parent, "fence_gate", () -> new FenceGateBlock(WoodType.WARPED, properties), properties, new Item.Properties());
    }

    private static DeferredBlock<Block> registerButton(Block parent)
    {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().noCollision().strength(0.5f).sound(SoundType.STONE);
        return createRegistry(parent, "button", () -> new ButtonBlock(BlockSetType.STONE, 20, properties), properties, new Item.Properties());
    }
}
