package com.tempestgamers.deathmock.item;

import java.util.logging.Level;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.client.effect.TestEffect;
import com.tempestgamers.deathmock.helper.LogHelper;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemHookShot extends Item{
	 public static final Block[] blocksEffectiveAgainst = new Block[] {Block.planks};
	public ItemHookShot() {
		super(ItemIds.ITEMHOOKSHOT);
		setMaxStackSize(1);
		setCreativeTab(ChaosCrossover.tabsDMCC);
		setIconIndex(5);
		setItemName(Strings.ITEMHOOKSHOT);
		LanguageRegistry.addName(this, Strings.ITEMHOOKSHOT);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET;
	}
	@Override
	public boolean isFull3D()
    {
        return true;
    }
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (!par3World.isRemote)
        {
            //EntityFireworkRocket var11 = new EntityFireworkRocket(par3World, (double)((float)par4 + par8), (double)((float)par5 + par9), (double)((float)par6 + par10), par1ItemStack);
            //par3World.spawnEntityInWorld(var11);
        	LogHelper.log(Level.INFO, "Spawned at:" + par4 + "," + par5 + "," + par6);
        	//FMLClientHandler.instance().getClient().ingameGUI.
        	for(int i = 0;i < 10; i++){
        		FMLClientHandler.instance().getClient().effectRenderer.addEffect(new EntitySmokeFX(par3World, par4, par5, par6, par7, par8, par9));
        	}
        	
        	//par3World.spawnParticle("smoke", 192.0, 65.0, 132.0, 0.0D, 0.0D, 0.0D);
        	//LogHelper.log(Level.INFO, "Spawned at:" + par2EntityPlayer.posX + "," + par2EntityPlayer.posY + "," + par2EntityPlayer.posZ);
            if (!par2EntityPlayer.capabilities.isCreativeMode)
            {
                --par1ItemStack.stackSize;
            }

            return true;
        }
        else
        {
            return false;
        }
    }
}
 