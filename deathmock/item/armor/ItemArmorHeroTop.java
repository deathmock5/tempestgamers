package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorHeroTop extends ItemArmorHero {

	public ItemArmorHeroTop(int itemid,int rindex) {
		super(itemid,rindex, 1);
		this.setIconIndex(17);
		this.setItemName(HeroOutfit.outfitname + " Top");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, HeroOutfit.outfitname + " Top");
	}
}
