package com.linglan.lencey.datagen.tags;

import com.linglan.lencey.LenceyMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, LenceyMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

    }
}
