package com.autovw.moreconcrete.fabric.datagen.providers;

import com.autovw.moreconcrete.common.MoreConcrete;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.SlabBlock;

import java.util.concurrent.CompletableFuture;

/**
 * @author Autovw
 */
public class ModBlockLootTableProvider extends FabricBlockLootTableProvider
{
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup)
    {
        super(dataOutput, registryLookup);
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
