package com.autovw.moreconcrete.datagen;

import com.autovw.moreconcrete.MoreConcrete;
import com.autovw.moreconcrete.datagen.providers.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * Author: Autovw
 */
@Mod.EventBusSubscriber(modid = MoreConcrete.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    private ModDataGenerator() { }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStatesProvider(generator, helper));
        generator.addProvider(new ModItemModelProvider(generator, helper));
        generator.addProvider(new ModBlockTagsProvider(generator));
        generator.addProvider(new ModRecipeProvider(generator));
        generator.addProvider(new ModLootTableProvider(generator));
    }
}
