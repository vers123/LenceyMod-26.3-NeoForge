package com.linglan.lencey.datagen.langs;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModKoKrLangProvider extends LanguageProvider {
    public ModKoKrLangProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID, "ko_kr");
    }

    @Override
    protected void addTranslations() {
        // Genshin Impact
        add("itemGroup.genshin_impact", "원신");

        // 6th Anniversary Theme Song
        add(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO.get(), "바람의 편지");
        add("jukebox_song.lencey_mod.a_letter_from_the_wind_ko", "바람의 편지");
    }
}
