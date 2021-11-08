package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.core.ModBlocks;
import com.autovw.moreconcrete.core.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;

/**
 * Author: Autovw
 */
public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerTags() {
        this.getBuilder(ModTags.MOD_WALLS)
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
        this.getBuilder(BlockTags.WALLS).add(ModTags.MOD_WALLS);
    }
}
