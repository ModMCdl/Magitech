package com.modmcdl.magitech.blocks;

import java.util.List;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPestle extends Block {

	private static final AxisAlignedBB PESTLE_BOX = new AxisAlignedBB(0, 0, 0, 1, .0625 * 7, 1);
	
	public BlockPestle() {
		super(Material.PISTON);
		setUnlocalizedName(Reference.MagitechBlocks.PESTLE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.PESTLE.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
		setHardness(0.5F);

		
	}
	
	//Everything Under: Positioning Overrides

		//Not necessary? Updating block model
	
	//Everything Under: Model Overrides
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
	
	@Override //Bounding box
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return PESTLE_BOX;
	}
	
	@Override //Collision box
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, PESTLE_BOX);
	}
	

}
