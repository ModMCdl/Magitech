package com.modmcdl.magitech;

import com.modmcdl.magitech.gui.GuiHandler;
import com.modmcdl.magitech.init.ModBlocks;

import com.modmcdl.magitech.init.ModCrafting;
import com.modmcdl.magitech.init.ModItems;
import com.modmcdl.magitech.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Magitech {
	
	@Instance
	public static Magitech instance;
	
	//Proxies
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//Initialization
	
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
			{
			//Pre-initialize Blocks
				ModBlocks.init();
				ModBlocks.register();
			//Pre-initialize Tile Enities
			//Pre-initialize Items
				ModItems.init();
				ModItems.register();
			}
		
		@EventHandler
		public void Init(FMLInitializationEvent event)
			{
				proxy.init();
				NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new GuiHandler());
				ModCrafting.register();
			}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
			{
		
			}
		
	//Creative Tabs
		
		public static CreativeTabs tabMagitech = new CreativeTabs("tab_magitech") {
			
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModBlocks.pestle);
			}
			
		};
		public static CreativeTabs tabMagirites = new CreativeTabs("tab_magirites") {
			
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModItems.esalt);
			}
			
		};
		public static CreativeTabs tabMagiplant = new CreativeTabs("tab_magiplants") {
			
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModBlocks.asphodelplant);
			
			}
		};
}
