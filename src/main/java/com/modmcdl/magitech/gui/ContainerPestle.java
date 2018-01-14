package com.modmcdl.magitech.gui;

import com.modmcdl.magitech.recipe.PestleRecipe;
import com.modmcdl.magitech.slot.SlotPestleOutput;
import com.modmcdl.magitech.tileenitity.TileEntityPestle;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerPestle extends Container{

	private final TileEntityPestle tileentity;
	
	ContainerPestle(TileEntityPestle tileentity, EntityPlayer player) { //CustomSlots
		this.tileentity = tileentity;
		this.addSlotToContainer(new SlotItemHandler(tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), 0, 32, 25));
		this.addSlotToContainer(new SlotItemHandler(tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), 1, 67, 44));
		this.addSlotToContainer(new SlotPestleOutput(player, player.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null), 2, 124, 35));
		
		for(int y = 0; y < 3; ++y) { //Player Inv
			for(int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot((IInventory) player, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
			}
		}
		
		for(int x = 0; x < 9; ++x) //Hotbar
			this.addSlotToContainer(new Slot((IInventory) player, x, 8 + x * 18, 142 ));
		
	}
	
	@Override
	public void putStackInSlot(int slotID, ItemStack stack) {
		// TODO Auto-generated method stub
		super.putStackInSlot(slotID, stack);
	}

	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = (Slot)this.inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack()) {
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			
			if(index == 3) {
				if(!this.mergeItemStack(stack1, 4, 40, true))
					return ItemStack.EMPTY;
				slot.onSlotChange(stack1, stack);
			}
			else if(index != 2 && index != 1 && index != 0 ) {
				Slot slot1 = (Slot)this.inventorySlots.get(index + 1);
				
				if(!PestleRecipe.instance().getPestleResult(stack1, slot1.getStack()).isEmpty())
					if(!this.mergeItemStack(stack1, 0, 2, false))
						return ItemStack.EMPTY;
					else if(index >= 4 && index < 31)
						if(!this.mergeItemStack(stack1, 31, 40, false))
							return ItemStack.EMPTY;
						else if(index > 31 && index < 40 && !this.mergeItemStack(stack1, 4, 31, false))
							return ItemStack.EMPTY;
				}
				else if(!this.mergeItemStack(stack1, 4, 40, false))
						return ItemStack.EMPTY;	
			if(stack1.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();
			if(stack1.getCount() == stack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, stack1);
		}
		return stack;
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return false;
	}
	
}
