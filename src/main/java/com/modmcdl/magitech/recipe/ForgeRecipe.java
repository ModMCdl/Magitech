package com.modmcdl.magitech.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.modmcdl.magitech.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

public class ForgeRecipe {

	private static final ForgeRecipe SMELTING = new ForgeRecipe();
	private final Table<ItemStack, ItemStack, ItemStack> forgeList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static ForgeRecipe instance() {
		return SMELTING;
	}
	
	private ForgeRecipe() {
		//this.addForgeRecipe(new ItemStack(INPUT ONE), new ItemStack(INPUT TWO), new ItemStack(WHAT IT CRAFTS), 0.0F); <--Format to Follow
		this.addForgeRecipe(new ItemStack(ModItems.quicksilver), new ItemStack(ModItems.antikythera), new ItemStack(ModItems.mercury_ingot), 1.0F);
	}
	//adding recipe - makes sure that mod recipes dont conflict
	public void addForgeRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) {
		if(getForgeResult(input1, input2) != ItemStack.EMPTY) {
			FMLLog.info("Ignored thaumic forge recipe with conflicting input: " + input1 + " and " + input2 + " = " + result);
			
		}
		this.forgeList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	//registers inputs and cross-checks them with recipes
	public ItemStack getForgeResult(ItemStack input1, ItemStack b) {
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.forgeList.columnMap().entrySet())
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
					if(this.compareItemStacks(b, (ItemStack)ent.getKey()))
						return (ItemStack)ent.getValue();
		//if no recipe found, do nothing
		return ItemStack.EMPTY;
	}
	
	//Checks and compares inputs in table ^above to recipe (finds result)
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());	
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getForgeList() {
		return this.forgeList;
	}
	//If output is "X" then give certain experience | else "0"
	public float getForgeExperience(ItemStack stack) {
		for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
				return ((Float)entry.getValue()).floatValue();
		return 0.0F;
	}
	
}
