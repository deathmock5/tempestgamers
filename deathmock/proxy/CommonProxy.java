package com.tempestgamers.deathmock.proxy;

import com.tempestgamers.deathmock.client.gui.ContainerPanalator;
import com.tempestgamers.deathmock.client.gui.PanalatorGUI;
import com.tempestgamers.deathmock.lib.GuiIds;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.tileentity.TilePanalator;
import com.tempestgamers.deathmock.tileentity.TileSink;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//import com.tempestgamers.deathmock.client.gui.inventory.GuiCalcinator;
//import com.tempestgamers.deathmock.client.gui.inventory.GuiPortableCrafting;
//import com.tempestgamers.deathmock.inventory.ContainerCalcinator;
//mport com.tempestgamers.deathmock.inventory.ContainerPortableCrafting;
//import com.tempestgamers.deathmock.lib.GuiIds;
//import com.tempestgamers.deathmock.lib.Strings;
//import com.tempestgamers.deathmock.tileentity.TileCalcinator;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * CommonProxy
 * 
 * The common proxy class between client and server. Client proxy extends this
 * for further client specific functionality
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class CommonProxy implements IGuiHandler {

    public void registerKeyBindingHandler() {

    }

    public void registerRenderTickHandler() {

    }

    public void registerDrawBlockHighlightHandler() {

    }

    public void setKeyBinding(String name, int value) {

    }

    public void registerSoundHandler() {

    }

    public void initCustomRarityTypes() {

    }

    public EnumRarity getCustomRarityType(String customRarity) {

        return null;
    }

    public void initRenderingAndTextures() {

    }

    public void initTileEntities() {

        GameRegistry.registerTileEntity(TileSink.class, Strings.TE_SINK_NAME);
        GameRegistry.registerTileEntity(TilePanalator.class, Strings.TE_PANALATOR_NAME);
    }

    public void transmuteBlock(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int sideHit) {
        
    }
    
    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(ID == GuiIds.PANALATOR) {
        	TilePanalator panel = (TilePanalator) world.getBlockTileEntity(x, y, z);
        	return new ContainerPanalator(player.inventory,panel);
        }
        //else if (ID == GuiIds.CALCINATOR) {
        //    TileCalcinator calcinator = (TileCalcinator) world.getBlockTileEntity(x, y, z);
        //    return new ContainerCalcinator(player.inventory, calcinator);
        //}

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        //if (ID == GuiIds.PORTABLE_CRAFTING) {
        //    return new GuiPortableCrafting(player, world, x, y, z);
        //}
        if (ID == GuiIds.PANALATOR) {
        	TilePanalator panel = (TilePanalator) world.getBlockTileEntity(x, y, z);
          return new PanalatorGUI(player.inventory, panel);
        }

        return null;
    }

}