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
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

    // Stairs
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new StairBlock(Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new StairBlock(Blocks.ORANGE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new StairBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new StairBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new StairBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new StairBlock(Blocks.LIME_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new StairBlock(Blocks.PINK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new StairBlock(Blocks.GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new StairBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new StairBlock(Blocks.CYAN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new StairBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new StairBlock(Blocks.BLUE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new StairBlock(Blocks.BROWN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new StairBlock(Blocks.GREEN_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = register("red_concrete_stairs", new StairBlock(Blocks.RED_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new StairBlock(Blocks.BLACK_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));

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


    private static RegistryObject<Block> register(String name, Block blockType) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> blockType);
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

    private static RegistryObject<Block> registerFenceGate(String color, Block parent) {
        RegistryObject<Block> block = BLOCKS.register(color + "_concrete_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE, parent.defaultMaterialColor()).requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.STONE)));
        ITEMS.register(color + "_concrete_fence_gate", () -> new BlockItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
        return block;
    }
}
