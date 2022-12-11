package com.autovw.moreconcrete;

import com.autovw.moreconcrete.core.ModBlocks;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.autovw.moreconcrete.MoreConcrete.MODID;

/**
 * @author Autovw
 */
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreConcreteTab {
    private MoreConcreteTab() {
    }

    @SubscribeEvent
    public static void onCreativeModeTabEvent(final CreativeModeTabEvent.BuildContents event) {
        if (event.getTab().equals(CreativeModeTabs.COLORED_BLOCKS)) {
            // Slabs
            event.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
            event.accept(ModBlocks.PINK_CONCRETE_SLAB.get());
            event.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
            event.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
            event.accept(ModBlocks.RED_CONCRETE_SLAB.get());
            event.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());

            // Stairs
            event.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
            event.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());

            // Walls
            event.accept(ModBlocks.WHITE_CONCRETE_WALL.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_WALL.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIME_CONCRETE_WALL.get());
            event.accept(ModBlocks.PINK_CONCRETE_WALL.get());
            event.accept(ModBlocks.GRAY_CONCRETE_WALL.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
            event.accept(ModBlocks.CYAN_CONCRETE_WALL.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_WALL.get());
            event.accept(ModBlocks.BLUE_CONCRETE_WALL.get());
            event.accept(ModBlocks.BROWN_CONCRETE_WALL.get());
            event.accept(ModBlocks.GREEN_CONCRETE_WALL.get());
            event.accept(ModBlocks.RED_CONCRETE_WALL.get());
            event.accept(ModBlocks.BLACK_CONCRETE_WALL.get());

            // Fences
            event.accept(ModBlocks.WHITE_CONCRETE_FENCE.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_FENCE.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_FENCE.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_FENCE.get());
            event.accept(ModBlocks.LIME_CONCRETE_FENCE.get());
            event.accept(ModBlocks.PINK_CONCRETE_FENCE.get());
            event.accept(ModBlocks.GRAY_CONCRETE_FENCE.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get());
            event.accept(ModBlocks.CYAN_CONCRETE_FENCE.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_FENCE.get());
            event.accept(ModBlocks.BLUE_CONCRETE_FENCE.get());
            event.accept(ModBlocks.BROWN_CONCRETE_FENCE.get());
            event.accept(ModBlocks.GREEN_CONCRETE_FENCE.get());
            event.accept(ModBlocks.RED_CONCRETE_FENCE.get());
            event.accept(ModBlocks.BLACK_CONCRETE_FENCE.get());
        }

        if (event.getTab().equals(CreativeModeTabs.REDSTONE_BLOCKS)) {
            // Levers
            event.accept(ModBlocks.WHITE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIME_CONCRETE_LEVER.get());
            event.accept(ModBlocks.PINK_CONCRETE_LEVER.get());
            event.accept(ModBlocks.GRAY_CONCRETE_LEVER.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
            event.accept(ModBlocks.CYAN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BLUE_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BROWN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.GREEN_CONCRETE_LEVER.get());
            event.accept(ModBlocks.RED_CONCRETE_LEVER.get());
            event.accept(ModBlocks.BLACK_CONCRETE_LEVER.get());

            // Pressure Plates
            event.accept(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
            event.accept(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());

            // Fence Gates
            event.accept(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.LIME_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.PINK_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.RED_CONCRETE_FENCE_GATE.get());
            event.accept(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());

            // Buttons
            event.accept(ModBlocks.WHITE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIME_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.PINK_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.GRAY_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.CYAN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BLUE_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BROWN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.GREEN_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.RED_CONCRETE_BUTTON.get());
            event.accept(ModBlocks.BLACK_CONCRETE_BUTTON.get());
        }
    }
}
