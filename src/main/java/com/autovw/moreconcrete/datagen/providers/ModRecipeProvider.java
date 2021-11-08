package com.autovw.moreconcrete.datagen.providers;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

/**
 * Author: Autovw
 */
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
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

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.fromItems(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


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

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.fromItems(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


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

        stonecutting(consumer, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(consumer, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(consumer, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(consumer, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(consumer, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(consumer, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(consumer, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(consumer, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(consumer, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(consumer, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(consumer, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(consumer, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(consumer, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.fromItems(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);
    }

    private void concreteSlab(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider slab, IItemProvider ingredient) {
        ShapedRecipeBuilder.shapedRecipe(slab, 6)
                .key('#', ingredient)
                .patternLine("###")
                .addCriterion("has_concrete", this.hasItem(ingredient))
                .build(recipeConsumer);
    }

    private void concreteStairs(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider stairs, IItemProvider ingredient) {
        ShapedRecipeBuilder.shapedRecipe(stairs, 4)
                .key('#', ingredient)
                .patternLine("#  ")
                .patternLine("## ")
                .patternLine("###")
                .addCriterion("has_concrete", this.hasItem(ingredient))
                .build(recipeConsumer);
    }

    private void concreteWall(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider wall, IItemProvider ingredient) {
        ShapedRecipeBuilder.shapedRecipe(wall, 6)
                .key('#', ingredient)
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_concrete", this.hasItem(ingredient))
                .build(recipeConsumer);
    }

    private void stonecutting(Consumer<IFinishedRecipe> recipeConsumer, IItemProvider result, Ingredient ingredient, int amount, IItemProvider type) {
        SingleItemRecipeBuilder.stonecuttingRecipe(ingredient, result, amount)
                .addCriterion("has_concrete", this.hasItem(type))
                .build(recipeConsumer, new ResourceLocation(MoreConcrete.MODID, result.asItem() + "_from_" + type.asItem() + "_stonecutting"));
    }
}
