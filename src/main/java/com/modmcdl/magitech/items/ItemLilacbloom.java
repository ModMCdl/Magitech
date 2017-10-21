package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemLilacbloom extends Item {
	
	public ItemLilacbloom() {
		setUnlocalizedName(Reference.MagitechItems.LILACBLOOM.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.LILACBLOOM.getRegistryName());
		setCreativeTab(Magitech.tabMagiplant);
	}
	
	

}
