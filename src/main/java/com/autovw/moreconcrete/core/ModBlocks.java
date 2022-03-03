package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: Autovw
 */
public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreConcrete.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreConcrete.MODID);

    // Slabs
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerSlab("white_concrete_slab", Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerSlab("orange_concrete_slab", Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerSlab("magenta_concrete_slab", Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerSlab("light_blue_concrete_slab", Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerSlab("yellow_concrete_slab", Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerSlab("lime_concrete_slab", Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerSlab("pink_concrete_slab", Blocks.PINK_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerSlab("gray_concrete_slab", Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerSlab("light_gray_concrete_slab", Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerSlab("cyan_concrete_slab", Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerSlab("purple_concrete_slab", Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerSlab("blue_concrete_slab", Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerSlab("brown_concrete_slab", Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerSlab("green_concrete_slab", Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerSlab("red_concrete_slab", Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerSlab("black_concrete_slab", Blocks.BLACK_CONCRETE);

    // Stairs
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerStair("white_concrete_stairs", Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerStair("orange_concrete_stairs", Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerStair("magenta_concrete_stairs", Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerStair("light_blue_concrete_stairs", Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerStair("yellow_concrete_stairs", Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerStair("lime_concrete_stairs", Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerStair("pink_concrete_stairs", Blocks.PINK_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerStair("gray_concrete_stairs", Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerStair("light_gray_concrete_stairs", Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerStair("cyan_concrete_stairs", Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerStair("purple_concrete_stairs", Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerStair("blue_concrete_stairs", Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerStair("brown_concrete_stairs", Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerStair("green_concrete_stairs", Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerStair("red_concrete_stairs", Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerStair("black_concrete_stairs", Blocks.BLACK_CONCRETE);

    // Walls
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerWall("white_concrete_wall", Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerWall("orange_concrete_wall", Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerWall("magenta_concrete_wall", Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerWall("light_blue_concrete_wall", Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerWall("yellow_concrete_wall", Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerWall("lime_concrete_wall", Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerWall("pink_concrete_wall", Blocks.PINK_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerWall("gray_concrete_wall", Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerWall("light_gray_concrete_wall", Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerWall("cyan_concrete_wall", Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerWall("purple_concrete_wall", Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerWall("blue_concrete_wall", Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerWall("brown_concrete_wall", Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerWall("green_concrete_wall", Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerWall("red_concrete_wall", Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerWall("black_concrete_wall", Blocks.BLACK_CONCRETE);

    // Levers
    public static final RegistryObject<Block> WHITE_CONCRETE_LEVER = registerLever("white_concrete_lever");
    public static final RegistryObject<Block> ORANGE_CONCRETE_LEVER = registerLever("orange_concrete_lever");
    public static final RegistryObject<Block> MAGENTA_CONCRETE_LEVER = registerLever("magenta_concrete_lever");
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_LEVER = registerLever("light_blue_concrete_lever");
    public static final RegistryObject<Block> YELLOW_CONCRETE_LEVER = registerLever("yellow_concrete_lever");
    public static final RegistryObject<Block> LIME_CONCRETE_LEVER = registerLever("lime_concrete_lever");
    public static final RegistryObject<Block> PINK_CONCRETE_LEVER = registerLever("pink_concrete_lever");
    public static final RegistryObject<Block> GRAY_CONCRETE_LEVER = registerLever("gray_concrete_lever");
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_LEVER = registerLever("light_gray_concrete_lever");
    public static final RegistryObject<Block> CYAN_CONCRETE_LEVER = registerLever("cyan_concrete_lever");
    public static final RegistryObject<Block> PURPLE_CONCRETE_LEVER = registerLever("purple_concrete_lever");
    public static final RegistryObject<Block> BLUE_CONCRETE_LEVER = registerLever("blue_concrete_lever");
    public static final RegistryObject<Block> BROWN_CONCRETE_LEVER = registerLever("brown_concrete_lever");
    public static final RegistryObject<Block> GREEN_CONCRETE_LEVER = registerLever("green_concrete_lever");
    public static final RegistryObject<Block> RED_CONCRETE_LEVER = registerLever("red_concrete_lever");
    public static final RegistryObject<Block> BLACK_CONCRETE_LEVER = registerLever("black_concrete_lever");

    // Pressure Plates
    public static final RegistryObject<Block> WHITE_CONCRETE_PRESSURE_PLATE = registerPressurePlate("white_concrete_pressure_plate");
    public static final RegistryObject<Block> ORANGE_CONCRETE_PRESSURE_PLATE = registerPressurePlate("orange_concrete_pressure_plate");
    public static final RegistryObject<Block> MAGENTA_CONCRETE_PRESSURE_PLATE = registerPressurePlate("magenta_concrete_pressure_plate");
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate("light_blue_concrete_pressure_plate");
    public static final RegistryObject<Block> YELLOW_CONCRETE_PRESSURE_PLATE = registerPressurePlate("yellow_concrete_pressure_plate");
    public static final RegistryObject<Block> LIME_CONCRETE_PRESSURE_PLATE = registerPressurePlate("lime_concrete_pressure_plate");
    public static final RegistryObject<Block> PINK_CONCRETE_PRESSURE_PLATE = registerPressurePlate("pink_concrete_pressure_plate");
    public static final RegistryObject<Block> GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate("gray_concrete_pressure_plate");
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerPressurePlate("light_gray_concrete_pressure_plate");
    public static final RegistryObject<Block> CYAN_CONCRETE_PRESSURE_PLATE = registerPressurePlate("cyan_concrete_pressure_plate");
    public static final RegistryObject<Block> PURPLE_CONCRETE_PRESSURE_PLATE = registerPressurePlate("purple_concrete_pressure_plate");
    public static final RegistryObject<Block> BLUE_CONCRETE_PRESSURE_PLATE = registerPressurePlate("blue_concrete_pressure_plate");
    public static final RegistryObject<Block> BROWN_CONCRETE_PRESSURE_PLATE = registerPressurePlate("brown_concrete_pressure_plate");
    public static final RegistryObject<Block> GREEN_CONCRETE_PRESSURE_PLATE = registerPressurePlate("green_concrete_pressure_plate");
    public static final RegistryObject<Block> RED_CONCRETE_PRESSURE_PLATE = registerPressurePlate("red_concrete_pressure_plate");
    public static final RegistryObject<Block> BLACK_CONCRETE_PRESSURE_PLATE = registerPressurePlate("black_concrete_pressure_plate");

    // Fences
    public static final RegistryObject<Block> WHITE_CONCRETE_FENCE = registerFence("white", Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE = registerFence("orange", Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE = registerFence("magenta", Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE = registerFence("light_blue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE = registerFence("yellow", Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_FENCE = registerFence("lime", Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_FENCE = registerFence("pink", Blocks.PINK_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_FENCE = registerFence("gray", Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE = registerFence("light_gray", Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_FENCE = registerFence("cyan", Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE = registerFence("purple", Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_FENCE = registerFence("blue", Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_FENCE = registerFence("brown", Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_FENCE = registerFence("green", Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_FENCE = registerFence("red", Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_FENCE = registerFence("black", Blocks.BLACK_CONCRETE);

    // Fence Gates
    public static final RegistryObject<Block> WHITE_CONCRETE_FENCE_GATE = registerFenceGate("white", Blocks.WHITE_CONCRETE);
    public static final RegistryObject<Block> ORANGE_CONCRETE_FENCE_GATE = registerFenceGate("orange", Blocks.ORANGE_CONCRETE);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_FENCE_GATE = registerFenceGate("magenta", Blocks.MAGENTA_CONCRETE);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_FENCE_GATE = registerFenceGate("light_blue", Blocks.LIGHT_BLUE_CONCRETE);
    public static final RegistryObject<Block> YELLOW_CONCRETE_FENCE_GATE = registerFenceGate("yellow", Blocks.YELLOW_CONCRETE);
    public static final RegistryObject<Block> LIME_CONCRETE_FENCE_GATE = registerFenceGate("lime", Blocks.LIME_CONCRETE);
    public static final RegistryObject<Block> PINK_CONCRETE_FENCE_GATE = registerFenceGate("pink", Blocks.PINK_CONCRETE);
    public static final RegistryObject<Block> GRAY_CONCRETE_FENCE_GATE = registerFenceGate("gray", Blocks.GRAY_CONCRETE);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_FENCE_GATE = registerFenceGate("light_gray", Blocks.LIGHT_GRAY_CONCRETE);
    public static final RegistryObject<Block> CYAN_CONCRETE_FENCE_GATE = registerFenceGate("cyan", Blocks.CYAN_CONCRETE);
    public static final RegistryObject<Block> PURPLE_CONCRETE_FENCE_GATE = registerFenceGate("purple", Blocks.PURPLE_CONCRETE);
    public static final RegistryObject<Block> BLUE_CONCRETE_FENCE_GATE = registerFenceGate("blue", Blocks.BLUE_CONCRETE);
    public static final RegistryObject<Block> BROWN_CONCRETE_FENCE_GATE = registerFenceGate("brown", Blocks.BROWN_CONCRETE);
    public static final RegistryObject<Block> GREEN_CONCRETE_FENCE_GATE = registerFenceGate("green", Blocks.GREEN_CONCRETE);
    public static final RegistryObject<Block> RED_CONCRETE_FENCE_GATE = registerFenceGate("red", Blocks.RED_CONCRETE);
    public static final RegistryObject<Block> BLACK_CONCRETE_FENCE_GATE = registerFenceGate("black", Blocks.BLACK_CONCRETE);


    private static RegistryObject<Block> registerSlab(String name, Block blockCopy) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new SlabBlock(BlockBehaviour.Properties.copy(blockCopy)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerStair(String name, Block blockCopy) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new StairBlock(blockCopy::defaultBlockState, BlockBehaviour.Properties.copy(blockCopy)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerWall(String name, BlockBehaviour parentBlock) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new WallBlock(BlockBehaviour.Properties.copy(parentBlock)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        return block;
    }

    private static RegistryObject<Block> registerLever(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new LeverBlock(BlockBehaviour.Properties.copy(Blocks.LEVER)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
        return block;
    }

    // Concrete Pressure Plates are similar to vanilla Stone Pressure Plates
    private static RegistryObject<Block> registerPressurePlate(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
        return block;
    }

    private static RegistryObject<Block> registerFence(String color, Block parent) {
        RegistryObject<Block> block = BLOCKS.register(color + "_concrete_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE, parent.defaultMaterialColor()).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE)));
        ITEMS.register(color + "_concrete_fence", () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        return block;
    }

    private static RegistryObject<Block> registerFenceGate(String color, Block parent) {
        RegistryObject<Block> block = BLOCKS.register(color + "_concrete_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE, parent.defaultMaterialColor()).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE)));
        ITEMS.register(color + "_concrete_fence_gate", () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
        return block;
    }
}
