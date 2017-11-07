package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemAura_metal extends Item {

	public ItemAura_metal() {
		setUnlocalizedName(Reference.MagitechItems.AURAURUM.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.AURAURUM.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
