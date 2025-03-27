package com.autovw.moreconcrete.common.common.block;

import java.util.Locale;

/**
 * @since 1.6.0
 * @author Autovw
 */
public enum BlockType
{
    BLOCK(1),
    SLAB(3),
    STAIRS(2),
    WALL(4),
    LEVER(7),
    PRESSURE_PLATE(8),
    FENCE(5),
    FENCE_GATE(6),
    BUTTON(9),
    MISC(10);

    public static BlockType parse(String blockType)
    {
        if (blockType != null)
        {
            try
            {
                return BlockType.valueOf(blockType.toUpperCase(Locale.ROOT));
            }
            catch (IllegalArgumentException e)
            {
                return BlockType.MISC;
            }
        }
        return BlockType.BLOCK;
    }

    private final int displayPos;

    BlockType(int displayPos)
    {
        this.displayPos = displayPos;
    }

    public int getDisplayPos()
    {
        return this.displayPos;
    }
}
