package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: Autovw
 */
public class ModBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreConcrete.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreConcrete.MODID);

    // Slabs
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));

    // Stairs
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.ORANGE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.MAGENTA_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.YELLOW_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.PINK_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.GRAY_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.CYAN_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.PURPLE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.BLUE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.BROWN_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.GREEN_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = register("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.RED_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE::defaultBlockState, AbstractBlock.Properties.copy(Blocks.BLACK_CONCRETE)));

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

    private static RegistryObject<Block> register(String name, Block blockType) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> blockType);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static RegistryObject<Block> registerWall(String name, AbstractBlock parentBlock) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new WallBlock(AbstractBlock.Properties.copy(parentBlock)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
        return block;
    }

    private static RegistryObject<Block> registerLever(String name) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new LeverBlock(AbstractBlock.Properties.copy(Blocks.LEVER)));
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_REDSTONE)));
        return block;
    }
}
