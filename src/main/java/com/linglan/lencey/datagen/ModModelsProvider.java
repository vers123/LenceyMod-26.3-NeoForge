package com.linglan.lencey.datagen;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class ModModelsProvider extends ModelProvider {
    public ModModelsProvider(PackOutput output) {
        super(output, LenceyMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.LENCEY.get(), ModelTemplates.FLAT_ITEM);
        blockModels.createTrivialCube(ModBlocks.LENCEY_BLOCK.get());

        // Genshin Impact
        itemModels.generateFlatItem(ModItems.GENSHIN_IMPACT_ICON.get(), ModelTemplates.FLAT_ITEM);
        blockModels.createTrivialCube(ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get());

        itemModels.generateFlatItem(ModItems.MUSIC_DISC_RADIANT_SPINCRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.MUSIC_DISC_MAIN_THEME.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_DREAM_ARIA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.THE_ROAD_NOT_TAKEN.get(), ModelTemplates.FLAT_ITEM);

        // 4th Anniversary Theme Song
        itemModels.generateFlatItem(ModItems.PASSING_MEMORIES_ZH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PASSING_MEMORIES_EN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PASSING_MEMORIES_JA.get(), ModelTemplates.FLAT_ITEM);

        // 5th Anniversary Theme Song
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_ZH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_THE_LONG_WAY_HOME_EN.get(), ModelTemplates.FLAT_ITEM);

        // 6th Anniversary Theme Song
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_ZH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_EN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_JA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MUSIC_DISC_A_LETTER_FROM_THE_WIND_KO.get(), ModelTemplates.FLAT_ITEM);
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }
}
