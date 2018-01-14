package com.modmcdl.magitech.init;

import com.modmcdl.magitech.blocks.BlockBloodpile;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		
		//Crafting recipies
			
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.desk), "   ", "WWW", "F F", 'W', Blocks.WOODEN_SLAB, 'F', Blocks.OAK_FENCE);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pestle), "  S", "BSB", " B ", 'S', Items.STICK, 'B', Items.BRICK);
			GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.planter), "W W", "WDW", "WWW", 'W', Blocks.PLANKS, 'D', Blocks.DIRT);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.saltblock), ModItems.salts, ModItems.salts, ModItems.salts, ModItems.salts);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.saltmeat), ModItems.salts, Items.BEEF);
			
			GameRegistry.addShapedRecipe(new ItemStack(ModItems.invpestle),	"   ", "BSB", "BBB", 'S', Items.STICK, 'B', Items.BRICK);
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hotsprout), Items.BEETROOT, ModItems.esalt, ModItems.msalt);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lilacbloom), new ItemStack(Blocks.DOUBLE_PLANT, 1, 1), ModItems.msalt, ModItems.dsalt);
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.saltpile), ModItems.salts, ModItems.salts);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bloodpile), ModItems.bsalt, ModItems.bsalt);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.darkpile), ModItems.dsalt, ModItems.dsalt);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.enrichedpile), ModItems.esalt, ModItems.esalt);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.tearpile), ModItems.tsalt, ModItems.tsalt);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mysticalpile), ModItems.msalt, ModItems.msalt);
		
	}
	
}

// GameRegistry.addShapedRecipe(new ItemStack(item/block to craft), "xxx", "xxx", "xxx", 'x', item used);
// GameRegistry.addShapelessRecipe(new ItemStack(Item/block to craft), ITEM, ITEM, ITEM, etc);
// Shaped is solid shapeless is fluid