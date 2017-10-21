package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemMsalt extends Item {

	public ItemMsalt() {
		setUnlocalizedName(Reference.MagitechItems.MSALT.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.MSALT.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}

