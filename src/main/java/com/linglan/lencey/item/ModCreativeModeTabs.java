package com.linglan.lencey.item;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LenceyMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LENCEY_TAB = CREATIVE_MODE_TABS.register("lencey_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lencey_tab"))
            .icon(() -> ModItems.LENCEY.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.LENCEY.get());

                output.accept(ModBlocks.LENCEY_BLOCK.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GENSHIN_IMPACT_TAB = CREATIVE_MODE_TABS.register("genshin_impact", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.genshin_impact"))
            .icon(() -> ModItems.MUSIC_DISC_RADIANT_SPINCRYSTAL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Genshin Impact
                output.accept(ModItems.GENSHIN_IMPACT_ICON.get());
                output.accept(ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get());

                output.accept(ModItems.MUSIC_DISC_RADIANT_SPINCRYSTAL.get());

                output.accept(ModItems.MUSIC_DISC_MAIN_THEME.get());
                output.accept(ModItems.MUSIC_DISC_DREAM_ARIA.get());
                output.accept(ModItems.THE_ROAD_NOT_TAKEN.get());

                // 4th Anniversary Theme Song
                output.accept(ModItems.PASSING_MEMORIES_ZH.get());
                output.accept(ModItems.PASSING_MEMORIES_EN.get());
                output.accept(ModItems.PASSING_MEMORIES_JA.get());

                // 4th Anniversary Theme Song
                output.accept(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_ZH.get());
                output.accept(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_EN.get());

                // 4th Anniversary Theme Song
                output.accept(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH.get());
                output.accept(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN.get());
                output.accept(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA.get());
                output.accept(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
        LenceyMod.LOGGER.info("Registering Mod CreativeModeTabs for " + LenceyMod.MOD_ID);
    }
}
