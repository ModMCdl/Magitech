package com.modmcdl.magitech.tileenitity;

import com.google.common.collect.Table;
import com.modmcdl.magitech.recipe.PestleRecipe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityPestle extends TileEntity {

	
	
	public ItemStackHandler inventory = new ItemStackHandler(3)
	{
		@Override
		public int getSlotLimit(int slot) {return 1;}
		@Override
		protected void onContentsChanged(int slot) {}
	};
	private String customName;
	
	public String getName() {
		return this.hasCustomName() ? this.customName : "Mortar and Pestle";
	}
	
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.isEmpty();
	}
	
	public void setCustomName(String customName) {
		this.customName = customName;
	}
	
	@Override
	public ITextComponent getDisplayName() {
		return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.customName);
	}

	private boolean canCraft() {
		if(((ItemStack)this.inventory.getStackInSlot(0)).isEmpty() || ((ItemStack)this.inventory.getStackInSlot(1)).isEmpty())
			return false;
		else {
			ItemStack result = PestleRecipe.instance().getPestleResult((ItemStack)this.inventory.getStackInSlot(0), (ItemStack)this.inventory.getStackInSlot(1));
			
			if(result.isEmpty())
				return false;
			else {
				ItemStack output = (ItemStack)this.inventory.getStackInSlot(2);
				
				if(output.isEmpty()) return true;
				if(!output.isItemEqual(result)) return false;
				int res = output.getCount() + result.getCount();
				return res <= this.inventory.getSlotLimit(1) && res <= output.getMaxStackSize();
				
			}
					
		}

	}

	public void craftItem() {
		if(this.canCraft()) {
			ItemStack input1 = (ItemStack)this.inventory.getStackInSlot(0);
			ItemStack input2 = (ItemStack)this.inventory.getStackInSlot(1);
			ItemStack result = PestleRecipe.instance().getPestleResult(input1, input2);
			ItemStack output = (ItemStack)this.inventory.getStackInSlot(2);
			
			if(output.isEmpty())
				this.inventory.setStackInSlot(2, result.copy());
			else if(output.getItem() == result.getItem())
				output.grow(result.getCount());
			
			input1.shrink(1);
			input2.shrink(1);
		}
	}
	
	@Override
    public boolean hasCapability(Capability capability, EnumFacing facing)
    {
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        return super.hasCapability(capability, facing);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
    	if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) inventory;
        return super.getCapability(capability, facing);
    }

}
