package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemPage extends Item{
	
	public ItemPage() {
		setUnlocalizedName(Reference.MagitechItems.PAGE.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.PAGE.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
