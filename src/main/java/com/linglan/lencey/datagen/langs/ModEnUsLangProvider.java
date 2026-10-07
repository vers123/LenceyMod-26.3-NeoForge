package com.linglan.lencey.datagen.langs;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Lencey
        add("itemGroup.lencey_tab", "Lencey Mod Tab");

        add(ModItems.LENCEY.get(), "Lencey");
        add(ModBlocks.LENCEY_BLOCK.get(), "Lencey Block");

        // Genshin Impact
        add("itemGroup.genshin_impact", "Genshin Impact");

        add(ModItems.GENSHIN_IMPACT_ICON.get(), "Genshin Impact Icon");
        add(ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get(), "Genshin Impact Icon Block");

        add(ModItems.MUSIC_DISC_RADIANT_SPINCRYSTAL.get(), "Radiant Spincrystal");

        add(ModItems.MUSIC_DISC_MAIN_THEME.get(), "Main Theme");
        add("jukebox_song.lencey_mod.main_theme", "Main Theme");
        add(ModItems.MUSIC_DISC_DREAM_ARIA.get(), "Dream Aria");
        add("jukebox_song.lencey_mod.dream_aria", "Dream Aria");
        add(ModItems.THE_ROAD_NOT_TAKEN.get(), "The Road Not Taken");
        add("jukebox_song.lencey_mod.the_road_not_taken", "The Road Not Taken");

        // 4th Anniversary Theme Song
        add(ModItems.PASSING_MEMORIES_ZH.get(), "《经过》");
        add("jukebox_song.lencey_mod.passing_memories_zh", "《经过》");
        add(ModItems.PASSING_MEMORIES_EN.get(), "Passing Memories");
        add("jukebox_song.lencey_mod.passing_memories_en", "Passing Memories");
        add(ModItems.PASSING_MEMORIES_JA.get(), "記憶の旅");
        add("jukebox_song.lencey_mod.passing_memories_ja", "記憶の旅");

        // 5th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_ZH.get(), "《回家的路》");
        add("jukebox_song.lencey_mod.the_long_way_home_zh", "《回家的路》");
        add(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_EN.get(), "The Long Way Home");
        add("jukebox_song.lencey_mod.the_long_way_home_en", "The Long Way Home");

        // 6th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH.get(), "《风的来信》");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_zh", "《风的来信》");
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN.get(), "A Letter From The Wind");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_en", "A Letter From The Wind");
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA.get(), "風の思い出");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_ja", "風の思い出");
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO.get(), "바람의 편지");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_ko", "바람의 편지");

        // Config
        add("lencey_mod.configuration.title", "LenceyMod Configs");
        add("lencey_mod.configuration.section.lencey_mod.common.toml", "LenceyMod Configs");
        add("lencey_mod.configuration.section.lencey_mod.common.toml.title", "LenceyMod Configs");
        add("lencey_mod.configuration.items", "Item List");
        add("lencey_mod.configuration.logDirtBlock", "Log Dirt Block");
        add("lencey_mod.configuration.magicNumberIntroduction", "Magic Number Text");
        add("lencey_mod.configuration.magicNumber", "Magic Number");
    }
}

