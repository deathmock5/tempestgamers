package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemArmorMaidBoots extends ItemArmorMaid {

	public ItemArmorMaidBoots(int itemid, int rindex) {
		super(itemid, rindex, 3);
		this.setIconIndex(3);
		this.setItemName(MaidOutfit.outfitname + " Boots");
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		LanguageRegistry.addName(this, MaidOutfit.outfitname + " Boots");
	}
}
