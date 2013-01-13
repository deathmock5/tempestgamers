package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMaidPants extends ItemArmorMaid {

	public ItemArmorMaidPants(int itemid,int rindex) {
		super(itemid,rindex, 2);
		this.setIconIndex(2);
		this.setItemName(MaidOutfit.outfitname + " Pants");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MaidOutfit.outfitname + " Pants");
	} 
}
