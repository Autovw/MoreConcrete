package com.autovw.moreconcrete.neoforge.datagen;

import com.autovw.moreconcrete.neoforge.datagen.providers.ModBlockStatesProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModBlockTagsProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModLootTableProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.autovw.moreconcrete.common.MoreConcrete.MOD_ID;

/**
 * @author Autovw
 */
@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModDataGenerator
{
    private ModDataGenerator()
    {
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        // server
        generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, MOD_ID, helper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput, lookupProvider));

        // client
        generator.addProvider(event.includeClient(), new ModBlockStatesProvider(packOutput, helper));
    }
}
