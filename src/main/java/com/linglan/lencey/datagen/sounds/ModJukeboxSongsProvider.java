package com.linglan.lencey.datagen.sounds;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.sounds.ModJukeboxSongs;
import com.linglan.lencey.sounds.ModSoundEvents;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;

public class ModJukeboxSongsProvider {

    public static void bootstrap(BootstrapContext<JukeboxSong> context) {
        // Genshin Impact
        register(context, ModJukeboxSongs.MAIN_THEME, ModSoundEvents.MUSIC_DISC_MAIN_THEME, "main_theme", 106.0f, 1);
        register(context, ModJukeboxSongs.DREAM_ARIA, ModSoundEvents.MUSIC_DISC_DREAM_ARIA, "dream_aria", 98.0f, 2);
        register(context, ModJukeboxSongs.THE_ROAD_NOT_TAKEN, ModSoundEvents.MUSIC_DISC_THE_ROAD_NOT_TAKEN, "the_road_not_taken", 150.f, 3);

        // 4th Anniversary Theme Song
        register(context, ModJukeboxSongs.PASSING_MEMORIES_ZH, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_ZH, "passing_memories_zh", 215.0f, 1);
        register(context, ModJukeboxSongs.PASSING_MEMORIES_EN, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_EN, "passing_memories_en", 219.0f, 1);
        register(context, ModJukeboxSongs.PASSING_MEMORIES_JA, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES_JA, "passing_memories_ja", 217.0f, 1);

        // 5th Anniversary Theme Song
        register(context, ModJukeboxSongs.THE_LONG_WAY_HOME_ZH, ModSoundEvents.MUSIC_DISC_THE_LONG_WAY_HOME_ZH, "the_long_way_home_zh", 171.0f, 2);
        register(context, ModJukeboxSongs.THE_LONG_WAY_HOME_EN, ModSoundEvents.MUSIC_DISC_THE_LONG_WAY_HOME_EN, "the_long_way_home_en", 171.0f, 2);

        // 6th Anniversary Theme Song
        register(context, ModJukeboxSongs.A_LETTER_FROM_THE_WIND_ZH, ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH, "a_letter_from_the_wind_zh", 197.0f, 3);
        register(context, ModJukeboxSongs.A_LETTER_FROM_THE_WIND_EN, ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN, "a_letter_from_the_wind_en", 197.0f, 3);
        register(context, ModJukeboxSongs.A_LETTER_FROM_THE_WIND_JA, ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA, "a_letter_from_the_wind_ja", 197.0f, 3);
        register(context, ModJukeboxSongs.A_LETTER_FROM_THE_WIND_KO, ModSoundEvents.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO, "a_letter_from_the_wind_ko", 197.0f, 3);
    }

    private static void register(BootstrapContext<JukeboxSong> context,
                                 ResourceKey<JukeboxSong> songKey,
                                 Holder<SoundEvent> soundEvent,
                                 String descriptionName,
                                 float lengthInSeconds,
                                 int comparatorOutput) {
        context.register(songKey, new JukeboxSong(
                soundEvent,
                Component.translatable("jukebox_song." + LenceyMod.MOD_ID + "." + descriptionName),
                lengthInSeconds,
                comparatorOutput
        ));
    }
}
