package com.modmcdl.magitech.init;

import com.modmcdl.magitech.Magitech;
import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.items.ItemAntikythera;
import com.modmcdl.magitech.items.ItemAura_metal;
import com.modmcdl.magitech.items.ItemBsalt;
import com.modmcdl.magitech.items.ItemChronotum;
import com.modmcdl.magitech.items.ItemCrystal;
import com.modmcdl.magitech.items.ItemDemon_blood;
import com.modmcdl.magitech.items.ItemDsalt;
import com.modmcdl.magitech.items.ItemEsalt;
import com.modmcdl.magitech.items.ItemFlux;
import com.modmcdl.magitech.items.ItemGlass_ingot;
import com.modmcdl.magitech.items.ItemHorn;
import com.modmcdl.magitech.items.ItemImp_blood;
import com.modmcdl.magitech.items.ItemInvpestle;
import com.modmcdl.magitech.items.ItemMsalt;
import com.modmcdl.magitech.items.ItemPage;
import com.modmcdl.magitech.items.ItemPowder;
import com.modmcdl.magitech.items.ItemQuicksilver;
import com.modmcdl.magitech.items.ItemRoyster;
import com.modmcdl.magitech.items.ItemLilacbloom;
import com.modmcdl.magitech.items.ItemMercury_ingot;
import com.modmcdl.magitech.items.ItemMithril;
import com.modmcdl.magitech.items.ItemSaltmeat;
import com.modmcdl.magitech.items.ItemSalts;
import com.modmcdl.magitech.items.ItemTears;
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
	//Salts
	public static Item salts;
	public static Item bsalt;
	public static Item dsalt;
	public static Item esalt;
	public static Item tsalt;
	public static Item msalt;
	
	public static Item invpestle;
	
	public static Item antikythera;
	public static Item horn;
	public static Item tears;
	public static Item imp_blood;
	public static Item demon_blood;
	public static Item page;
	public static Item crystal;//
	public static Item flux;//
	public static Item powder;//
	
	public static Item quicksilver;//
	public static Item mercury_ingot;//
	public static Item mithril;//
	public static Item chronotum;//
	public static Item aura_metal;//
	public static Item glass_ingot;//
	
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
		
		invpestle = new ItemInvpestle();
		
		//arcane
		antikythera = new ItemAntikythera();
		horn = new ItemHorn();
		tears = new ItemTears();
		imp_blood = new ItemImp_blood();
		demon_blood = new ItemDemon_blood();
		page = new ItemPage();
		crystal = new ItemCrystal();
		flux = new ItemFlux();
		powder = new ItemPowder();
		
		//metallurgy
		quicksilver = new ItemQuicksilver();
		mercury_ingot = new ItemMercury_ingot();
		mithril = new ItemMithril();
		chronotum = new ItemChronotum();
		aura_metal = new ItemAura_metal();
		glass_ingot = new ItemGlass_ingot();
		
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
		
		GameRegistry.register(invpestle);
		
		GameRegistry.register(antikythera);
		
		GameRegistry.register(horn);
		GameRegistry.register(tears);
		GameRegistry.register(imp_blood);
		GameRegistry.register(demon_blood);
		GameRegistry.register(page);
		GameRegistry.register(crystal);
		GameRegistry.register(flux);
		GameRegistry.register(powder);
		
		GameRegistry.register(quicksilver);
		GameRegistry.register(mercury_ingot);
		GameRegistry.register(mithril);
		GameRegistry.register(chronotum);
		GameRegistry.register(aura_metal);
		GameRegistry.register(glass_ingot);
		
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
		
		registerRender(invpestle);
		
		registerRender(antikythera);
		
		registerRender(horn);
		registerRender(tears);
		registerRender(imp_blood);
		registerRender(demon_blood);
		registerRender(page);
		registerRender(crystal);
		registerRender(flux);
		registerRender(powder);
		
		registerRender(quicksilver);
		registerRender(mercury_ingot);
		registerRender(mithril);
		registerRender(chronotum);
		registerRender(aura_metal);
		registerRender(glass_ingot);
		
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
