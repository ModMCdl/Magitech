package com.modmcdl.magitech.items;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSaltmeat extends ItemFood {
	
	public ItemSaltmeat(int amount, float saturation, boolean wolfFood) {
		super(amount, saturation, wolfFood);
		setUnlocalizedName(Reference.MagitechItems.SALTMEAT.getUnlocalizedName());
		setRegistryName(Reference.MagitechItems.SALTMEAT.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);		
	}
	
	

}
