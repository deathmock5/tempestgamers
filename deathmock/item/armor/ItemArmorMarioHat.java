package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MarioOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMarioHat extends ItemArmorMario {

	public ItemArmorMarioHat(int itemid,int rindex) {
		super(itemid,rindex, 0);
		this.setIconIndex(32);
		this.setItemName(MarioOutfit.outfitname + " Hat");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MarioOutfit.outfitname + " Hat");
	}
}
