package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemChronotum extends Item {

	public ItemChronotum() {
		setUnlocalizedName(Reference.MagitechItems.CHRONOTUM.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.CHRONOTUM.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
