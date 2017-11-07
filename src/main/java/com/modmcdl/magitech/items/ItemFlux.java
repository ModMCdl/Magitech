package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemFlux extends Item {

	public ItemFlux() {
		setUnlocalizedName(Reference.MagitechItems.FLUX.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.FLUX.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
