package com.autovw.moreconcrete.common.common;

/**
 * @since 1.6.0
 * Helper for class for colours, mainly exists to assist in sorting for creative tab
 * @author Autovw
 */
public enum Colour
{
    WHITE(1),
    ORANGE(7),
    MAGENTA(15),
    LIGHT_BLUE(12),
    YELLOW(8),
    LIME(9),
    PINK(16),
    GRAY(3),
    LIGHT_GRAY(2),
    CYAN(11),
    PURPLE(14),
    BLUE(13),
    BROWN(5),
    GREEN(10),
    RED(6),
    BLACK(4);

    private final String parentId;
    private final int displayPos;

    Colour(String parentId, int displayPos)
    {
        this.parentId = parentId;
        this.displayPos = displayPos;
    }

    Colour(int displayPos)
    {
        this("minecraft", displayPos);
    }

    public String getParentId()
    {
        return this.parentId;
    }

    public int getDisplayPos()
    {
        return this.displayPos;
    }
}
