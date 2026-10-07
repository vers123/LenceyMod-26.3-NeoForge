package com.linglan.lencey.datagen.langs;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModJaJpLangProvider extends LanguageProvider {
    public ModJaJpLangProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID, "ja_jp");
    }

    @Override
    protected void addTranslations() {
        // Genshin Impact
        add("itemGroup.genshin_impact", "原神");

        // 4th Anniversary Theme Song
        add(ModItems.PASSING_MEMORIES_JA.get(), "記憶の旅");
        add("jukebox_song.lencey_mod.passing_memories_ja", "記憶の旅");

        // 6th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA.get(), "風の思い出");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_ja", "風の思い出");
    }
}
