package com.autovw.moreconcrete.core;

import com.autovw.moreconcrete.MoreConcrete;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

/**
 * Author: Autovw
 */
public class ModTags {
    public static final TagKey<Block> MOD_SLABS = blockTag("slabs");
    public static final TagKey<Block> MOD_STAIRS = blockTag("stairs");
    public static final TagKey<Block> MOD_WALLS = blockTag("walls");
    public static final TagKey<Block> MOD_LEVERS = blockTag("levers");
    public static final TagKey<Block> MOD_PRESSURE_PLATES = blockTag("pressure_plates");
    public static final TagKey<Block> MOD_FENCES = blockTag("fences");
    public static final TagKey<Block> MOD_FENCE_GATES = blockTag("fence_gates");

    private static TagKey<Block> blockTag(String location) {
        return BlockTags.create(new ResourceLocation(MoreConcrete.MODID, location));
    }
}
