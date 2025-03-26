package com.autovw.moreconcrete.neoforge.datagen.providers;

import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput recipeOutput)
    {
        super(registries, recipeOutput);
    }

    @Override
    protected void buildRecipes()
    {
        HolderLookup.RegistryLookup<Item> registryLookup = this.registries.lookupOrThrow(Registries.ITEM);

        // Slabs
        concreteSlab(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB.get(), Blocks.WHITE_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Blocks.ORANGE_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Blocks.MAGENTA_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Blocks.YELLOW_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB.get(), Blocks.LIME_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB.get(), Blocks.PINK_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB.get(), Blocks.GRAY_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB.get(), Blocks.CYAN_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Blocks.PURPLE_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB.get(), Blocks.BLUE_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB.get(), Blocks.BROWN_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB.get(), Blocks.GREEN_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB.get(), Blocks.RED_CONCRETE);
        concreteSlab(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB.get(), Blocks.BLACK_CONCRETE);

        stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB.get(), Ingredient.of(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


        // Stairs
        concreteStairs(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Blocks.WHITE_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Blocks.ORANGE_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Blocks.MAGENTA_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Blocks.YELLOW_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS.get(), Blocks.LIME_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS.get(), Blocks.PINK_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Blocks.GRAY_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Blocks.CYAN_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Blocks.PURPLE_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Blocks.BLUE_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Blocks.BROWN_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Blocks.GREEN_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS.get(), Blocks.RED_CONCRETE);
        concreteStairs(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Blocks.BLACK_CONCRETE);

        stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Walls
        concreteWall(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL.get(), Blocks.WHITE_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL.get(), Blocks.ORANGE_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Blocks.MAGENTA_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL.get(), Blocks.YELLOW_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL.get(), Blocks.LIME_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL.get(), Blocks.PINK_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL.get(), Blocks.GRAY_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL.get(), Blocks.CYAN_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL.get(), Blocks.PURPLE_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL.get(), Blocks.BLUE_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL.get(), Blocks.BROWN_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL.get(), Blocks.GREEN_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.RED_CONCRETE_WALL.get(), Blocks.RED_CONCRETE);
        concreteWall(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL.get(), Blocks.BLACK_CONCRETE);

        stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL.get(), Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL.get(), Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL.get(), Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL.get(), Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL.get(), Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL.get(), Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL.get(), Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL.get(), Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL.get(), Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_WALL.get(), Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
        stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL.get(), Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


        // Levers
        concreteLever(registryLookup, output, ModBlocks.WHITE_CONCRETE_LEVER.get(), Blocks.WHITE_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.ORANGE_CONCRETE_LEVER.get(), Blocks.ORANGE_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_LEVER.get(), Blocks.MAGENTA_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.YELLOW_CONCRETE_LEVER.get(), Blocks.YELLOW_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.LIME_CONCRETE_LEVER.get(), Blocks.LIME_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.PINK_CONCRETE_LEVER.get(), Blocks.PINK_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.GRAY_CONCRETE_LEVER.get(), Blocks.GRAY_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.CYAN_CONCRETE_LEVER.get(), Blocks.CYAN_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.PURPLE_CONCRETE_LEVER.get(), Blocks.PURPLE_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.BLUE_CONCRETE_LEVER.get(), Blocks.BLUE_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.BROWN_CONCRETE_LEVER.get(), Blocks.BROWN_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.GREEN_CONCRETE_LEVER.get(), Blocks.GREEN_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.RED_CONCRETE_LEVER.get(), Blocks.RED_CONCRETE);
        concreteLever(registryLookup, output, ModBlocks.BLACK_CONCRETE_LEVER.get(), Blocks.BLACK_CONCRETE);


        // Pressure Plates
        concretePressurePlate(registryLookup, output, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get(), Blocks.WHITE_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get(), Blocks.ORANGE_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get(), Blocks.MAGENTA_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get(), Blocks.YELLOW_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIME_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get(), Blocks.PINK_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.GRAY_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get(), Blocks.CYAN_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get(), Blocks.PURPLE_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLUE_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get(), Blocks.BROWN_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get(), Blocks.GREEN_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get(), Blocks.RED_CONCRETE);
        concretePressurePlate(registryLookup, output, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get(), Blocks.BLACK_CONCRETE);


        // Fences
        concreteFence(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE.get(), Blocks.WHITE_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE.get(), Blocks.ORANGE_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE.get(), Blocks.YELLOW_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE.get(), Blocks.LIME_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE.get(), Blocks.PINK_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE.get(), Blocks.GRAY_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE.get(), Blocks.CYAN_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE.get(), Blocks.PURPLE_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE.get(), Blocks.BLUE_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE.get(), Blocks.BROWN_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE.get(), Blocks.GREEN_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE.get(), Blocks.RED_CONCRETE);
        concreteFence(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE.get(), Blocks.BLACK_CONCRETE);


        // Fence Gates
        concreteFenceGate(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE_GATE.get(), Blocks.WHITE_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get(), Blocks.ORANGE_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get(), Blocks.MAGENTA_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get(), Blocks.YELLOW_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE_GATE.get(), Blocks.LIME_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE_GATE.get(), Blocks.PINK_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE_GATE.get(), Blocks.GRAY_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE_GATE.get(), Blocks.CYAN_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get(), Blocks.PURPLE_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE_GATE.get(), Blocks.BLUE_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE_GATE.get(), Blocks.BROWN_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE_GATE.get(), Blocks.GREEN_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE_GATE.get(), Blocks.RED_CONCRETE);
        concreteFenceGate(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE_GATE.get(), Blocks.BLACK_CONCRETE);


        // Buttons
        concreteButton(registryLookup, output, ModBlocks.WHITE_CONCRETE_BUTTON.get(), Blocks.WHITE_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.ORANGE_CONCRETE_BUTTON.get(), Blocks.ORANGE_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_BUTTON.get(), Blocks.MAGENTA_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get(), Blocks.LIGHT_BLUE_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.YELLOW_CONCRETE_BUTTON.get(), Blocks.YELLOW_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.LIME_CONCRETE_BUTTON.get(), Blocks.LIME_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.PINK_CONCRETE_BUTTON.get(), Blocks.PINK_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.GRAY_CONCRETE_BUTTON.get(), Blocks.GRAY_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get(), Blocks.LIGHT_GRAY_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.CYAN_CONCRETE_BUTTON.get(), Blocks.CYAN_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.PURPLE_CONCRETE_BUTTON.get(), Blocks.PURPLE_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.BLUE_CONCRETE_BUTTON.get(), Blocks.BLUE_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.BROWN_CONCRETE_BUTTON.get(), Blocks.BROWN_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.GREEN_CONCRETE_BUTTON.get(), Blocks.GREEN_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.RED_CONCRETE_BUTTON.get(), Blocks.RED_CONCRETE);
        concreteButton(registryLookup, output, ModBlocks.BLACK_CONCRETE_BUTTON.get(), Blocks.BLACK_CONCRETE);
    }

    private void concreteSlab(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike slab, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.BUILDING_BLOCKS, slab, 6)
                .define('#', ingredient)
                .pattern("###")
                .group("concrete_slab")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private void concreteStairs(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike stairs, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.BUILDING_BLOCKS, stairs, 4)
                .define('#', ingredient)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .group("concrete_stairs")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private void concreteWall(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike wall, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.BUILDING_BLOCKS, wall, 6)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .group("concrete_wall")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private void stonecutting(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike result, Ingredient ingredient, int amount, ItemLike type)
    {
        ResourceLocation resultId = BuiltInRegistries.ITEM.getKey(result.asItem());
        ResourceLocation typeId = BuiltInRegistries.ITEM.getKey(type.asItem());
        SingleItemRecipeBuilder.stonecutting(ingredient, RecipeCategory.BUILDING_BLOCKS, result, amount)
                .unlockedBy("has_concrete", has(type))
                .save(output, ResourceLocation.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_from_" + typeId.getPath() + "_stonecutting").toString());
    }

    private void concretePressurePlate(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike pressurePlate, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.REDSTONE, pressurePlate, 1)
                .define('#', ingredient)
                .pattern("##")
                .group("concrete_pressure_plate")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);
    }

    private void concreteLever(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike lever, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.REDSTONE, lever, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X")
                .pattern("#")
                .group("concrete_lever")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private void concreteFence(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike fence, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.DECORATIONS, fence, 3)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("#X#")
                .pattern("#X#")
                .group("concrete_fence")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private void concreteFenceGate(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike fenceGate, ItemLike ingredient)
    {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.DECORATIONS, fenceGate, 1)
                .define('#', ingredient)
                .define('X', Items.STICK)
                .pattern("X#X")
                .pattern("X#X")
                .group("concrete_fence_gate")
                .unlockedBy("has_concrete", has(ingredient))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);
    }

    private void concreteButton(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike button, ItemLike ingredient)
    {
        ShapelessRecipeBuilder.shapeless(registryLookup, RecipeCategory.REDSTONE, button, 1)
                .requires(ingredient)
                .group("concrete_button")
                .unlockedBy("has_concrete", has(ingredient))
                .save(output);

        stonecutting(registryLookup, output, button, Ingredient.of(ingredient), 1, ingredient);
    }

    public static final class Runner extends RecipeProvider.Runner
    {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
        {
            super(output, lookupProvider);
        }

        protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output)
        {
            return new ModRecipeProvider(lookupProvider, output);
        }

        public String getName()
        {
            return "More Concrete recipes";
        }
    }
}
