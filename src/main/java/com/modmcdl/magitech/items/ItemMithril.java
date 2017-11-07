package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemMithril extends Item {

	public ItemMithril() {
		setUnlocalizedName(Reference.MagitechItems.MITHRIL.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.MITHRIL.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
