package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final ITag.INamedTag<Block> MOD_WALLS = blockTag("walls");

    private static ITag.INamedTag<Block> blockTag(String location) {
        return BlockTags.bind(MoreConcrete.MODID + ":" + location);
    }
}
