package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

import com.tempestgamers.deathmock.item.MarioOutfit;
import com.tempestgamers.deathmock.item.ModItems;

public class ItemArmorMario extends ItemArmorBace implements IArmorTextureProvider{

	public ItemArmorMario(int itemid,int rindex, int type) {
		super(itemid, MarioOutfit.material, rindex, type);
	}
	public String getArmorTextureFile(ItemStack par1){
        if (par1.itemID == MarioOutfit.hat.shiftedIndex||
        	par1.itemID == MarioOutfit.top.shiftedIndex||
        	par1.itemID == MarioOutfit.boots.shiftedIndex)
        {
                return MarioOutfit.outfitloc1;
        }
        else
        {
                return MarioOutfit.outfitloc2;
        }
	}     
}
