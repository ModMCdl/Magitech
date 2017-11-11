package com.modmcdl.magitech.init;

import com.modmcdl.magitech.blocks.BlockAbselom;
import com.modmcdl.magitech.blocks.BlockAsphodelPlant;
import com.modmcdl.magitech.blocks.BlockBonnet;
import com.modmcdl.magitech.blocks.BlockDarkpile;
import com.modmcdl.magitech.blocks.BlockDesk;
import com.modmcdl.magitech.blocks.BlockEmbersoul;
import com.modmcdl.magitech.blocks.BlockEnrichedpile;
import com.modmcdl.magitech.blocks.BlockForge;
import com.modmcdl.magitech.blocks.BlockLevistone;
import com.modmcdl.magitech.blocks.BlockLilac;
import com.modmcdl.magitech.blocks.BlockMysticalpile;
import com.modmcdl.magitech.blocks.BlockPestle;
import com.modmcdl.magitech.blocks.BlockPlanter;
import com.modmcdl.magitech.blocks.BlockSaltblock;
import com.modmcdl.magitech.blocks.BlockSaltpile;
import com.modmcdl.magitech.blocks.BlockTearpile;
import com.modmcdl.magitech.blocks.BlockThaummix;
import com.modmcdl.magitech.blocks.BlockBloodpile;
import com.modmcdl.magitech.blocks.BlockUniflora;
import com.modmcdl.magitech.tileenitity.TileEntityPestle;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block pestle;
	public static Block forge;
	public static Block planter;
	public static Block desk;
	public static Block saltblock;
	public static Block levistone;
	
	public static Block saltpile;
	public static Block bloodpile;
	public static Block darkpile;
	public static Block enrichedpile;
	public static Block tearpile;
	public static Block mysticalpile;
	
	public static Block asphodelplant;
	public static Block lilac;
	public static Block uniflora;
	public static Block bonnet;
	public static Block embersoul;
	public static Block thaummix;
	public static Block abselom;
	
	public static void init() {
		
		pestle = new BlockPestle();
		forge = new BlockForge();
		planter = new BlockPlanter();
		desk = new BlockDesk();
		saltblock = new BlockSaltblock();
		levistone = new BlockLevistone();
		saltpile = new BlockSaltpile();
		bloodpile = new BlockBloodpile();
		darkpile = new BlockDarkpile();
		enrichedpile = new BlockEnrichedpile();
		tearpile = new BlockTearpile();
		mysticalpile = new BlockMysticalpile();
		asphodelplant = new BlockAsphodelPlant();
		lilac = new BlockLilac();
		uniflora = new BlockUniflora();
		bonnet = new BlockBonnet();
		embersoul = new BlockEmbersoul();
		thaummix = new BlockThaummix();
		abselom = new BlockAbselom();
		
	}
	
	public static void register() {
		GameRegistry.registerTileEntity(TileEntityPestle.class, "pestle_entity");
		registerBlock(pestle);
		registerBlock(forge);
		registerBlock(planter);
		registerBlock(desk);
		registerBlock(saltblock);
		registerBlock(levistone);
		registerBlock(saltpile);
		registerBlock(bloodpile);
		registerBlock(darkpile);
		registerBlock(enrichedpile);
		registerBlock(tearpile);
		registerBlock(mysticalpile);
		registerBlock(asphodelplant);
		registerBlock(lilac);
		registerBlock(uniflora);
		registerBlock(bonnet);
		registerBlock(embersoul);
		registerBlock(thaummix);
		registerBlock(abselom);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(pestle);
		GameRegistry.register(forge);
		GameRegistry.register(planter);
		GameRegistry.register(desk);
		GameRegistry.register(saltblock);
		GameRegistry.register(levistone);
		GameRegistry.register(saltpile);
		GameRegistry.register(bloodpile);
		GameRegistry.register(darkpile);
		GameRegistry.register(enrichedpile);
		GameRegistry.register(tearpile);
		GameRegistry.register(mysticalpile);
		GameRegistry.register(asphodelplant);
		GameRegistry.register(lilac);
		GameRegistry.register(uniflora);
		GameRegistry.register(bonnet);
		GameRegistry.register(embersoul);
		GameRegistry.register(thaummix);
		GameRegistry.register(abselom);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(pestle);
		registerRender(forge);
		registerRender(planter);
		registerRender(desk);
		registerRender(saltblock);
		registerRender(levistone);
		registerRender(saltpile);
		registerRender(bloodpile);
		registerRender(darkpile);
		registerRender(enrichedpile);
		registerRender(tearpile);
		registerRender(mysticalpile);
		registerRender(asphodelplant);
		registerRender(lilac);
		registerRender(uniflora);
		registerRender(bonnet);
		registerRender(embersoul);
		registerRender(thaummix);
		registerRender(abselom);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
