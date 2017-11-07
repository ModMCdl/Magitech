package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemMercury_ingot extends Item {

	public ItemMercury_ingot() {
		setUnlocalizedName(Reference.MagitechItems.MERCURY.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.MERCURY.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
