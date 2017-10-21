package com.modmcdl.magitech.proxy;

import com.modmcdl.magitech.init.ModBlocks;
import com.modmcdl.magitech.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
