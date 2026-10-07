package com.linglan.lencey.datagen.sounds;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.sounds.ModSoundEvents;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class ModSoundsProvider extends SoundDefinitionsProvider {
    public ModSoundsProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID);
    }

    @Override
    public void registerSounds() {
        //Genshin Impact
        this.add(ModSoundEvents.MUSIC_DISC_MAIN_THEME, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/main_theme")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_DREAM_ARIA, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/dream_aria")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_THE_ROAD_NOT_TAKEN, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/the_road_not_taken")
                        .stream(true)));

        // 4th Anniversary Theme Song
        this.add(ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_ZH, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/passing_memories_zh")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_EN, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/passing_memories_en")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_JA, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/passing_memories_ja")
                        .stream(true)));

        // 5th Anniversary Theme Song
        this.add(ModSoundEvents.MUSIC_DISC_THE_LONG_WAY_HOME_ZH, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/the_long_way_home_zh")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_THE_LONG_WAY_HOME_EN, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/the_long_way_home_en")
                        .stream(true)));

        // 6th Anniversary Theme Song
        this.add(ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/a_letter_from_the_wind_zh")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/a_letter_from_the_wind_en")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/a_letter_from_the_wind_ja")
                        .stream(true)));
        this.add(ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO, definition()
                .with(sound(LenceyMod.MOD_ID + ":" + "genshin/music_disc/a_letter_from_the_wind_ko")
                        .stream(true)));
    }
}

