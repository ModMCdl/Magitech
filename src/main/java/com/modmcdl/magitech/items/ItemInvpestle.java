package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;

public class ItemInvpestle extends Item{
	
	public ItemInvpestle() {
		setUnlocalizedName(Reference.MagitechItems.INVPESTLE.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.INVPESTLE.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
		setContainerItem(this);

	}
	
	
	
}
