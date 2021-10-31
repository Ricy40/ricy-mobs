package com.ricy40.ricy_mobs.core.init;

import com.ricy40.ricy_mobs.RicyMobs;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, RicyMobs.MOD_ID);

	public static final RegistryObject<Item> RICYMOBS = ITEMS.register("ricymobs",
			() -> new Item(new Item.Properties().tab(RicyMobs.RICYMOBS_GROUP).rarity(Rarity.COMMON)));
}
	