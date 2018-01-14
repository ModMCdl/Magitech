package com.modmcdl.magitech.gui;

import com.modmcdl.magitech.Reference;
import com.modmcdl.magitech.tileenitity.TileEntityForge;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiForge extends GuiContainer{

	private static final ResourceLocation FORGE_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/gui_thaumic_forge.png");
	private final InventoryPlayer player;
	private final TileEntityForge tileentity;
	
	public GuiForge(InventoryPlayer player, TileEntityForge tileentity) {
		super(new ContainerForge(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(FORGE_TEXTURES);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 43, this.guiTop + 18, 176, 14, l + 1, 16);
		int r = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 109, this.guiTop + 18, 176, 31, 23 - r, 16);
	}
	
	
	private int getCookProgressScaled(int pixels) {
		int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}	
