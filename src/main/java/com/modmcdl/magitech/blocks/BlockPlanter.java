package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class BlockPlanter extends Block{
	
	public BlockPlanter() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.MagitechBlocks.PLANTER.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.PLANTER.getRegistryName());
		setCreativeTab(Magitech.tabMagitech);
		setHardness(1.0F);
	}
	
	//Can be planted on?
	private boolean hasWater(World worldIn, BlockPos pos) {
		return true;
	}
	
	@Override //Allows all "bushes" exc. reeds and cactus to be planted on the block. Will be optimized
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
		if(world.getBlockState(pos.up()).getBlock() == Blocks.REEDS) 
		{
			return false;
		}
		
		if(world.getBlockState(pos.up()).getBlock() == Blocks.CACTUS) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
		
	@Override
	public boolean isFertile(World world, BlockPos pos) {
		return true;
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
