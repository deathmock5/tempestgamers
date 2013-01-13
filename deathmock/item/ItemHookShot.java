package com.tempestgamers.deathmock.item;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemHookShot extends ItemSword{
	 public static final Block[] blocksEffectiveAgainst = new Block[] {Block.planks};
	public ItemHookShot() {
		super(ItemIds.ITEMHOOKSHOT, EnumToolMaterial.STONE);
		setMaxStackSize(1);
		setCreativeTab(ChaosCrossover.tabsDMCC);
		setIconIndex(5);
		setItemName(Strings.ITEMHOOKSHOT);
		LanguageRegistry.addName(this, Strings.ITEMHOOKSHOT);
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
 