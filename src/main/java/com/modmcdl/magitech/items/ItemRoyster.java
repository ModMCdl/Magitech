package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.ItemFood;

public class ItemRoyster extends ItemFood{
	
	public ItemRoyster(int amount, float saturation, boolean wolfFood) {
		super(amount, saturation, wolfFood);
		setUnlocalizedName(Reference.MagitechItems.ROYSTER.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.ROYSTER.getRegistryName());
		setCreativeTab(null);
	}
	
}
