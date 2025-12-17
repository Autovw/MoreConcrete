package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.fabric.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput)
    {
        return new RecipeProvider(provider, recipeOutput)
        {
            @Override
            public void buildRecipes()
            {
                HolderLookup.RegistryLookup<Item> registryLookup = provider.lookupOrThrow(Registries.ITEM);

                // Slabs
                concreteSlab(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
                concreteSlab(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.WHITE_CONCRETE), 2, Blocks.WHITE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.ORANGE_CONCRETE), 2, Blocks.ORANGE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.MAGENTA_CONCRETE), 2, Blocks.MAGENTA_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 2, Blocks.LIGHT_BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.YELLOW_CONCRETE), 2, Blocks.YELLOW_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.LIME_CONCRETE), 2, Blocks.LIME_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.PINK_CONCRETE), 2, Blocks.PINK_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.GRAY_CONCRETE), 2, Blocks.GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 2, Blocks.LIGHT_GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CYAN_CONCRETE), 2, Blocks.CYAN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.PURPLE_CONCRETE), 2, Blocks.PURPLE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.BLUE_CONCRETE), 2, Blocks.BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.BROWN_CONCRETE), 2, Blocks.BROWN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.GREEN_CONCRETE), 2, Blocks.GREEN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.RED_CONCRETE), 2, Blocks.RED_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.BLACK_CONCRETE), 2, Blocks.BLACK_CONCRETE);


                // Stairs
                concreteStairs(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                concreteStairs(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


                // Walls
                concreteWall(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                concreteWall(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL, Ingredient.of(Blocks.WHITE_CONCRETE), 1, Blocks.WHITE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL, Ingredient.of(Blocks.ORANGE_CONCRETE), 1, Blocks.ORANGE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL, Ingredient.of(Blocks.MAGENTA_CONCRETE), 1, Blocks.MAGENTA_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE), 1, Blocks.LIGHT_BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL, Ingredient.of(Blocks.YELLOW_CONCRETE), 1, Blocks.YELLOW_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL, Ingredient.of(Blocks.LIME_CONCRETE), 1, Blocks.LIME_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL, Ingredient.of(Blocks.PINK_CONCRETE), 1, Blocks.PINK_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL, Ingredient.of(Blocks.GRAY_CONCRETE), 1, Blocks.GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE), 1, Blocks.LIGHT_GRAY_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL, Ingredient.of(Blocks.CYAN_CONCRETE), 1, Blocks.CYAN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL, Ingredient.of(Blocks.PURPLE_CONCRETE), 1, Blocks.PURPLE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL, Ingredient.of(Blocks.BLUE_CONCRETE), 1, Blocks.BLUE_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL, Ingredient.of(Blocks.BROWN_CONCRETE), 1, Blocks.BROWN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL, Ingredient.of(Blocks.GREEN_CONCRETE), 1, Blocks.GREEN_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_WALL, Ingredient.of(Blocks.RED_CONCRETE), 1, Blocks.RED_CONCRETE);
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL, Ingredient.of(Blocks.BLACK_CONCRETE), 1, Blocks.BLACK_CONCRETE);


                // Levers
                concreteLever(registryLookup, output, ModBlocks.WHITE_CONCRETE_LEVER, Blocks.WHITE_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.ORANGE_CONCRETE_LEVER, Blocks.ORANGE_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_LEVER, Blocks.MAGENTA_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER, Blocks.LIGHT_BLUE_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.YELLOW_CONCRETE_LEVER, Blocks.YELLOW_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.LIME_CONCRETE_LEVER, Blocks.LIME_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.PINK_CONCRETE_LEVER, Blocks.PINK_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.GRAY_CONCRETE_LEVER, Blocks.GRAY_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER, Blocks.LIGHT_GRAY_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.CYAN_CONCRETE_LEVER, Blocks.CYAN_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.PURPLE_CONCRETE_LEVER, Blocks.PURPLE_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.BLUE_CONCRETE_LEVER, Blocks.BLUE_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.BROWN_CONCRETE_LEVER, Blocks.BROWN_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.GREEN_CONCRETE_LEVER, Blocks.GREEN_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.RED_CONCRETE_LEVER, Blocks.RED_CONCRETE);
                concreteLever(registryLookup, output, ModBlocks.BLACK_CONCRETE_LEVER, Blocks.BLACK_CONCRETE);


                // Pressure Plates
                concretePressurePlate(registryLookup, output, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, Blocks.WHITE_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.ORANGE_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.MAGENTA_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_BLUE_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.YELLOW_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, Blocks.LIME_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, Blocks.PINK_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, Blocks.GRAY_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_GRAY_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CYAN_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.PURPLE_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, Blocks.BLUE_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, Blocks.BROWN_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, Blocks.GREEN_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, Blocks.RED_CONCRETE);
                concretePressurePlate(registryLookup, output, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, Blocks.BLACK_CONCRETE);


                // Fences
                concreteFence(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE, Blocks.WHITE_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE, Blocks.ORANGE_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE, Blocks.MAGENTA_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Blocks.LIGHT_BLUE_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE, Blocks.YELLOW_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE, Blocks.LIME_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE, Blocks.PINK_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE, Blocks.GRAY_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Blocks.LIGHT_GRAY_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE, Blocks.CYAN_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE, Blocks.PURPLE_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE, Blocks.BLUE_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE, Blocks.BROWN_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE, Blocks.GREEN_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE, Blocks.RED_CONCRETE);
                concreteFence(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE, Blocks.BLACK_CONCRETE);


                // Fence Gates
                concreteFenceGate(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE_GATE, Blocks.WHITE_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE_GATE, Blocks.ORANGE_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, Blocks.MAGENTA_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, Blocks.LIGHT_BLUE_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE_GATE, Blocks.YELLOW_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE_GATE, Blocks.LIME_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE_GATE, Blocks.PINK_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE_GATE, Blocks.GRAY_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, Blocks.LIGHT_GRAY_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE_GATE, Blocks.CYAN_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE_GATE, Blocks.PURPLE_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE_GATE, Blocks.BLUE_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE_GATE, Blocks.BROWN_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE_GATE, Blocks.GREEN_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE_GATE, Blocks.RED_CONCRETE);
                concreteFenceGate(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE_GATE, Blocks.BLACK_CONCRETE);


                // Buttons
                concreteButton(registryLookup, output, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);
                concreteButton(registryLookup, output, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
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
                Identifier resultId = BuiltInRegistries.ITEM.getKey(result.asItem());
                Identifier typeId = BuiltInRegistries.ITEM.getKey(type.asItem());
                SingleItemRecipeBuilder.stonecutting(ingredient, RecipeCategory.BUILDING_BLOCKS, result, amount)
                        .unlockedBy("has_concrete", has(type))
                        .save(output, Identifier.fromNamespaceAndPath(resultId.getNamespace(), resultId.getPath() + "_from_" + typeId.getPath() + "_stonecutting").toString());
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
        };
    }

    @Override
    public String getName()
    {
        return "More Concrete Recipe Provider";
    }
}
