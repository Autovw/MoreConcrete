package com.autovw.moreconcrete.fabric.datagen;

import com.autovw.moreconcrete.fabric.datagen.providers.ModBlockLootTableProvider;
import com.autovw.moreconcrete.fabric.datagen.providers.ModBlockTagsProvider;
import com.autovw.moreconcrete.fabric.datagen.providers.ModModelProvider;
import com.autovw.moreconcrete.fabric.datagen.providers.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * @author Autovw
 */
public class ModDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator)
    {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModBlockTagsProvider::new);
    }
}
