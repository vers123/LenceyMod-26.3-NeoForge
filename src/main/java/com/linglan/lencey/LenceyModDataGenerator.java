package com.linglan.lencey;

import com.linglan.lencey.datagen.*;
import com.linglan.lencey.datagen.langs.ModEnUsLangProvider;
import com.linglan.lencey.datagen.langs.ModJaJpLangProvider;
import com.linglan.lencey.datagen.langs.ModKoKrLangProvider;
import com.linglan.lencey.datagen.langs.ModZhCnLangProvider;
import com.linglan.lencey.datagen.ModModelsProvider;
import com.linglan.lencey.datagen.sounds.ModJukeboxSongsProvider;
import com.linglan.lencey.datagen.ModRecipesProvider;
import com.linglan.lencey.datagen.sounds.ModSoundsProvider;
import com.linglan.lencey.datagen.tags.ModBlockTagsProvider;
import com.linglan.lencey.datagen.tags.ModItemTagsProvider;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = LenceyMod.MOD_ID)
public class LenceyModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        // JUKEBOX_SONG is in vanilla's WORLD_BUILDER, so it must be registered as a world registry
        event.createWorldRegistryObjects(new RegistrySetBuilder()
                .add(Registries.JUKEBOX_SONG, ModJukeboxSongsProvider::bootstrap)
        );

        event.createReloadableRegistryObjects(new RegistrySetBuilder()
                .add(RecipeProvider.asBootstrap(ModRecipesProvider::new))
                .add(Registries.LOOT_TABLE, new LootTableProvider(
                        Set.<ResourceKey<LootTable>>of(),
                        List.of(new LootTableProvider.SubProviderEntry(
                                ModBlockLootTablesProvider::new,
                                LootContextParamSets.BLOCK
                        ))
                ))
        );

        event.createProvider(ModBlockTagsProvider::new);
        event.createProvider(ModItemTagsProvider::new);
        event.createProvider(ModEnUsLangProvider::new);
        event.createProvider(ModZhCnLangProvider::new);
        event.createProvider(ModJaJpLangProvider::new);
        event.createProvider(ModKoKrLangProvider::new);
        event.createProvider(ModSoundsProvider::new);
        event.createProvider(ModModelsProvider::new);
    }
}
