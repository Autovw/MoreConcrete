package com.autovw.moreconcrete.forge;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.forge.core.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
@Mod(MoreConcrete.MOD_ID)
public class MoreConcreteForge
{
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreConcreteForge()
    {
        MoreConcrete.init(ForgePlatformHelper.getInstance());

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
        MoreConcreteTab.TABS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
}
