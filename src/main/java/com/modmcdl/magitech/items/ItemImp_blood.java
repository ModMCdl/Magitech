package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.item.Item;

public class ItemImp_blood extends Item{
	
	public ItemImp_blood() {
		setUnlocalizedName(Reference.MagitechItems.IMP_BLOOD.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.IMP_BLOOD.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
	}

}
