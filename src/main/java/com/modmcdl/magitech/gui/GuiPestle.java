package com.modmcdl.magitech.gui;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.tileenitity.TileEntityPestle;

import ibxm.Player;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiPestle extends GuiContainer{

	private static final ResourceLocation PESTLE_GUI_TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/gui/gui_pestle.png");
	private final EntityPlayer player;
	private final TileEntityPestle tileentity;
	
	public GuiPestle(TileEntityPestle tileentity, EntityPlayer player) {
		super(new ContainerPestle(tileentity, player));
		this.player = player;
		this.tileentity = tileentity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.tileentity.getDisplayName().getUnformattedComponentText();
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
		this.fontRendererObj.drawString(this.player.getDisplayName().getUnformattedComponentText(), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(PESTLE_GUI_TEXTURE);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		
	}
	
}
