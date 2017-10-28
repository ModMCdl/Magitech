package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockAbselom extends BlockBush {
	
	public BlockAbselom() {
		setUnlocalizedName(Reference.MagitechBlocks.ABSELOM.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.ABSELOM.getRegistryName());
		setCreativeTab(Magitech.tabMagiplant);
	}
	
}
