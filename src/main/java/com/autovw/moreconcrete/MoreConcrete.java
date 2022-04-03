package com.autovw.moreconcrete;

import com.autovw.moreconcrete.core.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Author: Autovw
 */
@Mod(MoreConcrete.MODID)
public class MoreConcrete {
    public static final Logger LOGGER = LogUtils.getLogger();
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
