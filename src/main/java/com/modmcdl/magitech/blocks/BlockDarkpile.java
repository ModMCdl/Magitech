package com.modmcdl.magitech.blocks;

import java.util.List;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDarkpile extends Block{
	
	private static final AxisAlignedBB PILE = new AxisAlignedBB(0, 0, 0, 1, .0625 * 6, 1);
	
	public BlockDarkpile() {
		super(Material.SAND);
		setUnlocalizedName(Reference.MagitechBlocks.DARKPILE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.DARKPILE.getRegistryName());
		setSoundType(SoundType.SAND);
		setHardness(1.0F);
		setResistance(2.0F);
		
		setCreativeTab(Magitech.tabMagirites);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override //Block transparency
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override //Bounding box
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return PILE;
	}
	
	@Override //Collision box
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, PILE);
	}
}
