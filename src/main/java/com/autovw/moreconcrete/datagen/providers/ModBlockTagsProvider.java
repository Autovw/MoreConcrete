package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import com.autovw.moreconcrete.core.ModTags;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

/**
 * Author: Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MoreConcrete.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.MOD_WALLS)
                .add(ModBlocks.WHITE_CONCRETE_WALL.get())
                .add(ModBlocks.ORANGE_CONCRETE_WALL.get())
                .add(ModBlocks.MAGENTA_CONCRETE_WALL.get())
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get())
                .add(ModBlocks.YELLOW_CONCRETE_WALL.get())
                .add(ModBlocks.LIME_CONCRETE_WALL.get())
                .add(ModBlocks.PINK_CONCRETE_WALL.get())
                .add(ModBlocks.GRAY_CONCRETE_WALL.get())
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get())
                .add(ModBlocks.CYAN_CONCRETE_WALL.get())
                .add(ModBlocks.PURPLE_CONCRETE_WALL.get())
                .add(ModBlocks.BLUE_CONCRETE_WALL.get())
                .add(ModBlocks.BROWN_CONCRETE_WALL.get())
                .add(ModBlocks.GREEN_CONCRETE_WALL.get())
                .add(ModBlocks.RED_CONCRETE_WALL.get())
                .add(ModBlocks.BLACK_CONCRETE_WALL.get());
        tag(BlockTags.WALLS).addTag(ModTags.MOD_WALLS);
    }
}
