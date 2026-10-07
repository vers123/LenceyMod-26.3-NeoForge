package com.linglan.lencey.item;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.sounds.ModJukeboxSongs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LenceyMod.MOD_ID);

    public static final DeferredItem<Item> LENCEY = ITEMS.registerSimpleItem("lencey",
            p -> p);

    // Genshin Impact
    public static final DeferredItem<Item> GENSHIN_IMPACT_ICON = ITEMS.registerSimpleItem("genshin/icon");

    public static final DeferredItem<Item> MUSIC_DISC_RADIANT_SPINCRYSTAL = ITEMS.registerSimpleItem("genshin/music_disc/radiant_spincrystal",
            p -> p.stacksTo(1).rarity(Rarity.RARE));

    public static final DeferredItem<Item> MUSIC_DISC_MAIN_THEME = ITEMS.registerSimpleItem("genshin/music_disc/main_theme",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAIN_THEME));
    public static final DeferredItem<Item> MUSIC_DISC_DREAM_ARIA = ITEMS.registerSimpleItem("genshin/music_disc/dream_aria",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DREAM_ARIA));
    public static final DeferredItem<Item> THE_ROAD_NOT_TAKEN = ITEMS.registerSimpleItem("genshin/music_disc/the_road_not_taken",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.THE_ROAD_NOT_TAKEN));

    // 4th Anniversary Theme Song
    public static final DeferredItem<Item> PASSING_MEMORIES_ZH = ITEMS.registerSimpleItem("genshin/music_disc/passing_memories_zh",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES_ZH));
    public static final DeferredItem<Item> PASSING_MEMORIES_EN = ITEMS.registerSimpleItem("genshin/music_disc/passing_memories_en",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES_EN));
    public static final DeferredItem<Item> PASSING_MEMORIES_JA = ITEMS.registerSimpleItem("genshin/music_disc/passing_memories_ja",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES_JA));

    // 5th Anniversary Theme Song
    public static final DeferredItem<Item> MUSIC_DISC_THE_LONG_WAY_HOME_ZH = ITEMS.registerSimpleItem("genshin/music_disc/the_long_way_home_zh",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.THE_LONG_WAY_HOME_ZH));
    public static final DeferredItem<Item> MUSIC_DISC_THE_LONG_WAY_HOME_EN = ITEMS.registerSimpleItem("genshin/music_disc/the_long_way_home_en",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.THE_LONG_WAY_HOME_EN));

    // 6th Anniversary Theme Song
    public static final DeferredItem<Item> MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH = ITEMS.registerSimpleItem("genshin/music_disc/a_letter_from_the_wind_zh",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_LETTER_FROM_THE_WIND_ZH));
    public static final DeferredItem<Item> MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN = ITEMS.registerSimpleItem("genshin/music_disc/a_letter_from_the_wind_en",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_LETTER_FROM_THE_WIND_EN));
    public static final DeferredItem<Item> MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA = ITEMS.registerSimpleItem("genshin/music_disc/a_letter_from_the_wind_ja",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_LETTER_FROM_THE_WIND_JA));
    public static final DeferredItem<Item> MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO = ITEMS.registerSimpleItem("genshin/music_disc/a_letter_from_the_wind_ko",
            p -> p.stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.A_LETTER_FROM_THE_WIND_KO));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        LenceyMod.LOGGER.info("Registering Mod Items for " + LenceyMod.MOD_ID);
    }
}


