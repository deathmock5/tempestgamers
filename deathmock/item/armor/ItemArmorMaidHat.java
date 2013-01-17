package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMaidHat extends ItemArmorMaid {

	public ItemArmorMaidHat(int itemid,int rindex) {
		super(itemid,rindex, 0);
		this.setIconIndex(Sprites.MAIDOUTFITHAT);
		this.setItemName(MaidOutfit.outfitname + " Hat");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MaidOutfit.outfitname + " Hat");
	}
}
