package com.tempestgamers.deathmock.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.tileentity.TilePanalator;

public class PanalatorGUI extends GuiContainer {
	
    public PanalatorGUI (InventoryPlayer inventoryPlayer,
                    TilePanalator tileEntity) {
            //the container is instanciated and passed to the superclass for handling
            super(new ContainerPanalator(inventoryPlayer, tileEntity));
            this.xSize = 176;
            this.ySize = 212;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
            //draw text and stuff here
            //the parameters for drawString are: string, x, y, color
            //fontRenderer.drawString("Tiny", 8, 6, 4210752);
            //draws "Inventory" or your regional equivalent
            //fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                    int par3) {
            //draw your Gui here, only thing you need to change is the path
            int texture = mc.renderEngine.getTexture(Sprites.GUI_SHEET_LOCATION + Sprites.PANALATOR_GUI_IMAGE);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.renderEngine.bindTexture(texture);
            int x = (width - xSize) / 2;
            int y = (height - ySize) / 2;
            //draw the background
            this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
            //position of the gauge
            int gposx = 10;
            int gposy = 38;
            //now the background of the gauge
            this.drawTexturedModalRect(x + gposx, y + gposy, 205, 1, 12, 85);
            //now the value of the gauge
            
            //
            //finaly the gauge overlay.
            this.drawTexturedModalRect(x + gposx -1 , y + gposy -1, 177, 0, 14, 87);
    }
}
