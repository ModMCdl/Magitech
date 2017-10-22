package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModBlocks;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockThaummix extends BlockCrops {
	
	public BlockThaummix() {
		setUnlocalizedName(Reference.MagitechBlocks.THAUMMIX.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.THAUMMIX.getRegistryName());
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.thaumseed;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.thaumseed;
	}
	
}
