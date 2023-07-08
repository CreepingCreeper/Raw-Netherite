package com.creeping_creeper.raw_netherite.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Debris_Chunk_Tab = new CreativeModeTab("Debris_Chunk") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Raw_Netherite.get());
        }
    };
}
