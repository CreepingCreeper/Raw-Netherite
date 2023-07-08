package com.creeping_creeper.raw_netherite.registry;

import com.creeping_creeper.raw_netherite.RawNetherite;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RawNetherite.MOD_ID);
        public static final RegistryObject<Item> Raw_Netherite = ITEMS.register("raw_netherite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));
        public static final RegistryObject<Item> Netherite_Scrap_Nugget = ITEMS.register("netherite_scrap_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));
        public static final RegistryObject<Item> Netherite_Scrap_Dust = ITEMS.register("netherite_scrap_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));
        static final RegistryObject<Item> Crushed_Debris = ITEMS.register("crushed_debris", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));
        public static final RegistryObject<Item> Clump_Raw_Netherite = ITEMS.register("clump_raw_netherite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));
        public static final RegistryObject<Item> Gravel_Raw_Netherite = ITEMS.register("gravel_raw_netherite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Debris_Chunk_Tab).fireResistant()
        ));

   public static void regeisters(IEventBus eventBus){
       ITEMS.register(eventBus);
   }
}



