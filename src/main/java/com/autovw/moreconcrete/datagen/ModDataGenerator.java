package com.autovw.moreconcrete.datagen;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.datagen.providers.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = MoreConcrete.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    private ModDataGenerator() {
    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        // server
        generator.addProvider(event.includeServer(), new ModBlockTagsProvider(generator, helper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));

        // client
        generator.addProvider(event.includeClient(), new ModBlockStatesProvider(generator, helper));
    }
}
