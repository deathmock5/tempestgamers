package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.item.MarioOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMarioBoots extends ItemArmorMario {

	public ItemArmorMarioBoots(int itemid, int rindex) {
		super(itemid, rindex, 3);
		this.setIconIndex(35);
		this.setItemName(MarioOutfit.outfitname + " Boots");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MarioOutfit.outfitname + " Boots");
		// TODO Auto-generated constructor stub
	}
}
