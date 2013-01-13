package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MarioOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMarioTop extends ItemArmorMario {
	public ItemArmorMarioTop(int itemid,int rindex) {
		super(itemid,rindex, 1);
		this.setIconIndex(33);
		this.setItemName(MarioOutfit.outfitname + " Top");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MarioOutfit.outfitname + " Top");
	}
}