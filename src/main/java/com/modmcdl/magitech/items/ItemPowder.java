package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemPowder extends Item {

	public ItemPowder() {
		setUnlocalizedName(Reference.MagitechItems.POWDER.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.POWDER.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
