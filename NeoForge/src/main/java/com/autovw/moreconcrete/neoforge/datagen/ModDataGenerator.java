package com.autovw.moreconcrete.neoforge.datagen;

import com.autovw.moreconcrete.neoforge.datagen.providers.ModModelProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModBlockTagsProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModLootTableProvider;
import com.autovw.moreconcrete.neoforge.datagen.providers.ModRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.autovw.moreconcrete.common.MoreConcrete.MOD_ID;

/**
 * @author Autovw
 */
@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModDataGenerator
{
    private ModDataGenerator()
    {
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // server
        event.addProvider(new ModBlockTagsProvider(packOutput, lookupProvider, MOD_ID));
        event.addProvider(new ModRecipeProvider.Runner(packOutput, lookupProvider));
        event.addProvider(new ModLootTableProvider(packOutput, lookupProvider));

        // client
        event.addProvider(new ModModelProvider(packOutput, MOD_ID));
    }
}
