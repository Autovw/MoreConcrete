package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

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

        withExistingParent(ModBlocks.WHITE_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_lever"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_lever"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_lever"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_lever"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_lever"));
        withExistingParent(ModBlocks.LIME_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_lever"));
        withExistingParent(ModBlocks.PINK_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_lever"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_lever"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_lever"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_lever"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_lever"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_lever"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_lever"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_lever"));
        withExistingParent(ModBlocks.RED_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_lever"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_LEVER.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_lever"));

        withExistingParent(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_pressure_plate"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_pressure_plate"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_pressure_plate"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_pressure_plate"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_pressure_plate"));
        withExistingParent(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_pressure_plate"));
        withExistingParent(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_pressure_plate"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_pressure_plate"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_pressure_plate"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_pressure_plate"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_pressure_plate"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_pressure_plate"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_pressure_plate"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_pressure_plate"));
        withExistingParent(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_pressure_plate"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_pressure_plate"));

        withExistingParent(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/white_concrete_fence_gate"));
        withExistingParent(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/orange_concrete_fence_gate"));
        withExistingParent(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/magenta_concrete_fence_gate"));
        withExistingParent(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_blue_concrete_fence_gate"));
        withExistingParent(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/yellow_concrete_fence_gate"));
        withExistingParent(ModBlocks.LIME_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/lime_concrete_fence_gate"));
        withExistingParent(ModBlocks.PINK_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/pink_concrete_fence_gate"));
        withExistingParent(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/gray_concrete_fence_gate"));
        withExistingParent(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/light_gray_concrete_fence_gate"));
        withExistingParent(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/cyan_concrete_fence_gate"));
        withExistingParent(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/purple_concrete_fence_gate"));
        withExistingParent(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/blue_concrete_fence_gate"));
        withExistingParent(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/brown_concrete_fence_gate"));
        withExistingParent(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/green_concrete_fence_gate"));
        withExistingParent(ModBlocks.RED_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/red_concrete_fence_gate"));
        withExistingParent(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation(MoreConcrete.MODID, "block/black_concrete_fence_gate"));
    }
}
