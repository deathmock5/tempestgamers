package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.item.ModItems;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import com.tempestgamers.deathmock.item.ModItems;

public class ItemArmorGwolf extends ItemArmorBace implements IArmorTextureProvider{

	public ItemArmorGwolf(int itemid,int rindex, int type) {
		super(itemid, HeroOutfit.material, rindex, type);
	}
	public String getArmorTextureFile(ItemStack par1){
        if (par1.itemID == HeroOutfit.hat.shiftedIndex||
        	par1.itemID == HeroOutfit.top.shiftedIndex||
        	par1.itemID == HeroOutfit.boots.shiftedIndex)
        {
                return HeroOutfit.outfitloc1;
        }
        else
        {
                return HeroOutfit.outfitloc2;
        }
	}     
}
