package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;

public class ItemAntikythera extends Item{
	
	public ItemAntikythera() {
		setUnlocalizedName(Reference.MagitechItems.ANTIKYTHERA.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.ANTIKYTHERA.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);

	}
}
