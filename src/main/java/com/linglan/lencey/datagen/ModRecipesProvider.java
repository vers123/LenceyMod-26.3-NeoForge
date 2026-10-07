package com.linglan.lencey.datagen;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.Nullable;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildRecipes() {
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LENCEY.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.LENCEY_BLOCK.get());

        // Genshin Impact
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.GENSHIN_IMPACT_ICON.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.GENSHIN_IMPACT_ICON_BLOCK.get());
    }

    @Override
    protected void nineBlockStorageRecipes(RecipeCategory unpackedFormCategory, ItemLike unpackedForm, RecipeCategory packedFormCategory, ItemLike packedForm) {
        nineBlockStorageRecipes(
                unpackedFormCategory, unpackedForm, packedFormCategory, packedForm,
                getSimpleRecipeName(packedForm), null,
                getSimpleRecipeName(unpackedForm), null
        );
    }

    protected void nineBlockStorageRecipes(
            RecipeCategory unpackedFormCategory,
            ItemLike unpackedForm,
            RecipeCategory packedFormCategory,
            ItemLike packedForm,
            String packingRecipeId,
            @Nullable String packingRecipeGroup,
            String unpackingRecipeId,
            @Nullable String unpackingRecipeGroup
    ) {
        this.shapeless(unpackedFormCategory, unpackedForm, 9)
                .requires(packedForm)
                .group(unpackingRecipeGroup)
                .unlockedBy(getHasName(packedForm), this.has(packedForm))
                .save(this.output, ResourceKey.create(
                        Registries.RECIPE, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID,
                                Identifier.parse(unpackingRecipeId)
                                        .getPath()))
                );
        this.shaped(packedFormCategory, packedForm)
                .define('#', unpackedForm)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(packingRecipeGroup)
                .unlockedBy(getHasName(unpackedForm), this.has(unpackedForm))
                .save(this.output, ResourceKey.create(
                        Registries.RECIPE, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID,
                                Identifier.parse(packingRecipeId)
                                        .getPath()))
                );
    }
}
