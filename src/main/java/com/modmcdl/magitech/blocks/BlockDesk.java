package com.modmcdl.magitech.blocks;


import java.util.List;

import com.modmcdl.magitech.Reference;

import com.modmcdl.magitech.Magitech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockDesk extends Block {
	

	public BlockDesk() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.MagitechBlocks.DESK.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.DESK.getRegistryName());
		setHardness(2.0F);
		setResistance(10.0F);
		
		setCreativeTab(Magitech.tabMagitech);
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
		
	}
}