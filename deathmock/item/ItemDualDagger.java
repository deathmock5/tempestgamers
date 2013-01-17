package com.tempestgamers.deathmock.item;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
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
	public static void init()
	{
		//init
		final ItemScythe stonescythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERSTONE,EnumToolMaterial.STONE,Strings.ITEMWEAPONDAGGERSTONE,Sprites.ITEMWEAPONDAGGERSTONE);
		final ItemScythe marblescythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERMARBLE,EnumToolMaterial.STONE,Strings.ITEMWEAPONDAGGERMARBLE,Sprites.ITEMWEAPONDAGGERMARBLE);
		final ItemScythe basaltscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERBASALT,EnumToolMaterial.STONE,Strings.ITEMWEAPONDAGGERBASALT,Sprites.ITEMWEAPONDAGGERBASALT);
		final ItemScythe copperscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERCOPPER,EnumToolMaterial.STONE,Strings.ITEMWEAPONDAGGERCOPPER,Sprites.ITEMWEAPONDAGGERCOPPER);
		final ItemScythe ironscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERIRON,EnumToolMaterial.IRON,Strings.ITEMWEAPONDAGGERIRON,Sprites.ITEMWEAPONDAGGERIRON);
		final ItemScythe goldscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERGOLD,EnumToolMaterial.GOLD,Strings.ITEMWEAPONDAGGERGOLD,Sprites.ITEMWEAPONDAGGERGOLD);
		final ItemScythe diamondscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERDIAMOND,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERDIAMOND,Sprites.ITEMWEAPONDAGGERDIAMOND);
		final ItemScythe enderscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERENDER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERENDER,Sprites.ITEMWEAPONDAGGERENDER);
		final ItemScythe saphirescythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERSAPHIRE,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERSAPHIRE,Sprites.ITEMWEAPONDAGGERSAPHIRE);
		final ItemScythe rubyscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERRUBY, EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERRUBY, Sprites.ITEMWEAPONDAGGERRUBY);
		final ItemScythe emeraldscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGEREMERALD,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGEREMERALD,Sprites.ITEMWEAPONDAGGEREMERALD);
		final ItemScythe darkscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERDARKMATTER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERDARKMATTER,Sprites.ITEMWEAPONDAGGERDARKMATTER);
		final ItemScythe redscythe = new ItemScythe(ItemIds.ITEMWEAPONDAGGERREDMATTER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONDAGGERREDMATTER,Sprites.ITEMWEAPONDAGGERREDMATTER);
		//reg
		GameRegistry.registerItem(stonescythe, Strings.ITEMWEAPONDAGGERSTONE);
		GameRegistry.registerItem(marblescythe, Strings.ITEMWEAPONDAGGERMARBLE);
		GameRegistry.registerItem(basaltscythe, Strings.ITEMWEAPONDAGGERBASALT);
		GameRegistry.registerItem(copperscythe, Strings.ITEMWEAPONDAGGERCOPPER);
		GameRegistry.registerItem(ironscythe, Strings.ITEMWEAPONDAGGERIRON);
		GameRegistry.registerItem(goldscythe, Strings.ITEMWEAPONDAGGERGOLD);
		GameRegistry.registerItem(diamondscythe, Strings.ITEMWEAPONDAGGERDIAMOND);
		GameRegistry.registerItem(enderscythe, Strings.ITEMWEAPONDAGGERENDER);
		GameRegistry.registerItem(saphirescythe, Strings.ITEMWEAPONDAGGERSAPHIRE);
		GameRegistry.registerItem(rubyscythe, Strings.ITEMWEAPONDAGGERRUBY);
		GameRegistry.registerItem(emeraldscythe, Strings.ITEMWEAPONDAGGEREMERALD);
		GameRegistry.registerItem(darkscythe, Strings.ITEMWEAPONDAGGERDARKMATTER);
		GameRegistry.registerItem(redscythe, Strings.ITEMWEAPONDAGGERREDMATTER);
	}
}
 