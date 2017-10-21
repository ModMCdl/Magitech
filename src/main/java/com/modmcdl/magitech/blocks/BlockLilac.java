package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockLilac extends BlockCrops {
	
	public BlockLilac() {
		setUnlocalizedName(Reference.MagitechBlocks.DARK_LILAC.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.DARK_LILAC.getRegistryName());
	}

	@Override
	protected Item getSeed() {
		return ModItems.lilacbloom;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.lilacbloom;
	}
	
}
