package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemCrystal extends Item {

	public ItemCrystal() {
		setUnlocalizedName(Reference.MagitechItems.CRYSTAL.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.CRYSTAL.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
