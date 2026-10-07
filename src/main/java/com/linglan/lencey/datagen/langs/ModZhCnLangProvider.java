package com.linglan.lencey.datagen.langs;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        // Genshin Impact
        add("itemGroup.genshin_impact", "原神");

        add(ModItems.GENSHIN_IMPACT_ICON.get(), "原神图标");
        add(ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get(), "原神图标方块");

        add(ModItems.MUSIC_DISC_RADIANT_SPINCRYSTAL.get(), "旋曜玉帛");

        add(ModItems.MUSIC_DISC_MAIN_THEME.get(), "《原神主题曲》");
        add("jukebox_song.lencey_mod.main_theme", "《原神主题曲》");
        add(ModItems.MUSIC_DISC_DREAM_ARIA.get(), "《梦之哀叹》");
        add("jukebox_song.lencey_mod.dream_aria", "《梦之哀叹》");
        add(ModItems.THE_ROAD_NOT_TAKEN.get(), "《未行之路》");
        add("jukebox_song.lencey_mod.the_road_not_taken", "《未行之路》");

        // 4th Anniversary Theme Song
        add(ModItems.PASSING_MEMORIES_ZH.get(), "《经过》");
        add("jukebox_song.lencey_mod.passing_memories_zh", "《经过》");

        // 5th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_ZH.get(), "《回家的路》");
        add("jukebox_song.lencey_mod.the_long_way_home_zh", "《回家的路》");

        // 6th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH.get(), "《风的来信》");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_zh", "《风的来信》");
    }
}

