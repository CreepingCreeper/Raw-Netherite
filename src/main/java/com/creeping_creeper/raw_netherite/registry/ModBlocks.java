package com.creeping_creeper.raw_netherite.registry;

import com.creeping_creeper.raw_netherite.RawNetherite;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RawNetherite.MOD_ID);

    public static final RegistryObject<Block> Raw_Netherite_Scrap_Block = registerBlock("raw_netherite_scrap_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).strength(30f).explosionResistance(1200).requiresCorrectToolForDrops()),
            ModCreativeModeTab.Debris_Chunk_Tab);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab).fireResistant()));
    }
    public static void Register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
