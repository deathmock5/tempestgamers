package com.tempestgamers.deathmock.item;

import java.util.List;

import com.tempestgamers.deathmock.item.armor.ItemArmorMaidBoots;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidHat;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidPants;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidTop;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;

public class ModItems {

	//daggers
	//public final static ItemSword dualdagger = new ItemDualDaggerStone();
	
	//staffs
	public final static ItemStaff waterstaff = new ItemStaffWater();
	public final static ItemStaff firestaff = new ItemStaffFire();
	public final static ItemStaff earthstaff = new ItemStaffEarth();
	public final static ItemStaff bloodstaff = new ItemStaffBlood();
	public final static ItemStaff enderstaff = new ItemStaffEnder();
	public final static ItemStaff naturestaff = new ItemStaffNature();
	public final static ItemStaff windstaff = new ItemStaffWind();
	//tools
	public final static ItemHookShot hookshot = new ItemHookShot();

	public static void init(){
		MaidOutfit.init();
		HeroOutfit.init();
		MarioOutfit.init();
		ItemScythe.init();
		ItemDualDagger.init();
		//init items
		
		
		//register items
		GameRegistry.registerItem(hookshot, "HookShot");
		//daggers
		
		//staves
		GameRegistry.registerItem(waterstaff,Strings.ITEMSTAFFWATER);
		GameRegistry.registerItem(firestaff,Strings.ITEMSTAFFFIRE);
		GameRegistry.registerItem(earthstaff,Strings.ITEMSTAFFEARTH);
		GameRegistry.registerItem(bloodstaff,Strings.ITEMSTAFFBLOOD);
		GameRegistry.registerItem(enderstaff,Strings.ITEMSTAFFENDER);
		GameRegistry.registerItem(naturestaff,Strings.ITEMSTAFFNATURE);
		GameRegistry.registerItem(windstaff,Strings.ITEMSTAFFWIND);
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
