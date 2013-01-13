package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MarioOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMarioPants extends ItemArmorMario {

	public ItemArmorMarioPants(int itemid,int rindex) {
		super(itemid,rindex, 2);
		this.setIconIndex(34);
		this.setItemName(MarioOutfit.outfitname + " Pants");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MarioOutfit.outfitname + " Pants");
		// TODO Auto-generated constructor stub
	} 
}
