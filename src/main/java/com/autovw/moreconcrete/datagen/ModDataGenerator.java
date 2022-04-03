package com.autovw.moreconcrete.datagen;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.datagen.providers.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = MoreConcrete.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    private ModDataGenerator() { }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new ModBlockTagsProvider(generator, helper));
            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(new ModLootTableProvider(generator));
        }

        if (event.includeClient()) {
            generator.addProvider(new ModBlockStatesProvider(generator, helper));
        }
    }
}
