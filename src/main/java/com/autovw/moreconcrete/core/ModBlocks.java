package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @author Autovw
 */
public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreConcrete.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreConcrete.MODID);

    // Slabs
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerSlab(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerSlab(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerSlab(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerSlab(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerSlab(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerSlab(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerSlab(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerSlab(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerSlab(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerSlab(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerSlab(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerSlab(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerSlab(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerSlab(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerSlab(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerSlab(Blocks.PINK_CONCRETE);

    // Stairs
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerStair(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerStair(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerStair(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerStair(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerStair(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerStair(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerStair(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerStair(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerStair(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerStair(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerStair(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerStair(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerStair(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerStair(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerStair(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerStair(Blocks.PINK_CONCRETE);

    // Walls
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerWall(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerWall(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerWall(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerWall(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerWall(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerWall(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerWall(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerWall(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerWall(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerWall(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerWall(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerWall(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerWall(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerWall(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerWall(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerWall(Blocks.PINK_CONCRETE);

    // Levers
    public static final RegistryObject<Block> WHITE_CONCRETE_LEVER = registerLever(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LEVER = registerLever(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_LEVER = registerLever(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_LEVER = registerLever(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_LEVER = registerLever(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_LEVER = registerLever(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_LEVER = registerLever(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_LEVER = registerLever(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_LEVER = registerLever(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_LEVER = registerLever(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_LEVER = registerLever(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LEVER = registerLever(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_LEVER = registerLever(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_LEVER = registerLever(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LEVER = registerLever(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_LEVER = registerLever(Blocks.PINK_CONCRETE);

    // Pressure Plates
    public static final RegistryObject<Block> WHITE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_PRESSURE_PLATE = registerPressurePlate(Blocks.PINK_CONCRETE);

    // Fences
    public static final RegistryObject<Block> WHITE_CONCRETE_FENCE = registerFence(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE = registerFence(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_FENCE = registerFence(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_FENCE = registerFence(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_FENCE = registerFence(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_FENCE = registerFence(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE = registerFence(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE = registerFence(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_FENCE = registerFence(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_FENCE = registerFence(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_FENCE = registerFence(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE = registerFence(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_FENCE = registerFence(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE = registerFence(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE = registerFence(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_FENCE = registerFence(Blocks.PINK_CONCRETE);

    // Fence Gates
    public static final RegistryObject<Block> WHITE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE_GATE = registerFenceGate( Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_FENCE_GATE = registerFenceGate(Blocks.PINK_CONCRETE);

    // Buttons
    public static final RegistryObject<Block> WHITE_CONCRETE_BUTTON = registerButton(Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_BUTTON = registerButton(Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_BUTTON = registerButton(Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_BUTTON = registerButton(Blocks.BLACK_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_BUTTON = registerButton(Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_BUTTON = registerButton(Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_BUTTON = registerButton(Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_BUTTON = registerButton(Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_BUTTON = registerButton(Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_BUTTON = registerButton(Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_BUTTON = registerButton(Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_BUTTON = registerButton(Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_BUTTON = registerButton(Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_BUTTON = registerButton(Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_BUTTON = registerButton(Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_BUTTON = registerButton(Blocks.PINK_CONCRETE);


    /* ================== Registry helper methods ================== */


    /**
     * Template for block + item registries, used internally by the mod
     * @param parent Parent of the block
     * @param blockSupplier Block class + properties
     * @param itemProperties Item properties
     * @return registered {@link Block} + {@link BlockItem}
     */
    private static RegistryObject<Block> createRegistry(Block parent, String type, Supplier<Block> blockSupplier, Item.Properties itemProperties) {
        String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(parent)).getPath() + "_" + type;
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), itemProperties));
        return block;
    }

    private static RegistryObject<Block> registerSlab(Block parent) {
        return createRegistry(parent, "slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(parent)), new Item.Properties());
    }

    private static RegistryObject<Block> registerStair(Block parent) {
        return createRegistry(parent, "stairs", () ->  new StairBlock(parent.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(parent)), new Item.Properties());
    }

    private static RegistryObject<Block> registerWall(Block parent) {
        return createRegistry(parent, "wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(parent)), new Item.Properties());
    }

    private static RegistryObject<Block> registerLever(Block parent) {
        return createRegistry(parent, "lever", () -> new LeverBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER)), new Item.Properties());
    }

    // Concrete Pressure Plates are similar to vanilla Stone Pressure Plates
    private static RegistryObject<Block> registerPressurePlate(Block parent) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_PRESSURE_PLATE);
        return createRegistry(parent, "pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE, properties), new Item.Properties());
    }

    private static RegistryObject<Block> registerFence(Block parent) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().mapColor(parent.defaultMapColor()).forceSolidOn().requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE);
        return createRegistry(parent, "fence", () -> new FenceBlock(properties), new Item.Properties());
    }

    private static RegistryObject<Block> registerFenceGate(Block parent) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().mapColor(parent.defaultMapColor()).forceSolidOn().requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE);
        return createRegistry(parent, "fence_gate", () -> new FenceGateBlock(WoodType.WARPED, properties), new Item.Properties());
    }

    private static RegistryObject<Block> registerButton(Block parent) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().noCollission().strength(0.5f).sound(SoundType.STONE);
        return createRegistry(parent, "button", () -> new ButtonBlock(BlockSetType.STONE, 20, properties), new Item.Properties());
    }
}
