package com.tempestgamers.deathmock.item;

import com.tempestgamers.deathmock.item.armor.ItemArmorMarioBoots;
import com.tempestgamers.deathmock.item.armor.ItemArmorMarioHat;
import com.tempestgamers.deathmock.item.armor.ItemArmorMarioPants;
import com.tempestgamers.deathmock.item.armor.ItemArmorMarioTop;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.EnumHelper;

public class MarioOutfit{
	public static String outfitloc1;
	public static String outfitloc2;
	public static Item hat;
	public static Item top;
	public static Item bottom;
	public static Item boots;
	public static EnumArmorMaterial material;
	public static String outfitname;
	public static void init()
	{
		outfitname = Strings.MARIOOUTFITNAME;
		outfitloc1 = Sprites.ARMOR_SHEET_LOCATION + Sprites.Mario_Outfit_1;
		outfitloc2 = Sprites.ARMOR_SHEET_LOCATION + Sprites.Mario_Outfit_2;
		material = EnumHelper.addArmorMaterial(outfitname, 100, new int[]{0,0,0,0}, 0);
		hat = new ItemArmorMarioHat(ItemIds.ITEMMARIOHAT,ModLoader.addArmor(outfitname));
		top = new ItemArmorMarioTop(ItemIds.ITEMMARIOTOP,ModLoader.addArmor(outfitname));
		bottom = new ItemArmorMarioPants(ItemIds.ITEMMARIOLEGS,ModLoader.addArmor(outfitname));
		boots = new ItemArmorMarioBoots(ItemIds.ITEMMARIOBOOTS,ModLoader.addArmor(outfitname));
		register(); //Aright now that everything's created, lets register it.
	}
	protected static void register()
	{
		GameRegistry.registerItem(hat, outfitname + " Hat");
		GameRegistry.registerItem(top, outfitname + " Top");
		GameRegistry.registerItem(bottom, outfitname + " Pants");
		GameRegistry.registerItem(boots, outfitname + " Boots");
	}
	public static void addRecipes()
	{
		
	}
	public static void preloadTextures() {
		MinecraftForgeClient.preloadTexture(outfitloc1);
        MinecraftForgeClient.preloadTexture(outfitloc2);
	}
}
