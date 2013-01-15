package com.tempestgamers.deathmock.item;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.Sprites;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemDualDagger extends ItemSword{
	public ItemDualDagger(int id,EnumToolMaterial material,String name,int iconindex) {
		super(id,material);
		setMaxStackSize(1);
		setCreativeTab(ChaosCrossover.tabsDMCC);
		setIconIndex(iconindex);
		setItemName(name);
		LanguageRegistry.addName(this, name);
		// TODO Auto-generated constructor stub
	}
	public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET;
	}
	@Override
	public boolean isFull3D()
    {
        return true;
    }
}
 