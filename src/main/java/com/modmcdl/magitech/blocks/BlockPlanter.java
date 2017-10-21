package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockPlanter extends Block{
	
	public BlockPlanter() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.MagitechBlocks.PLANTER.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.PLANTER.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
		setHardness(1.0F);
	}
	
	//Model Overrides
	
		@Override
			public boolean isOpaqueCube(IBlockState state) {
				return false;
			}

		@Override
			public BlockRenderLayer getBlockLayer() {
				return BlockRenderLayer.CUTOUT;
			}

}
