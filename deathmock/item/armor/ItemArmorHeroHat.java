package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorHeroHat extends ItemArmorHero {

	public ItemArmorHeroHat(int itemid,int rindex) {
		super(itemid,rindex, 0);
		this.setIconIndex(16);
		this.setItemName(HeroOutfit.outfitname + " Hat");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, HeroOutfit.outfitname + " Hat");
	}
}
