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
    public static void onCreativeModeTabEvent(CreativeModeTabEvent.BuildContents event) {
        event.register(CreativeModeTabs.COLORED_BLOCKS, ((enabledFlags, entries, hasPermissions) -> {
            // Slabs
            entries.accept(ModBlocks.WHITE_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.LIME_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.PINK_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.RED_CONCRETE_SLAB.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_SLAB.get());

            // Stairs
            entries.accept(ModBlocks.WHITE_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.LIME_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.PINK_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.RED_CONCRETE_STAIRS.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_STAIRS.get());

            // Walls
            entries.accept(ModBlocks.WHITE_CONCRETE_WALL.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_WALL.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_WALL.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_WALL.get());
            entries.accept(ModBlocks.LIME_CONCRETE_WALL.get());
            entries.accept(ModBlocks.PINK_CONCRETE_WALL.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_WALL.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_WALL.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_WALL.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_WALL.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_WALL.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_WALL.get());
            entries.accept(ModBlocks.RED_CONCRETE_WALL.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_WALL.get());

            // Fences
            entries.accept(ModBlocks.WHITE_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.LIME_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.PINK_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.RED_CONCRETE_FENCE.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_FENCE.get());
        }));

        event.register(CreativeModeTabs.REDSTONE_BLOCKS, ((enabledFlags, entries, hasPermissions) -> {
            // Levers
            entries.accept(ModBlocks.WHITE_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.LIME_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.PINK_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.RED_CONCRETE_LEVER.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_LEVER.get());

            // Pressure Plates
            entries.accept(ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.LIME_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.PINK_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.RED_CONCRETE_PRESSURE_PLATE.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE.get());

            // Fence Gates
            entries.accept(ModBlocks.WHITE_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.LIME_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.PINK_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.RED_CONCRETE_FENCE_GATE.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_FENCE_GATE.get());

            // Buttons
            entries.accept(ModBlocks.WHITE_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.ORANGE_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.MAGENTA_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.YELLOW_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.LIME_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.PINK_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.GRAY_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.CYAN_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.PURPLE_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.BLUE_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.BROWN_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.GREEN_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.RED_CONCRETE_BUTTON.get());
            entries.accept(ModBlocks.BLACK_CONCRETE_BUTTON.get());
        }));
    }
}
