package com.autovw.moreconcrete.neoforge;

import com.autovw.moreconcrete.common.platform.IPlatformHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

/**
 * @author Autovw
 */
public final class NeoForgePlatformHelper implements IPlatformHelper
{
    private static IPlatformHelper instance;

    public static IPlatformHelper getInstance()
    {
        if (instance == null)
        {
            instance = new NeoForgePlatformHelper();
        }
        return instance;
    }

    private NeoForgePlatformHelper()
    {
    }

    @Override
    public Platform getPlatform()
    {
        return Platform.NEOFORGE;
    }

    @Override
    public boolean isModLoaded(String modId)
    {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isProduction()
    {
        return FMLLoader.isProduction();
    }
}
