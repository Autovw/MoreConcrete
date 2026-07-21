package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.fabric.core.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
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
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture)
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
                concreteSlab(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.CONCRETE.white());
                concreteSlab(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.CONCRETE.orange());
                concreteSlab(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.CONCRETE.magenta());
                concreteSlab(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.CONCRETE.lightBlue());
                concreteSlab(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.CONCRETE.yellow());
                concreteSlab(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB, Blocks.CONCRETE.lime());
                concreteSlab(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB, Blocks.CONCRETE.pink());
                concreteSlab(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.CONCRETE.gray());
                concreteSlab(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.CONCRETE.lightGray());
                concreteSlab(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CONCRETE.cyan());
                concreteSlab(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.CONCRETE.purple());
                concreteSlab(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.CONCRETE.blue());
                concreteSlab(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.CONCRETE.brown());
                concreteSlab(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.CONCRETE.green());
                concreteSlab(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB, Blocks.CONCRETE.red());
                concreteSlab(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.CONCRETE.black());

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.white()), 2, Blocks.CONCRETE.white());
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.orange()), 2, Blocks.CONCRETE.orange());
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.magenta()), 2, Blocks.CONCRETE.magenta());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightBlue()), 2, Blocks.CONCRETE.lightBlue());
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.yellow()), 2, Blocks.CONCRETE.yellow());
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lime()), 2, Blocks.CONCRETE.lime());
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.pink()), 2, Blocks.CONCRETE.pink());
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.gray()), 2, Blocks.CONCRETE.gray());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.lightGray()), 2, Blocks.CONCRETE.lightGray());
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.cyan()), 2, Blocks.CONCRETE.cyan());
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.purple()), 2, Blocks.CONCRETE.purple());
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.blue()), 2, Blocks.CONCRETE.blue());
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.brown()), 2, Blocks.CONCRETE.brown());
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.green()), 2, Blocks.CONCRETE.green());
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.red()), 2, Blocks.CONCRETE.red());
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.CONCRETE.black()), 2, Blocks.CONCRETE.black());


                // Stairs
                concreteStairs(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.CONCRETE.white());
                concreteStairs(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.CONCRETE.orange());
                concreteStairs(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.CONCRETE.magenta());
                concreteStairs(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.CONCRETE.lightBlue());
                concreteStairs(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.CONCRETE.yellow());
                concreteStairs(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.CONCRETE.lime());
                concreteStairs(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.CONCRETE.pink());
                concreteStairs(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.CONCRETE.gray());
                concreteStairs(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.CONCRETE.lightGray());
                concreteStairs(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CONCRETE.cyan());
                concreteStairs(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.CONCRETE.purple());
                concreteStairs(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.CONCRETE.blue());
                concreteStairs(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.CONCRETE.brown());
                concreteStairs(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.CONCRETE.green());
                concreteStairs(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS, Blocks.CONCRETE.red());
                concreteStairs(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.CONCRETE.black());

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.white()), 1, Blocks.CONCRETE.white());
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.orange()), 1, Blocks.CONCRETE.orange());
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.magenta()), 1, Blocks.CONCRETE.magenta());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightBlue()), 1, Blocks.CONCRETE.lightBlue());
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.yellow()), 1, Blocks.CONCRETE.yellow());
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lime()), 1, Blocks.CONCRETE.lime());
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.pink()), 1, Blocks.CONCRETE.pink());
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.gray()), 1, Blocks.CONCRETE.gray());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.lightGray()), 1, Blocks.CONCRETE.lightGray());
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.cyan()), 1, Blocks.CONCRETE.cyan());
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.purple()), 1, Blocks.CONCRETE.purple());
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.blue()), 1, Blocks.CONCRETE.blue());
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.brown()), 1, Blocks.CONCRETE.brown());
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.green()), 1, Blocks.CONCRETE.green());
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.red()), 1, Blocks.CONCRETE.red());
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Blocks.CONCRETE.black()), 1, Blocks.CONCRETE.black());


                // Walls
                concreteWall(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL, Blocks.CONCRETE.white());
                concreteWall(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.CONCRETE.orange());
                concreteWall(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.CONCRETE.magenta());
                concreteWall(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.CONCRETE.lightBlue());
                concreteWall(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.CONCRETE.yellow());
                concreteWall(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL, Blocks.CONCRETE.lime());
                concreteWall(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL, Blocks.CONCRETE.pink());
                concreteWall(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL, Blocks.CONCRETE.gray());
                concreteWall(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.CONCRETE.lightGray());
                concreteWall(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CONCRETE.cyan());
                concreteWall(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.CONCRETE.purple());
                concreteWall(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL, Blocks.CONCRETE.blue());
                concreteWall(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL, Blocks.CONCRETE.brown());
                concreteWall(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL, Blocks.CONCRETE.green());
                concreteWall(registryLookup, output, ModBlocks.RED_CONCRETE_WALL, Blocks.CONCRETE.red());
                concreteWall(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL, Blocks.CONCRETE.black());

                stonecutting(registryLookup, output, ModBlocks.WHITE_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.white()), 1, Blocks.CONCRETE.white());
                stonecutting(registryLookup, output, ModBlocks.ORANGE_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.orange()), 1, Blocks.CONCRETE.orange());
                stonecutting(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.magenta()), 1, Blocks.CONCRETE.magenta());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.lightBlue()), 1, Blocks.CONCRETE.lightBlue());
                stonecutting(registryLookup, output, ModBlocks.YELLOW_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.yellow()), 1, Blocks.CONCRETE.yellow());
                stonecutting(registryLookup, output, ModBlocks.LIME_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.lime()), 1, Blocks.CONCRETE.lime());
                stonecutting(registryLookup, output, ModBlocks.PINK_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.pink()), 1, Blocks.CONCRETE.pink());
                stonecutting(registryLookup, output, ModBlocks.GRAY_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.gray()), 1, Blocks.CONCRETE.gray());
                stonecutting(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.lightGray()), 1, Blocks.CONCRETE.lightGray());
                stonecutting(registryLookup, output, ModBlocks.CYAN_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.cyan()), 1, Blocks.CONCRETE.cyan());
                stonecutting(registryLookup, output, ModBlocks.PURPLE_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.purple()), 1, Blocks.CONCRETE.purple());
                stonecutting(registryLookup, output, ModBlocks.BLUE_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.blue()), 1, Blocks.CONCRETE.blue());
                stonecutting(registryLookup, output, ModBlocks.BROWN_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.brown()), 1, Blocks.CONCRETE.brown());
                stonecutting(registryLookup, output, ModBlocks.GREEN_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.green()), 1, Blocks.CONCRETE.green());
                stonecutting(registryLookup, output, ModBlocks.RED_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.red()), 1, Blocks.CONCRETE.red());
                stonecutting(registryLookup, output, ModBlocks.BLACK_CONCRETE_WALL, Ingredient.of(Blocks.CONCRETE.black()), 1, Blocks.CONCRETE.black());


                // Levers
                concreteLever(registryLookup, output, ModBlocks.WHITE_CONCRETE_LEVER, Blocks.CONCRETE.white());
                concreteLever(registryLookup, output, ModBlocks.ORANGE_CONCRETE_LEVER, Blocks.CONCRETE.orange());
                concreteLever(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_LEVER, Blocks.CONCRETE.magenta());
                concreteLever(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_LEVER, Blocks.CONCRETE.lightBlue());
                concreteLever(registryLookup, output, ModBlocks.YELLOW_CONCRETE_LEVER, Blocks.CONCRETE.yellow());
                concreteLever(registryLookup, output, ModBlocks.LIME_CONCRETE_LEVER, Blocks.CONCRETE.lime());
                concreteLever(registryLookup, output, ModBlocks.PINK_CONCRETE_LEVER, Blocks.CONCRETE.pink());
                concreteLever(registryLookup, output, ModBlocks.GRAY_CONCRETE_LEVER, Blocks.CONCRETE.gray());
                concreteLever(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_LEVER, Blocks.CONCRETE.lightGray());
                concreteLever(registryLookup, output, ModBlocks.CYAN_CONCRETE_LEVER, Blocks.CONCRETE.cyan());
                concreteLever(registryLookup, output, ModBlocks.PURPLE_CONCRETE_LEVER, Blocks.CONCRETE.purple());
                concreteLever(registryLookup, output, ModBlocks.BLUE_CONCRETE_LEVER, Blocks.CONCRETE.blue());
                concreteLever(registryLookup, output, ModBlocks.BROWN_CONCRETE_LEVER, Blocks.CONCRETE.brown());
                concreteLever(registryLookup, output, ModBlocks.GREEN_CONCRETE_LEVER, Blocks.CONCRETE.green());
                concreteLever(registryLookup, output, ModBlocks.RED_CONCRETE_LEVER, Blocks.CONCRETE.red());
                concreteLever(registryLookup, output, ModBlocks.BLACK_CONCRETE_LEVER, Blocks.CONCRETE.black());


                // Pressure Plates
                concretePressurePlate(registryLookup, output, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.white());
                concretePressurePlate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.orange());
                concretePressurePlate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.magenta());
                concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.lightBlue());
                concretePressurePlate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.yellow());
                concretePressurePlate(registryLookup, output, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.lime());
                concretePressurePlate(registryLookup, output, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.pink());
                concretePressurePlate(registryLookup, output, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.gray());
                concretePressurePlate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.lightGray());
                concretePressurePlate(registryLookup, output, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.cyan());
                concretePressurePlate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.purple());
                concretePressurePlate(registryLookup, output, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.blue());
                concretePressurePlate(registryLookup, output, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.brown());
                concretePressurePlate(registryLookup, output, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.green());
                concretePressurePlate(registryLookup, output, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.red());
                concretePressurePlate(registryLookup, output, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, Blocks.CONCRETE.black());


                // Fences
                concreteFence(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE, Blocks.CONCRETE.white());
                concreteFence(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE, Blocks.CONCRETE.orange());
                concreteFence(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE, Blocks.CONCRETE.magenta());
                concreteFence(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Blocks.CONCRETE.lightBlue());
                concreteFence(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE, Blocks.CONCRETE.yellow());
                concreteFence(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE, Blocks.CONCRETE.lime());
                concreteFence(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE, Blocks.CONCRETE.pink());
                concreteFence(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE, Blocks.CONCRETE.gray());
                concreteFence(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Blocks.CONCRETE.lightGray());
                concreteFence(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE, Blocks.CONCRETE.cyan());
                concreteFence(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE, Blocks.CONCRETE.purple());
                concreteFence(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE, Blocks.CONCRETE.blue());
                concreteFence(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE, Blocks.CONCRETE.brown());
                concreteFence(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE, Blocks.CONCRETE.green());
                concreteFence(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE, Blocks.CONCRETE.red());
                concreteFence(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE, Blocks.CONCRETE.black());


                // Fence Gates
                concreteFenceGate(registryLookup, output, ModBlocks.WHITE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.white());
                concreteFenceGate(registryLookup, output, ModBlocks.ORANGE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.orange());
                concreteFenceGate(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_FENCE_GATE, Blocks.CONCRETE.magenta());
                concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lightBlue());
                concreteFenceGate(registryLookup, output, ModBlocks.YELLOW_CONCRETE_FENCE_GATE, Blocks.CONCRETE.yellow());
                concreteFenceGate(registryLookup, output, ModBlocks.LIME_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lime());
                concreteFenceGate(registryLookup, output, ModBlocks.PINK_CONCRETE_FENCE_GATE, Blocks.CONCRETE.pink());
                concreteFenceGate(registryLookup, output, ModBlocks.GRAY_CONCRETE_FENCE_GATE, Blocks.CONCRETE.gray());
                concreteFenceGate(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE, Blocks.CONCRETE.lightGray());
                concreteFenceGate(registryLookup, output, ModBlocks.CYAN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.cyan());
                concreteFenceGate(registryLookup, output, ModBlocks.PURPLE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.purple());
                concreteFenceGate(registryLookup, output, ModBlocks.BLUE_CONCRETE_FENCE_GATE, Blocks.CONCRETE.blue());
                concreteFenceGate(registryLookup, output, ModBlocks.BROWN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.brown());
                concreteFenceGate(registryLookup, output, ModBlocks.GREEN_CONCRETE_FENCE_GATE, Blocks.CONCRETE.green());
                concreteFenceGate(registryLookup, output, ModBlocks.RED_CONCRETE_FENCE_GATE, Blocks.CONCRETE.red());
                concreteFenceGate(registryLookup, output, ModBlocks.BLACK_CONCRETE_FENCE_GATE, Blocks.CONCRETE.black());


                // Buttons
                concreteButton(registryLookup, output, ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.CONCRETE.white());
                concreteButton(registryLookup, output, ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.CONCRETE.orange());
                concreteButton(registryLookup, output, ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.CONCRETE.magenta());
                concreteButton(registryLookup, output, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.CONCRETE.lightBlue());
                concreteButton(registryLookup, output, ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.CONCRETE.yellow());
                concreteButton(registryLookup, output, ModBlocks.LIME_CONCRETE_BUTTON, Blocks.CONCRETE.lime());
                concreteButton(registryLookup, output, ModBlocks.PINK_CONCRETE_BUTTON, Blocks.CONCRETE.pink());
                concreteButton(registryLookup, output, ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.CONCRETE.gray());
                concreteButton(registryLookup, output, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.CONCRETE.lightGray());
                concreteButton(registryLookup, output, ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CONCRETE.cyan());
                concreteButton(registryLookup, output, ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.CONCRETE.purple());
                concreteButton(registryLookup, output, ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.CONCRETE.blue());
                concreteButton(registryLookup, output, ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.CONCRETE.brown());
                concreteButton(registryLookup, output, ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.CONCRETE.green());
                concreteButton(registryLookup, output, ModBlocks.RED_CONCRETE_BUTTON, Blocks.CONCRETE.red());
                concreteButton(registryLookup, output, ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.CONCRETE.black());

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
