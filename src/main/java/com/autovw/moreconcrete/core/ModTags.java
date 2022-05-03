package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final Tag.Named<Block> MOD_SLABS = blockTag("slabs");
    public static final Tag.Named<Block> MOD_STAIRS = blockTag("stairs");
    public static final Tag.Named<Block> MOD_WALLS = blockTag("walls");
    public static final Tag.Named<Block> MOD_LEVERS = blockTag("levers");
    public static final Tag.Named<Block> MOD_PRESSURE_PLATES = blockTag("pressure_plates");
    public static final Tag.Named<Block> MOD_FENCES = blockTag("fences");
    public static final Tag.Named<Block> MOD_FENCE_GATES = blockTag("fence_gates");
    public static final Tag.Named<Block> MOD_BUTTONS = blockTag("buttons");

    private static Tag.Named<Block> blockTag(String location) {
        return BlockTags.bind(MoreConcrete.MODID + ":" + location);
    }
}
