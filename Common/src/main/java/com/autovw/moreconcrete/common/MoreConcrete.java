package com.autovw.moreconcrete.common;

import com.autovw.moreconcrete.common.platform.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

/**
 * @author Autovw
 */
public class MoreConcrete
{
    public static final String MOD_ID = "moreconcrete";
    private static final Logger LOGGER = LogUtils.getLogger();
    private static IPlatformHelper platformHelper;

    private MoreConcrete()
    {
    }

    public static void init(IPlatformHelper platformHelper)
    {
        LOGGER.info("Initializing platform helper for More Concrete!");
        MoreConcrete.platformHelper = platformHelper;
    }

    /**
     * @return Instance of platform helper, based on used mod loader
     */
    public static IPlatformHelper getPlatformHelper()
    {
        return MoreConcrete.platformHelper;
    }
}
