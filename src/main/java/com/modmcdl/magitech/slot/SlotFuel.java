package com.modmcdl.magitech.slot;

import com.modmcdl.magitech.tileenitity.TileEntityForge;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotFuel extends Slot{
	
	public SlotFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityForge.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
