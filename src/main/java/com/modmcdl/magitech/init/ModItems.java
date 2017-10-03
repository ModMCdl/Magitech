package com.modmcdl.magitech.init;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.items.ItemBsalt;
import com.modmcdl.magitech.items.ItemDsalt;
import com.modmcdl.magitech.items.ItemEsalt;
import com.modmcdl.magitech.items.ItemMsalt;
import com.modmcdl.magitech.items.ItemSalts;
import com.modmcdl.magitech.items.ItemTsalt;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item salts;
	public static Item bsalt;
	public static Item dsalt;
	public static Item esalt;
	public static Item tsalt;
	public static Item msalt;
	
	public static void init() {
		
		salts = new ItemSalts();
		bsalt = new ItemBsalt();
		dsalt = new ItemDsalt();
		esalt = new ItemEsalt();
		tsalt = new ItemTsalt();
		msalt = new ItemMsalt();
		
	}
	
	public static void register() {
		GameRegistry.register(salts);
		GameRegistry.register(bsalt);
		GameRegistry.register(dsalt);
		GameRegistry.register(esalt);
		GameRegistry.register(tsalt);
		GameRegistry.register(msalt);
	}
	
	public static void registerRenders() {
		registerRender(salts);	
		registerRender(bsalt);
		registerRender(dsalt);
		registerRender(esalt);
		registerRender(tsalt);
		registerRender(msalt);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
