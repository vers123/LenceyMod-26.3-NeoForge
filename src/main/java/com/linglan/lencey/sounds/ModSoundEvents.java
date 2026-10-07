package com.linglan.lencey.sounds;

import com.linglan.lencey.LenceyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(
            BuiltInRegistries.SOUND_EVENT, LenceyMod.MOD_ID);

    // Genshin Impact
    public static final Holder<SoundEvent> MUSIC_DISC_MAIN_THEME = register("music_disc.main_theme");
    public static final Holder<SoundEvent> MUSIC_DISC_DREAM_ARIA = register("music_disc.dream_aria");
    public static final Holder<SoundEvent> MUSIC_DISC_THE_ROAD_NOT_TAKEN = register("music_disc.the_road_not_taken");

    // 4th Anniversary Theme Song
    public static final Holder<SoundEvent> MUSIC_DISC_PASSING_MEMORIES_ZH = register("music_disc.passing_memories_zh");
    public static final Holder<SoundEvent> MUSIC_DISC_PASSING_MEMORIES_EN = register("music_disc.passing_memories_en");
    public static final Holder<SoundEvent> MUSIC_DISC_PASSING_MEMORIES_JA = register("music_disc.passing_memories_ja");

    // 5th Anniversary Theme Song
    public static final Holder<SoundEvent> MUSIC_DISC_THE_LONG_WAY_HOME_ZH = register("music_disc.the_long_way_home_zh");
    public static final Holder<SoundEvent> MUSIC_DISC_THE_LONG_WAY_HOME_EN = register("music_disc.the_long_way_home_en");

    // 6th Anniversary Theme Song
    public static final Holder<SoundEvent> MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH = register("music_disc.a_letter_from_the_wind_zh");
    public static final Holder<SoundEvent> MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN = register("music_disc.a_letter_from_the_wind_en");
    public static final Holder<SoundEvent> MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA = register("music_disc.a_letter_from_the_wind_ja");
    public static final Holder<SoundEvent> MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO = register("music_disc.a_letter_from_the_wind_ko");

    private static Holder<SoundEvent> register(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(
                Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, name)));
    }
}
