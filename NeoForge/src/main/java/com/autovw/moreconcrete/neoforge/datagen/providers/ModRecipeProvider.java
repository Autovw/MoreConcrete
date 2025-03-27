package com.autovw.moreconcrete.neoforge.datagen.providers;

import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(packOutput, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output)
    {
        // Slabs
        concreteSlab(output, ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        concreteSlab(output, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        concreteSlab(output, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        concreteSlab(output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteSlab(output, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        concreteSlab(output, ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        concreteSlab(output, ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        concreteSlab(output, ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        concreteSlab(output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteSlab(output, ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        concreteSlab(output, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        concreteSlab(output, ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        concreteSlab(output, ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        concreteSlab(output, ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        concreteSlab(output, ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        concreteSlab(output, ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);

        stonecutting(output, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
        stonecutting(output, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
        stonecutting(output, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(output, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
        stonecutting(output, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
        stonecutting(output, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
        stonecutting(output, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(output, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
        stonecutting(output, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
        stonecutting(output, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
        stonecutting(output, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
        stonecutting(output, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
        stonecutting(output, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.of(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
        stonecutting(output, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


        // Stairs
        concreteStairs(output, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        concreteStairs(output, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        concreteStairs(output, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        concreteStairs(output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteStairs(output, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        concreteStairs(output, ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        concreteStairs(output, ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        concreteStairs(output, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        concreteStairs(output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteStairs(output, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        concreteStairs(output, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        concreteStairs(output, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        concreteStairs(output, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        concreteStairs(output, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        concreteStairs(output, ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        concreteStairs(output, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);

        stonecutting(output, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(output, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(output, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(output, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(output, ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(output, ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(output, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(output, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(output, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(output, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(output, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(output, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(output, ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(output, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Walls
        concreteWall(output, ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);
        concreteWall(output, ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);
        concreteWall(output, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);
        concreteWall(output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteWall(output, ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);
        concreteWall(output, ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);
        concreteWall(output, ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);
        concreteWall(output, ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);
        concreteWall(output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteWall(output, ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);
        concreteWall(output, ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);
        concreteWall(output, ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);
        concreteWall(output, ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);
        concreteWall(output, ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);
        concreteWall(output, ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);
        concreteWall(output, ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);

        stonecutting(output, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(output, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(output, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(output, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(output, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(output, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(output, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(output, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(output, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(output, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(output, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(output, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(output, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(output, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Levers
        concreteLever(output, ModBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE);
        concreteLever(output, ModBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE);
        concreteLever(output, ModBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE);
        concreteLever(output, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteLever(output, ModBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE);
        concreteLever(output, ModBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE);
        concreteLever(output, ModBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE);
        concreteLever(output, ModBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE);
        concreteLever(output, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteLever(output, ModBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE);
        concreteLever(output, ModBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE);
        concreteLever(output, ModBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE);
        concreteLever(output, ModBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE);
        concreteLever(output, ModBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE);
        concreteLever(output, ModBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE);
        concreteLever(output, ModBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE);


        // Pressure Plates
        concretePressurePlate(output, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        concretePressurePlate(output, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        concretePressurePlate(output, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        concretePressurePlate(output, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concretePressurePlate(output, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        concretePressurePlate(output, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        concretePressurePlate(output, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        concretePressurePlate(output, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        concretePressurePlate(output, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concretePressurePlate(output, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        concretePressurePlate(output, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        concretePressurePlate(output, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        concretePressurePlate(output, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        concretePressurePlate(output, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        concretePressurePlate(output, ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        concretePressurePlate(output, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);


        // Fences
        concreteFence(output, ModBlocks.WHITE_CONCRETE_FENCE.get(), Blocks.WHITE_CONCRETE);
        concreteFence(output, ModBlocks.ORANGE_CONCRETE_FENCE.get(), Blocks.ORANGE_CONCRETE);
        concreteFence(output, ModBlocks.MAGENTA_CONCRETE_FENCE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFence(output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFence(output, ModBlocks.YELLOW_CONCRETE_FENCE.get(), Blocks.YELLOW_CONCRETE);
        concreteFence(output, ModBlocks.LIME_CONCRETE_FENCE.get(), Blocks.LIME_CONCRETE);
        concreteFence(output, ModBlocks.PINK_CONCRETE_FENCE.get(), Blocks.PINK_CONCRETE);
        concreteFence(output, ModBlocks.GRAY_CONCRETE_FENCE.get(), Blocks.GRAY_CONCRETE);
        concreteFence(output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFence(output, ModBlocks.CYAN_CONCRETE_FENCE.get(), Blocks.CYAN_CONCRETE);
        concreteFence(output, ModBlocks.PURPLE_CONCRETE_FENCE.get(), Blocks.PURPLE_CONCRETE);
        concreteFence(output, ModBlocks.BLUE_CONCRETE_FENCE.get(), Blocks.BLUE_CONCRETE);
        concreteFence(output, ModBlocks.BROWN_CONCRETE_FENCE.get(), Blocks.BROWN_CONCRETE);
        concreteFence(output, ModBlocks.GREEN_CONCRETE_FENCE.get(), Blocks.GREEN_CONCRETE);
        concreteFence(output, ModBlocks.RED_CONCRETE_FENCE.get(), Blocks.RED_CONCRETE);
        concreteFence(output, ModBlocks.BLACK_CONCRETE_FENCE.get(), Blocks.BLACK_CONCRETE);


        // Fence Gates
        concreteFenceGate(output, ModBlocks.WHITE_CONCRETE_FENCE_GATE.get(), Blocks.WHITE_CONCRETE);
        concreteFenceGate(output, ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get(), Blocks.ORANGE_CONCRETE);
        concreteFenceGate(output, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFenceGate(output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFenceGate(output, ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get(), Blocks.YELLOW_CONCRETE);
        concreteFenceGate(output, ModBlocks.LIME_CONCRETE_FENCE_GATE.get(), Blocks.LIME_CONCRETE);
        concreteFenceGate(output, ModBlocks.PINK_CONCRETE_FENCE_GATE.get(), Blocks.PINK_CONCRETE);
        concreteFenceGate(output, ModBlocks.GRAY_CONCRETE_FENCE_GATE.get(), Blocks.GRAY_CONCRETE);
        concreteFenceGate(output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFenceGate(output, ModBlocks.CYAN_CONCRETE_FENCE_GATE.get(), Blocks.CYAN_CONCRETE);
        concreteFenceGate(output, ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get(), Blocks.PURPLE_CONCRETE);
        concreteFenceGate(output, ModBlocks.BLUE_CONCRETE_FENCE_GATE.get(), Blocks.BLUE_CONCRETE);
        concreteFenceGate(output, ModBlocks.BROWN_CONCRETE_FENCE_GATE.get(), Blocks.BROWN_CONCRETE);
        concreteFenceGate(output, ModBlocks.GREEN_CONCRETE_FENCE_GATE.get(), Blocks.GREEN_CONCRETE);
        concreteFenceGate(output, ModBlocks.RED_CONCRETE_FENCE_GATE.get(), Blocks.RED_CONCRETE);
        concreteFenceGate(output, ModBlocks.BLACK_CONCRETE_FENCE_GATE.get(), Blocks.BLACK_CONCRETE);


        // Buttons
        concreteButton(output, ModBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        concreteButton(output, ModBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        concreteButton(output, ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        concreteButton(output, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteButton(output, ModBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        concreteButton(output, ModBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        concreteButton(output, ModBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);
        concreteButton(output, ModBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        concreteButton(output, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteButton(output, ModBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        concreteButton(output, ModBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        concreteButton(output, ModBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        concreteButton(output, ModBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        concreteButton(output, ModBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        concreteButton(output, ModBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        concreteButton(output, ModBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
    }

    private static void concreteSlab(RecipeOutput output, ItemLike slab, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6)
                .define('#', ingredient)
                .pattern("###")
                .group("concrete_slab")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private static void concreteStairs(RecipeOutput output, ItemLike stairs, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs, 4)
                .define('#', ingredient)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .group("concrete_stairs")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private static void concreteWall(RecipeOutput output, ItemLike wall, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall, 6)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .group("concrete_wall")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private static void stonecutting(RecipeOutput output, ItemLike result, Ingredient ingredient, int amount, ItemLike type)
    {
        ResourceLocation resultId = BuiltInRegistries.ITEM.getKey(result.asItem());
        ResourceLocation typeId = BuiltInRegistries.ITEM.getKey(type.asItem());
        SingleItemRecipeBuilder.stonecutting(ingredient, RecipeCategory.BUILDING_BLOCKS, result, amount)
                .unlockedBy("has_concrete", has(type))
                .save(output, ResourceLocation.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_from_" + typeId.getPath() + "_stonecutting"));
    }

    private static void concretePressurePlate(RecipeOutput output, ItemLike pressurePlate, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pressurePlate, 1)
                .define('#', ingredient)
                .pattern("##")
                .group("concrete_pressure_plate")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private static void concreteLever(RecipeOutput output, ItemLike lever, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, lever, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X")
                .pattern("#")
                .group("concrete_lever")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private static void concreteFence(RecipeOutput output, ItemLike fence, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fence, 3)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("#X#")
                .pattern("#X#")
                .group("concrete_fence")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private static void concreteFenceGate(RecipeOutput output, ItemLike fenceGate, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, fenceGate, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X#X")
                .pattern("X#X")
                .group("concrete_fence_gate")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private static void concreteButton(RecipeOutput output, ItemLike button, ItemLike ingredient)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, button, 1)
                .requires(ingredient)
                .group("concrete_button")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);

        stonecutting(output, button, Ingredient.of(ingredient), 1, ingredient);
    }
}
