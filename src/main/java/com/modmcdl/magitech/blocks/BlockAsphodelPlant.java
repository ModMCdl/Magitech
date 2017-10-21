package com.modmcdl.magitech.blocks;

import java.util.Random;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.blocks.BlockTwoPlant.EnumBlockHalf;
import com.modmcdl.magitech.init.ModBlocks;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAsphodelPlant extends BlockTwoPlant{
	
	  public static final PropertyEnum<BlockTwoPlant.EnumBlockHalf> HALF = PropertyEnum.<BlockTwoPlant.EnumBlockHalf>create("half", BlockTwoPlant.EnumBlockHalf.class);
	
	public BlockAsphodelPlant() {
		setUnlocalizedName(Reference.MagitechBlocks.ASPHODELPLANT.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.ASPHODELPLANT.getRegistryName());
		setHardness(0.0F);
		}
	
	
	public Block getBlockDropped(IBlockState state, Random rand, int fortune) {
		return ModBlocks.asphodelplant;
	}
	
	/* @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
        //Forge: Break both parts on the client to prevent the top part flickering as default type for a few frames.
        if (state.getBlock() ==  this && state.getValue(HALF) == EnumBlockHalf.LOWER && world.getBlockState(pos.up()).getBlock() == this)
            world.setBlockToAir(pos.up());
        return world.setBlockToAir(pos);
    }
	
	public static enum EnumBlockHalf implements IStringSerializable
    {
        UPPER,
        LOWER;

        public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this == UPPER ? "upper" : "lower";
        }
    } */
	
	
}
