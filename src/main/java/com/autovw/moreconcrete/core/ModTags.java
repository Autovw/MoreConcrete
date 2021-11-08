package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final Tag<Block> MOD_WALLS = blockTag("walls");

    private static Tag<Block> blockTag(String location) {
        return new BlockTags.Wrapper(new ResourceLocation(MoreConcrete.MODID, location));
    }
}
