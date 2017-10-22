package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockUniflora extends BlockBush{
	
	public BlockUniflora() {
		setUnlocalizedName(Reference.MagitechBlocks.IPIPE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.IPIPE.getRegistryName());
		setCreativeTab(Magitech.tabMagiplant);
		
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state) {
		return state.getBlock() == Blocks.MYCELIUM;
	}

}
