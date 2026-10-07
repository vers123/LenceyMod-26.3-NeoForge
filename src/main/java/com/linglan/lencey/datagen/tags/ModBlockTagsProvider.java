package com.linglan.lencey.datagen.tags;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, LenceyMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LENCEY_BLOCK.key());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LENCEY_BLOCK.key());
    }
}
