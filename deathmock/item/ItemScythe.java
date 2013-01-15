package com.tempestgamers.deathmock.item;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemScythe extends ItemSword{
	public ItemScythe(int id,EnumToolMaterial material,String name,int iconindex) {
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
		final ItemScythe stonescythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHESTONE,EnumToolMaterial.STONE,Strings.ITEMWEAPONSCYTHESTONE,Sprites.ITEMWEAPONSCYTHESTONE);
		final ItemScythe marblescythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEMARBLE,EnumToolMaterial.STONE,Strings.ITEMWEAPONSCYTHEMARBLE,Sprites.ITEMWEAPONSCYTHEMARBLE);
		final ItemScythe basaltscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEBASALT,EnumToolMaterial.STONE,Strings.ITEMWEAPONSCYTHEBASALT,Sprites.ITEMWEAPONSCYTHEBASALT);
		final ItemScythe copperscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHECOPPER,EnumToolMaterial.STONE,Strings.ITEMWEAPONSCYTHECOPPER,Sprites.ITEMWEAPONSCYTHECOPPER);
		final ItemScythe ironscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEIRON,EnumToolMaterial.IRON,Strings.ITEMWEAPONSCYTHEIRON,Sprites.ITEMWEAPONSCYTHEIRON);
		final ItemScythe goldscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEGOLD,EnumToolMaterial.GOLD,Strings.ITEMWEAPONSCYTHEGOLD,Sprites.ITEMWEAPONSCYTHEGOLD);
		final ItemScythe diamondscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEDIAMOND,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHEDIAMOND,Sprites.ITEMWEAPONSCYTHEDIAMOND);
		final ItemScythe enderscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEENDER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHEENDER,Sprites.ITEMWEAPONSCYTHEENDER);
		final ItemScythe saphirescythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHESAPHIRE,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHESAPHIRE,Sprites.ITEMWEAPONSCYTHESAPHIRE);
		final ItemScythe rubyscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHERUBY, EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHERUBY, Sprites.ITEMWEAPONSCYTHERUBY);
		final ItemScythe emeraldscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEEMERALD,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHEEMERALD,Sprites.ITEMWEAPONSCYTHEEMERALD);
		final ItemScythe darkscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEDARKMATTER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHEDARKMATTER,Sprites.ITEMWEAPONSCYTHEDARKMATTER);
		final ItemScythe redscythe = new ItemScythe(ItemIds.ITEMWEAPONSCYTHEREDMATTER,EnumToolMaterial.EMERALD,Strings.ITEMWEAPONSCYTHEREDMATTER,Sprites.ITEMWEAPONSCYTHEREDMATTER);
		//reg
		GameRegistry.registerItem(stonescythe, Strings.ITEMWEAPONSCYTHESTONE);
		GameRegistry.registerItem(marblescythe, Strings.ITEMWEAPONSCYTHEMARBLE);
		GameRegistry.registerItem(basaltscythe, Strings.ITEMWEAPONSCYTHEBASALT);
		GameRegistry.registerItem(copperscythe, Strings.ITEMWEAPONSCYTHECOPPER);
		GameRegistry.registerItem(ironscythe, Strings.ITEMWEAPONSCYTHEIRON);
		GameRegistry.registerItem(goldscythe, Strings.ITEMWEAPONSCYTHEGOLD);
		GameRegistry.registerItem(diamondscythe, Strings.ITEMWEAPONSCYTHEDIAMOND);
		GameRegistry.registerItem(enderscythe, Strings.ITEMWEAPONSCYTHEENDER);
		GameRegistry.registerItem(saphirescythe, Strings.ITEMWEAPONSCYTHESAPHIRE);
		GameRegistry.registerItem(rubyscythe, Strings.ITEMWEAPONSCYTHERUBY);
		GameRegistry.registerItem(emeraldscythe, Strings.ITEMWEAPONSCYTHEEMERALD);
		GameRegistry.registerItem(darkscythe, Strings.ITEMWEAPONSCYTHEDARKMATTER);
		GameRegistry.registerItem(redscythe, Strings.ITEMWEAPONSCYTHEREDMATTER);
	}
}
 