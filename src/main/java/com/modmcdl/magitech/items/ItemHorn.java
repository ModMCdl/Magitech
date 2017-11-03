package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemHorn extends Item{
	
	public ItemHorn() {
		setUnlocalizedName(Reference.MagitechItems.HORN.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.HORN.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
