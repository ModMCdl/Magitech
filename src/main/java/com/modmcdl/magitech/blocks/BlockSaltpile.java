package com.modmcdl.magitech.blocks;

import java.util.List;
import java.util.Random;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSaltpile extends Block{
	
	private static final AxisAlignedBB PILE = new AxisAlignedBB(0, 0, 0, 1, .0625 * 6, 1);
	
	public BlockSaltpile() {
		super(Material.SAND);
		setUnlocalizedName(Reference.MagitechBlocks.SALTPILE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.SALTPILE.getRegistryName());
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
	
	/*
	public static enum EnumSaltType implements IStringSerializable {
		
		DEFAULT(0, "saltpile"),
		BLOOD(1, "saltpile_b"),
		DARK(2, "saltpile_d"),
		ENRICHED(3, "saltpile_e"),
		TEAR(4, "saltpile_t"),
		MYSTICAL(5, "saltpile_m");

		
		private static final BlockSaltpile.EnumSaltType[] META_LOOKUP = new BlockSaltpile.EnumSaltType[values().length];
		private final int meta;
        private final String name;
        private final String unlocalizedName;

		private EnumSaltType(int meta, String name)
        {
            this(meta, name, name);
        }
		
		private EnumSaltType(int meta, String name, String unlocalizedName) {
			  this.meta = meta;
	          this.name = name;
	          this.unlocalizedName = unlocalizedName;
		}
		
		public int getMeta()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.name;
        }

        public static BlockSaltpile.EnumSaltType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }
		
		public String getName()
        {
            return this.name;
        }
		
		static
        {
            for (BlockSaltpile.EnumSaltType blocksaltpile$enumsalttype : values())
            {
                META_LOOKUP[blocksaltpile$enumsalttype.getMeta()] = blocksaltpile$enumsalttype;
            }
        } 
        
      }
      */
}
