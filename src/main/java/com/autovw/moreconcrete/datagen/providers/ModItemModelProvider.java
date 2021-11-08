package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

/**
 * Author: Autovw
 */
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MoreConcrete.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModBlocks.WHITE_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_slab"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_slab"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_slab"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_slab"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_slab"));
        withExistingParent(ModBlocks.LIME_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_slab"));
        withExistingParent(ModBlocks.PINK_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_slab"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_slab"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_slab"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_slab"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_slab"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_slab"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_slab"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_slab"));
        withExistingParent(ModBlocks.RED_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_slab"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_SLAB.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_slab"));

        withExistingParent(ModBlocks.WHITE_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_stairs"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_stairs"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_stairs"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_stairs"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_stairs"));
        withExistingParent(ModBlocks.LIME_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_stairs"));
        withExistingParent(ModBlocks.PINK_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_stairs"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_stairs"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_stairs"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_stairs"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_stairs"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_stairs"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_stairs"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_stairs"));
        withExistingParent(ModBlocks.RED_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_stairs"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_stairs"));

        withExistingParent(ModBlocks.WHITE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_wall_post"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_wall_post"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_wall_post"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_wall_post"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_wall_post"));
        withExistingParent(ModBlocks.LIME_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_wall_post"));
        withExistingParent(ModBlocks.PINK_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_wall_post"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_wall_post"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_wall_post"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_wall_post"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_wall_post"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_wall_post"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_wall_post"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_wall_post"));
        withExistingParent(ModBlocks.RED_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_wall_post"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_wall_post"));

        wallInventory(ModBlocks.WHITE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/white_concrete"));
        wallInventory(ModBlocks.ORANGE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/orange_concrete"));
        wallInventory(ModBlocks.MAGENTA_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/magenta_concrete"));
        wallInventory(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/light_blue_concrete"));
        wallInventory(ModBlocks.YELLOW_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/yellow_concrete"));
        wallInventory(ModBlocks.LIME_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/lime_concrete"));
        wallInventory(ModBlocks.PINK_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/pink_concrete"));
        wallInventory(ModBlocks.GRAY_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/gray_concrete"));
        wallInventory(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/light_gray_concrete"));
        wallInventory(ModBlocks.CYAN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/cyan_concrete"));
        wallInventory(ModBlocks.PURPLE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/purple_concrete"));
        wallInventory(ModBlocks.BLUE_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/blue_concrete"));
        wallInventory(ModBlocks.BROWN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/brown_concrete"));
        wallInventory(ModBlocks.GREEN_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/green_concrete"));
        wallInventory(ModBlocks.RED_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/red_concrete"));
        wallInventory(ModBlocks.BLACK_CONCRETE_WALL.get().getRegistryName().getPath(), new ResourceLocation("block/black_concrete"));

    }
}
