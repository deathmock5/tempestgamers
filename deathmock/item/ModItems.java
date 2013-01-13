package com.tempestgamers.deathmock.item;

import java.util.List;

import com.tempestgamers.deathmock.item.armor.ItemArmorMaidBoots;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidHat;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidPants;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidTop;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;

public class ModItems {
	public final static ItemSword stonesickle = new ItemWeaponScythe();
	public final static ItemSword waterstaff = new ItemStaffWater();
	public final static ItemSword hookshot = new ItemHookShot();
	public final static ItemSword firestaff = new ItemFireStaff();
	public final static ItemSword dualdagger = new ItemDualDagger();
	public final static ItemSword earthstaff = new ItemEarthStaff();
	public final static ItemSword bloodstaff = new ItemBloodStaff();
	public static void init(){
		MaidOutfit.init();
		HeroOutfit.init();
		MarioOutfit.init();
		
		//init items
		
		
		//register items
		GameRegistry.registerItem(stonesickle, Strings.ITEMSTONESCYTHE);
		
		initItemRecipes();
	}
	
	private static void initItemRecipes() {
		// TODO Auto-generated method stub
		MaidOutfit.addRecipes();
		HeroOutfit.addRecipes();
		MarioOutfit.addRecipes();
	}

	public static void preloadTextures() {
		// TODO Auto-generated method stub
		MaidOutfit.preloadTextures();
		HeroOutfit.preloadTextures();
		MarioOutfit.preloadTextures();
	}
	
}
