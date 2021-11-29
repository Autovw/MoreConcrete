package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

/**
 * Author: Autovw
 */
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // Slabs
        concreteSlab(consumer, ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        concreteSlab(consumer, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        concreteSlab(consumer, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteSlab(consumer, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        concreteSlab(consumer, ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        concreteSlab(consumer, ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        concreteSlab(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteSlab(consumer, ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        concreteSlab(consumer, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        concreteSlab(consumer, ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        concreteSlab(consumer, ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        concreteSlab(consumer, ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        concreteSlab(consumer, ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        concreteSlab(consumer, ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.of(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


        // Stairs
        concreteStairs(consumer, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        concreteStairs(consumer, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        concreteStairs(consumer, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteStairs(consumer, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        concreteStairs(consumer, ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        concreteStairs(consumer, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        concreteStairs(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteStairs(consumer, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        concreteStairs(consumer, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        concreteStairs(consumer, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        concreteStairs(consumer, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        concreteStairs(consumer, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        concreteStairs(consumer, ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        concreteStairs(consumer, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Walls
        concreteWall(consumer, ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);
        concreteWall(consumer, ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);
        concreteWall(consumer, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);
        concreteWall(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteWall(consumer, ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);
        concreteWall(consumer, ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);
        concreteWall(consumer, ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);
        concreteWall(consumer, ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);
        concreteWall(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteWall(consumer, ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);
        concreteWall(consumer, ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);
        concreteWall(consumer, ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);
        concreteWall(consumer, ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);
        concreteWall(consumer, ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);
        concreteWall(consumer, ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);
        concreteWall(consumer, ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Levers
        concreteLever(consumer, ModBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE);
        concreteLever(consumer, ModBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE);
        concreteLever(consumer, ModBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE);
        concreteLever(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteLever(consumer, ModBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE);
        concreteLever(consumer, ModBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE);
        concreteLever(consumer, ModBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE);
        concreteLever(consumer, ModBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE);
        concreteLever(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteLever(consumer, ModBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE);
        concreteLever(consumer, ModBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE);
        concreteLever(consumer, ModBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE);
        concreteLever(consumer, ModBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE);
        concreteLever(consumer, ModBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE);
        concreteLever(consumer, ModBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE);
        concreteLever(consumer, ModBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE);


        // Pressure Plates
        concretePressurePlate(consumer, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        concretePressurePlate(consumer, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);
    }

    private static void concreteSlab(Consumer<FinishedRecipe> recipeConsumer, ItemLike slab, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('#', ingredient)
                .pattern("###")
                .group("concrete_slab")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteStairs(Consumer<FinishedRecipe> recipeConsumer, ItemLike stairs, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(stairs, 4)
                .define('#', ingredient)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .group("concrete_stairs")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteWall(Consumer<FinishedRecipe> recipeConsumer, ItemLike wall, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(wall, 6)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .group("concrete_wall")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void stonecutting(Consumer<FinishedRecipe> recipeConsumer, ItemLike result, Ingredient ingredient, int amount, ItemLike type) {
        SingleItemRecipeBuilder.stonecutting(ingredient, result, amount)
                .unlockedBy("has_concrete", has(type))
                .save(recipeConsumer, new ResourceLocation(MoreConcrete.MODID, result.asItem() + "_from_" + type.asItem() + "_stonecutting"));
    }

    private static void concretePressurePlate(Consumer<FinishedRecipe> recipeConsumer, ItemLike pressurePlate, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(pressurePlate, 1)
                .define('#', ingredient)
                .pattern("##")
                .group("concrete_pressure_plate")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }

    private static void concreteLever(Consumer<FinishedRecipe> recipeConsumer, ItemLike lever, ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(lever, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X")
                .pattern("#")
                .group("concrete_lever")
                .unlockedBy("has_concrete", has(ingredient))
                .save(recipeConsumer);
    }
}
