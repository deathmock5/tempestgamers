package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMaidTop extends ItemArmorMaid {

	public ItemArmorMaidTop(int itemid,int rindex) {
		super(itemid,rindex, 1);
		this.setIconIndex(1);
		this.setItemName(MaidOutfit.outfitname + " Top");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MaidOutfit.outfitname + " Top");
		// TODO Auto-generated constructor stub
	}
}
