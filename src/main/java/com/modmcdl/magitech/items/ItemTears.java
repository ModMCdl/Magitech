package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemTears extends Item{
	
	public ItemTears() {
		setUnlocalizedName(Reference.MagitechItems.TEARS.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.TEARS.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
