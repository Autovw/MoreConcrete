package com.autovw.moreconcrete;

import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: Autovw
 */
@Mod(MoreConcrete.MODID)
public class MoreConcrete {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "moreconcrete";

    public MoreConcrete() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}
