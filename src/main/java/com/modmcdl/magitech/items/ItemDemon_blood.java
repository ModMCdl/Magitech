package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemDemon_blood extends Item{
	
	public ItemDemon_blood() {
		setUnlocalizedName(Reference.MagitechItems.DEMON_BLOOD.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.DEMON_BLOOD.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
