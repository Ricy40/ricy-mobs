package com.ricy40.ricy_mobs.core.init;

import com.ricy40.ricy_mobs.RicyMobs;


import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RicyMobs.MOD_ID);



	//Register Method

	public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block > void registerBlockItem(String name, RegistryObject<T> block) {
		ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
				new Item.Properties().tab(RicyMobs.RICYMOBS_GROUP)));
	}
}