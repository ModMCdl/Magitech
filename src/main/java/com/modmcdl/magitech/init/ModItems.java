package com.modmcdl.magitech.init;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.items.ItemAntikythera;
import com.modmcdl.magitech.items.ItemBsalt;
import com.modmcdl.magitech.items.ItemDsalt;
import com.modmcdl.magitech.items.ItemEsalt;
import com.modmcdl.magitech.items.ItemMsalt;
import com.modmcdl.magitech.items.ItemRoyster;
import com.modmcdl.magitech.items.ItemLilacbloom;
import com.modmcdl.magitech.items.ItemSaltmeat;
import com.modmcdl.magitech.items.ItemSalts;
import com.modmcdl.magitech.items.ItemTsalt;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item salts;
	public static Item bsalt;
	public static Item dsalt;
	public static Item esalt;
	public static Item tsalt;
	public static Item msalt;
	public static Item antikythera;
	
	public static Item saltmeat;
	public static Item royster;
	
	public static Item lilacbloom;
	public static Item hotsprout;
	public static Item thaumseed;
	
	public static void init() {
		
		//salts
		salts = new ItemSalts();
		bsalt = new ItemBsalt();
		dsalt = new ItemDsalt();
		esalt = new ItemEsalt();
		tsalt = new ItemTsalt();
		msalt = new ItemMsalt();
		
		//arcane
		antikythera = new ItemAntikythera();
		
		//foods
		saltmeat = new ItemSaltmeat(6, .5F, false);
		royster = new ItemRoyster(2, .3F, false);
				
		//seeds
		lilacbloom = new ItemSeeds(ModBlocks.lilac, Blocks.FARMLAND).setUnlocalizedName("lilacbloom").setRegistryName(new ResourceLocation(Reference.MOD_ID, "lilacbloom")).setCreativeTab(Magitech.tabMagiplant);
		hotsprout = new ItemSeeds(ModBlocks.embersoul, Blocks.FARMLAND).setUnlocalizedName("hotsprout").setRegistryName(new ResourceLocation(Reference.MOD_ID, "hotsprout")).setCreativeTab(Magitech.tabMagiplant);
		thaumseed = new ItemSeeds(ModBlocks.thaummix, ModBlocks.planter).setUnlocalizedName("thaumseed").setRegistryName(new ResourceLocation(Reference.MOD_ID, "thaumseed")).setCreativeTab(Magitech.tabMagiplant);
	
	}
	
	public static void register() {
		GameRegistry.register(salts);
		GameRegistry.register(bsalt);
		GameRegistry.register(dsalt);
		GameRegistry.register(esalt);
		GameRegistry.register(tsalt);
		GameRegistry.register(msalt);
		GameRegistry.register(antikythera);
		
		GameRegistry.register(saltmeat);
		GameRegistry.register(royster);
		
		GameRegistry.register(lilacbloom);
		GameRegistry.register(hotsprout);
		GameRegistry.register(thaumseed);
	}
	
	public static void registerRenders() {
		registerRender(salts);	
		registerRender(bsalt);
		registerRender(dsalt);
		registerRender(esalt);
		registerRender(tsalt);
		registerRender(msalt);
		registerRender(antikythera);
		
		registerRender(saltmeat);
		registerRender(royster);
		
		registerRender(lilacbloom);
		registerRender(hotsprout);
		registerRender(thaumseed);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
