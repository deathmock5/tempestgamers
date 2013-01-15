package com.tempestgamers.deathmock.item;

import java.util.logging.Level;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.helper.LogHelper;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemStaff extends Item{
	int animationpos = 0;
	int[][] texturefile;
	public ItemStaff(int id,EnumToolMaterial material,String name,int[][] spriteindex) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(ChaosCrossover.tabsDMCC);
		texturefile = spriteindex;
		setIconIndex(spriteindex[0][0]);
		setItemName(name);
		LanguageRegistry.addName(this, name);
		// TODO Auto-generated constructor stub
	}
	@Override
    public int getIconIndex(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
        int curentanimationstate = 0;
        if (usingItem != null)
        {
        	int k = usingItem.getMaxItemUseDuration() - useRemaining;
            if (k >= 18) curentanimationstate = 3;
            else if (k >  13) curentanimationstate = 2;
            else if (k >   0) curentanimationstate = 1;
            LogHelper.log(Level.INFO, "Useing" + k);
        }
        else
        {
        	curentanimationstate = 0;
        }
        if(animationpos++ > 16)
        {
        	animationpos = 0;
        }
        if(animationpos < 4){
        	return texturefile[curentanimationstate][0];
        }
        else if(animationpos < 8){
        	return texturefile[curentanimationstate][1];
        }
        else if(animationpos < 12){
        	return texturefile[curentanimationstate][2];
        }
        else
        {
        	return texturefile[curentanimationstate][3];
        }
    }

	 public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	    {
	        int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;
	        
	        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, var6);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        var6 = event.charge;
	        
	        boolean var5 = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

	        if (var5 || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
	        {
	            float var7 = (float)var6 / 20.0F;
	            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

	            if ((double)var7 < 0.1D)
	            {
	                return;
	            }

	            if (var7 > 1.0F)
	            {
	                var7 = 1.0F;
	            }

	            EntityArrow var8 = new EntityArrow(par2World, par3EntityPlayer, var7 * 2.0F);

	            if (var7 == 1.0F)
	            {
	                var8.setIsCritical(true);
	            }

	            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

	            if (var9 > 0)
	            {
	                var8.setDamage(var8.getDamage() + (double)var9 * 0.5D + 0.5D);
	            }

	            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

	            if (var10 > 0)
	            {
	                var8.setKnockbackStrength(var10);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
	            {
	                var8.setFire(100);
	            }

	            par1ItemStack.damageItem(1, par3EntityPlayer);
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

	            if (var5)
	            {
	                var8.canBePickedUp = 2;
	            }
	            else
	            {
	                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.shiftedIndex);
	            }

	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(var8);
	            }
	        }
	    }

	 public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        return par1ItemStack;
	    }

   /**
    * How long it takes to use or consume an item
    */
	    public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 72000;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.bow;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }
	        
	        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.shiftedIndex))
	        {
	            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	        }

	        return par1ItemStack;
	    }

	    /**
	     * Return the enchantability factor of the item, most of the time is based on material.
	     */
	    public int getItemEnchantability()
	    {
	        return 1;
	    }
	public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.Item_Staff_Sprites;
	}
	@Override
	public boolean isFull3D()
    {
        return true;
    }
}
 