package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorHeroPants extends ItemArmorHero {

	public ItemArmorHeroPants(int itemid,int rindex) {
		super(itemid,rindex, 2);
		this.setIconIndex(18);
		this.setItemName(HeroOutfit.outfitname + " Pants");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, HeroOutfit.outfitname + " Pants");
		// TODO Auto-generated constructor stub
	} 
}
