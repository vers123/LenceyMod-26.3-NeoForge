package com.linglan.lencey.block;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LenceyMod.MOD_ID);

    public static final DeferredBlock<Block> LENCEY_BLOCK = registerBlock("lencey_block", Block::new,
            () -> BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F), true);

    // Genshin Impact
    public static final DeferredBlock<Block> GENSHIN_IMPACT_ICON_BLOCK = registerBlock("genshin/icon_block", Block::new,
            () -> BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.5F, 6.0F), true);

    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> func, Supplier<BlockBehaviour.Properties> properties, boolean shouldRegisterItem) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, func, properties);
        if (shouldRegisterItem) ModItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> func, boolean shouldRegisterItem) {
        DeferredBlock<T> block = BLOCKS.registerBlock(name, func);
        if (shouldRegisterItem) ModItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        LenceyMod.LOGGER.info("Registering Mod Blocks for " + LenceyMod.MOD_ID);
    }
}
