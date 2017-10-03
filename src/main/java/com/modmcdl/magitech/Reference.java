package com.modmcdl.magitech;

public class Reference {
//definitions 
	public static final String MOD_ID = "modmt";
	public static final String NAME = "Mineaturgy";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.magitech.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.modmcdl.magitech.proxy.ServerProxy";
//blocks
	public static enum MagitechBlocks {
		
		//ADD BLOCKS HERE
		
	}
//items	
	public static enum MagitechItems {
		
		SALTS("salts", "ItemSalts"),
		BSALT("bsalt", "ItemBsalt"),
		DSALT("dsalt", "ItemDsalt"),
		ESALT("esalt", "ItemEsalt"),
		TSALT("tsalt", "ItemTsalt"),
		MSALT("msalt", "ItemMsalt");
		
		private String unlocalizedName;
		private String registryName;
		
		MagitechItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
				public String getUnlocalizedName() {
						return unlocalizedName;
				}
				public String getRegistryName() {
						return registryName;
				}
	}
	
}
