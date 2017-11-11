package com.modmcdl.magitech;

public class Reference {	
//definitions 
	public static final String MOD_ID = "modmt";
	public static final String NAME = "Mineaturgy";
	public static final String VERSION = "0.0.3 - Alpha";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.modmcdl.magitech.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.modmcdl.magitech.proxy.ServerProxy";
//blocks
	public static enum MagitechBlocks {
		
		PESTLE("pestle", "BlockPestle"),
		FORGE("forge", "BlockForge"),
		PLANTER("planter", "BlockPlanter"),
		DESK("desk", "BlockDesk"),
		SALTBLOCK("saltblock", "BlockSaltblock"),
		LEVISTONE("levistone", "BlockLevistone"),
		
		SALTPILE("saltpile", "BlockSaltpile"),
		BLOODPILE("bloodpile", "BlockBloodpile"),
		DARKPILE("darkpile", "BlockDarkpile"),
		ENCRICHEDPILE("enrichedpile", "BlockEnrichedpile"),
		TEARPILE("tearpile", "BlockTearpile"),
		MYSTICALPILE("mysticalpile", "BlockMysticalpile"),
		
		ASPHODELPLANT("asphodelplant", "BlockAsphodelPlant"),
		DARK_LILAC("lilac", "BlockLilac"),
		IPIPE("uniflora", "BlockUniflora"),
		EMBERSOUL("embersoul", "BlockEmbersoul"),
		BONNET("bonnet", "BlockBonnet"),
		ABSELOM("abselom", "BlockAbselom"),
		THAUMMIX("thaummix", "BlockThaummix");
		
		
		private String unlocalizedName;
		private String registryName;
		
		MagitechBlocks(String unlocalizedName, String registryName)
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
//items	
	public static enum MagitechItems {
		
		SALTS("salts", "ItemSalts"),
		BSALT("bsalt", "ItemBsalt"),
		DSALT("dsalt", "ItemDsalt"),
		ESALT("esalt", "ItemEsalt"),
		TSALT("tsalt", "ItemTsalt"),
		MSALT("msalt", "ItemMsalt"),
		
		ANTIKYTHERA("antikythera", "ItemAntikythera"),
		HORN("horn", "ItemHorn"),
		TEARS("tears", "ItemTears"),
		IMP_BLOOD("imp_blood", "ItemImp_blood"),
		DEMON_BLOOD("demon_blood", "ItemDemon_blood"),
		PAGE("page", "ItemPage"),
		CRYSTAL("crystal", "ItemCrystal"),
		FLUX("flux", "ItemFlux"),
		POWDER("powder", "ItemPowder"),
		
		QUICKSILVER("quicksilver", "ItemQuicksilver"),
		MERCURY("mercury_ingot", "ItemMercury_ingot"),
		MITHRIL("mithril", "ItemMithril"),
		CHRONOTUM("chronotum", "ItemChronotum"),
		AURAURUM("aura_metal", "ItemAura_metal"),
		GLASS_INGOT("glass_ingot", "ItemGlass_ingot"),
		
		SALTMEAT("saltmeat", "ItemSaltmeat"),
		ROYSTER("royster", "ItemRoyster"),
		
		LILACBLOOM("lilacbloom", "ItemLilacbloom");
		
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
