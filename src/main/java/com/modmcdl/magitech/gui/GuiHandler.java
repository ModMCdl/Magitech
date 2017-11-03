package com.modmcdl.magitech.gui;

import com.modmcdl.magitech.tileenitity.TileEntityPestle;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	public static final int PESTLE_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == PESTLE_GUI)
			return new ContainerPestle(player.inventory, ((TileEntityPestle)world.getTileEntity(new BlockPos(x, y, z))));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == PESTLE_GUI)
			return new GuiPestle(player.inventory, ((TileEntityPestle)world.getTileEntity(new BlockPos(x, y, z))));
		return null;
	}

}
