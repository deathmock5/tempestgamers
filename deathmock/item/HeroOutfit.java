package com.tempestgamers.deathmock.item;

import java.util.logging.Level;

import com.tempestgamers.deathmock.helper.LogHelper;
import com.tempestgamers.deathmock.item.armor.ItemArmorHeroBoots;
import com.tempestgamers.deathmock.item.armor.ItemArmorHeroHat;
import com.tempestgamers.deathmock.item.armor.ItemArmorHeroPants;
import com.tempestgamers.deathmock.item.armor.ItemArmorHeroTop;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidBoots;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidHat;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidPants;
import com.tempestgamers.deathmock.item.armor.ItemArmorMaidTop;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.EnumHelper;

public class HeroOutfit {
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
		outfitname = Strings.HEROOUTFITNAME;
		outfitloc1 = Sprites.ARMOR_SHEET_LOCATION + Sprites.Hero_Outfit_1;
		outfitloc2 = Sprites.ARMOR_SHEET_LOCATION + Sprites.Hero_Outfit_2;
		material = EnumHelper.addArmorMaterial(outfitname, 100, new int[]{0,0,0,0}, 0);
		hat = new ItemArmorHeroHat(ItemIds.ITEMHEROHAT,ModLoader.addArmor(outfitname));
		top = new ItemArmorHeroTop(ItemIds.ITEMHEROTOP,ModLoader.addArmor(outfitname));
		bottom = new ItemArmorHeroPants(ItemIds.ITEMHEROLEGS,ModLoader.addArmor(outfitname));
		boots = new ItemArmorHeroBoots(ItemIds.ITEMHEROBOOTS,ModLoader.addArmor(outfitname));
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
	public static void preloadTextures()
	{
		LogHelper.log(Level.INFO, "Loaded:" + outfitloc1);
		MinecraftForgeClient.preloadTexture(outfitloc1);
        MinecraftForgeClient.preloadTexture(outfitloc2);
	}
}
