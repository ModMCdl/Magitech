package com.modmcdl.magitech.init;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.items.ItemSalts;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item salts;
	
	public static void init() {
		
		salts = new ItemSalts();
		
	}
	
	public static void register() {
		GameRegistry.register(salts);
	}
	
	public static void registerRenders() {
		registerRender(salts);	
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
