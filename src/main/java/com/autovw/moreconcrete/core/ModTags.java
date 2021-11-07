package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final Tag.Named<Block> MOD_WALLS = blockTag("walls");

    private static Tag.Named<Block> blockTag(String location) {
        return BlockTags.bind(MoreConcrete.MODID + ":" + location);
    }
}
