package com.autovw.moreconcrete.neoforge;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.neoforge.core.ModBlocks;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
@Mod(MoreConcrete.MOD_ID)
public class MoreConcreteNeoForge
{
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreConcreteNeoForge(IEventBus bus)
    {
        MoreConcrete.init(NeoForgePlatformHelper.getInstance());

        bus.addListener(this::commonSetup);

        ModBlocks.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
}
