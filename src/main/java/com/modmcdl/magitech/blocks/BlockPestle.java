package com.modmcdl.magitech.blocks;

import java.util.List;
import java.util.Random;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.gui.GuiHandler;
import com.modmcdl.magitech.init.ModBlocks;
import com.modmcdl.magitech.tileenitity.TileEntityPestle;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockPestle extends Block implements ITileEntityProvider{

	private static final AxisAlignedBB PESTLE_BOX = new AxisAlignedBB(0, 0, 0, 1, .0625 * 7, 1);
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockPestle() {
		super(Material.PISTON);
		setUnlocalizedName(Reference.MagitechBlocks.PESTLE.getUnlocalizedName());
		setRegistryName(Reference.MagitechBlocks.PESTLE.getRegistryName());
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		setCreativeTab(Magitech.tabMagitech);
		setHardness(0.5F);

		
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.pestle);		
	}
	
	@Override //drops items from block's inventory
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntityPestle tileentity = (TileEntityPestle)worldIn.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory) tileentity);
		
		super.breakBlock(worldIn, pos, state);
	}
	
	//Crafting: Open GUI, etc.
	
		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new TileEntityPestle();
		}	
	
		@Override
		public boolean hasTileEntity() {
			return true;
		}
	
		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			if(!worldIn.isRemote)
				playerIn.openGui(Reference.MOD_ID, GuiHandler.PESTLE_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
			return true;
		}
		
		public static void setState(boolean active, World worldIn, BlockPos pos) {
			IBlockState state = worldIn.getBlockState(pos);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			
			if(tileentity != null) {
				tileentity.validate();
				worldIn.setTileEntity(pos, tileentity);
			}
		}
		
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new TileEntityPestle();
		}
		
	//Everything Under: Positioning Overrides

	 public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	    {
	        this.setDefaultFacing(worldIn, pos, state);
	    }
	
	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            IBlockState iblockstate = worldIn.getBlockState(pos.north());
            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
        }
    }
	
	 public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	    {
	        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	    }
	 
	 public IBlockState getStateFromMeta(int meta)
	    {
	        EnumFacing enumfacing = EnumFacing.getFront(meta);

	        if (enumfacing.getAxis() == EnumFacing.Axis.Y)
	        {
	            enumfacing = EnumFacing.NORTH;
	        }

	        return this.getDefaultState().withProperty(FACING, enumfacing);
	    }
	 
	 public int getMetaFromState(IBlockState state)
	    {
	        return ((EnumFacing)state.getValue(FACING)).getIndex();
	    }
	 
	 public IBlockState withRotation(IBlockState state, Rotation rot)
	    {
	        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	    }
	 
	 public IBlockState withMirror(IBlockState state, Mirror mirrorIn)
	    {
	        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	    }

	 protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {FACING});
	    }
	
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
