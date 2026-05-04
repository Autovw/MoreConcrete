package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.SlabBlock;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockLootTableProvider extends FabricBlockLootSubProvider
{
    public ModBlockLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookup)
    {
        super(output, registryLookup);
    }

    @Override
    public void generate()
    {
        // Generate loot tables for slabs
        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> predicate instanceof SlabBlock)
                .forEach(block -> this.add(block, this::createSlabItemTable));

        // Generate loot tables for everything else
        BuiltInRegistries.BLOCK.stream().filter((block) -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(MoreConcrete.MOD_ID))
                .filter(predicate -> !(predicate instanceof SlabBlock))
                .forEach(this::dropSelf);
    }
}
