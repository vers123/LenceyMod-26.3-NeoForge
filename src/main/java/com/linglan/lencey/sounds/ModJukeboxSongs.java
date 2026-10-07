package com.linglan.lencey.sounds;

import com.linglan.lencey.LenceyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.JukeboxSong;

public class ModJukeboxSongs {
    // Genshin Impact
    public static final ResourceKey<JukeboxSong> MAIN_THEME = createKey("main_theme");
    public static final ResourceKey<JukeboxSong> DREAM_ARIA = createKey("dream_aria");
    public static final ResourceKey<JukeboxSong> THE_ROAD_NOT_TAKEN = createKey("the_road_not_taken");

    // 4th Anniversary Theme Song
    public static final ResourceKey<JukeboxSong> PASSING_MEMORIES_ZH = createKey("passing_memories_zh");
    public static final ResourceKey<JukeboxSong> PASSING_MEMORIES_EN = createKey("passing_memories_en");
    public static final ResourceKey<JukeboxSong> PASSING_MEMORIES_JA = createKey("passing_memories_ja");

    // 5th Anniversary Theme Song
    public static final ResourceKey<JukeboxSong> THE_LONG_WAY_HOME_ZH = createKey("the_long_way_home_zh");
    public static final ResourceKey<JukeboxSong> THE_LONG_WAY_HOME_EN = createKey("the_long_way_home_en");

    // 6th Anniversary Theme Song
    public static final ResourceKey<JukeboxSong> A_LETTER_FROM_THE_WIND_ZH = createKey("a_letter_from_the_wind_zh");
    public static final ResourceKey<JukeboxSong> A_LETTER_FROM_THE_WIND_EN = createKey("a_letter_from_the_wind_en");
    public static final ResourceKey<JukeboxSong> A_LETTER_FROM_THE_WIND_JA = createKey("a_letter_from_the_wind_ja");
    public static final ResourceKey<JukeboxSong> A_LETTER_FROM_THE_WIND_KO = createKey("a_letter_from_the_wind_ko");

    private static ResourceKey<JukeboxSong> createKey(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, name));
    }
}
