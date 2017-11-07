package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemGlass_ingot extends Item {

	public ItemGlass_ingot() {
		setUnlocalizedName(Reference.MagitechItems.GLASS_INGOT.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.GLASS_INGOT.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
