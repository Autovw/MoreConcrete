package com.autovw.moreconcrete.common.core.util;

import com.autovw.moreconcrete.common.MoreConcrete;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

/**
 * @author Autovw
 */
public class ModTags
{
    public static final TagKey<Block> MOD_SLABS = blockTag("slabs");
    public static final TagKey<Block> MOD_STAIRS = blockTag("stairs");
    public static final TagKey<Block> MOD_WALLS = blockTag("walls");
    public static final TagKey<Block> MOD_LEVERS = blockTag("levers");
    public static final TagKey<Block> MOD_PRESSURE_PLATES = blockTag("pressure_plates");
    public static final TagKey<Block> MOD_FENCES = blockTag("fences");
    public static final TagKey<Block> MOD_FENCE_GATES = blockTag("fence_gates");
    public static final TagKey<Block> MOD_BUTTONS = blockTag("buttons");

    private static TagKey<Block> blockTag(String location)
    {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreConcrete.MOD_ID, location));
    }
}
