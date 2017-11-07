package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLevistone extends Block{
	
	public BlockLevistone() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MagitechBlocks.LEVISTONE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.LEVISTONE.getRegistryName());
		setHardness(5.0F);
		setResistance(30.0F);
		
		setCreativeTab(Magitech.tabMagitech);
	}

}
