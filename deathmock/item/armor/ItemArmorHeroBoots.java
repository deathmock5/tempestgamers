package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorHeroBoots extends ItemArmorHero {

	public ItemArmorHeroBoots(int itemid, int rindex) {
		super(itemid, rindex, 3);
		this.setIconIndex(19);
		this.setItemName(HeroOutfit.outfitname + " Boots");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, HeroOutfit.outfitname + " Boots");
		// TODO Auto-generated constructor stub
	}
}
