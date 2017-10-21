package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockEmbersoul extends BlockCrops {
	
	public BlockEmbersoul() {
		setUnlocalizedName(Reference.MagitechBlocks.EMBERSOUL.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.EMBERSOUL.getRegistryName());
	}

	@Override
	protected Item getSeed() {
		return ModItems.hotsprout;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.hotsprout;
	}
	
}

