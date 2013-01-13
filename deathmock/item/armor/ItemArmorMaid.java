package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import com.tempestgamers.deathmock.item.ModItems;

public class ItemArmorMaid extends ItemArmorBace implements IArmorTextureProvider{

	public ItemArmorMaid(int itemid,int rindex, int type) {
		super(itemid, MaidOutfit.material, rindex, type);
	}
	public String getArmorTextureFile(ItemStack par1){
        if (par1.itemID == MaidOutfit.hat.shiftedIndex||
        	par1.itemID == MaidOutfit.top.shiftedIndex||
        	par1.itemID == MaidOutfit.boots.shiftedIndex)
        {
                return MaidOutfit.outfitloc1;
        }
        else
        {
                return MaidOutfit.outfitloc2;
        }
	}     
}
