package com.linglan.lencey.datagen;

import com.linglan.lencey.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider(Context output) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, output);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.LENCEY_BLOCK.get());

        // Genshin Impact
        dropSelf(ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value).collect(Collectors.toList());
    }
}
