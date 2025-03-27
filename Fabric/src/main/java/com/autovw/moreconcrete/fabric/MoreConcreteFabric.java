package com.autovw.moreconcrete.fabric;

import com.autovw.moreconcrete.common.MoreConcrete;
import com.autovw.moreconcrete.fabric.core.ModBlocks;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
public class MoreConcreteFabric implements ModInitializer
{
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize()
    {
        MoreConcrete.init(FabricPlatformHelper.getInstance());

        ModBlocks.init();
        MoreConcreteTab.init();
    }
}
