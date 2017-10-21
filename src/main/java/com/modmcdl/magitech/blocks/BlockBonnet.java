package com.modmcdl.magitech.blocks;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;

public class BlockBonnet extends BlockBush{
	
	public BlockBonnet() {
		setUnlocalizedName(Reference.MagitechBlocks.BONNET.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.BONNET.getRegistryName());
		setCreativeTab(Magitech.tabMagiplant);
		
	}
	
	public Block.EnumOffsetType getOffsetType()
    {
        return Block.EnumOffsetType.XZ;
    }

}
