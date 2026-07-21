package com.autovw.moreconcrete.common.common;

import com.autovw.moreconcrete.common.common.block.BlockType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.*;
import java.util.stream.Stream;

/**
 * @since 1.6.0
 * @author Autovw
 */
public final class ColourUtil
{
    public static Colour parse(String colour)
    {
        return Colour.valueOf(colour.toUpperCase(Locale.ROOT));
    }

    public static Stream<? extends Block> sortTab(Stream<? extends Block> blockStream)
    {
        return blockStream.sorted(Comparator.comparing((Block block) -> {
                    BlockData data = ColourUtil.parseBlockData(BuiltInRegistries.BLOCK.getKey(block).getPath());
                    return data.blockType().getDisplayPos();
                })
                .thenComparing(block -> {
                    BlockData data = ColourUtil.parseBlockData(BuiltInRegistries.BLOCK.getKey(block).getPath());
                    return data.colour().getDisplayPos();
                }));
    }

    public static Stream<Block> sortConcreteTab(Stream<Block> blockStream)
    {
        return Stream.concat(Blocks.CONCRETE.asList().stream(), blockStream).sorted(Comparator.comparing((Block block) -> {
                    BlockData data = ColourUtil.parseBlockData(BuiltInRegistries.BLOCK.getKey(block).getPath());
                    return data.colour().getDisplayPos();
                })
                .thenComparing(block -> {
                    BlockData data = ColourUtil.parseBlockData(BuiltInRegistries.BLOCK.getKey(block).getPath());
                    return data.blockType().getDisplayPos();
                }));
    }

    private static BlockData parseBlockData(String blockData)
    {
        String[] data = blockData.concat("_").split("_concrete_");
        String blockType = null;
        if (data.length > 1)
            blockType = data[1].substring(0, data[1].length() - 1);
        return new BlockData(ColourUtil.parse(data[0]), BlockType.parse(blockType));
    }

    private record BlockData(Colour colour, BlockType blockType)
    {
    }
}
