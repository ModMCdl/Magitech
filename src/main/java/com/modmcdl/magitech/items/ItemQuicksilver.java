package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemQuicksilver extends Item {

	public ItemQuicksilver() {
		setUnlocalizedName(Reference.MagitechItems.QUICKSILVER.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.QUICKSILVER.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
