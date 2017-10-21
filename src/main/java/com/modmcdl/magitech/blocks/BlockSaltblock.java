package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSaltblock extends Block{
	
	public BlockSaltblock() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MagitechBlocks.SALTBLOCK.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.SALTBLOCK.getRegistryName());
		setHardness(5.0F);
		setResistance(30.0F);
		
		setCreativeTab(Magitech.tabMagitech);
	}

}
