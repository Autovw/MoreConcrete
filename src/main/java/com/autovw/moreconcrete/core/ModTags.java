package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final ITag.INamedTag<Block> MOD_SLABS = blockTag("slabs");
    public static final ITag.INamedTag<Block> MOD_STAIRS = blockTag("stairs");
    public static final ITag.INamedTag<Block> MOD_WALLS = blockTag("walls");
    public static final ITag.INamedTag<Block> MOD_LEVERS = blockTag("levers");
    public static final ITag.INamedTag<Block> MOD_PRESSURE_PLATES = blockTag("pressure_plates");
    public static final ITag.INamedTag<Block> MOD_FENCE_GATES = blockTag("fence_gates");

    private static ITag.INamedTag<Block> blockTag(String location) {
        return BlockTags.bind(MoreConcrete.MODID + ":" + location);
    }
}
