package com.tempestgamers.deathmock.item.armor;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.Sprites;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;

public class ItemArmorBace extends ItemArmor implements ISpecialArmor {
	public static enum ItemArmorSlot {HAT,TOP,PANTS,BOOTS};
	public ItemArmorBace(int itemid,EnumArmorMaterial material,int rindex, int type)
    {
		//itemid, material,renderindex,armortype
        super(itemid,material,rindex,type);
        this.maxStackSize = 1;
        this.setCreativeTab(ChaosCrossover.tabsDMCC);
    }

	@Override
	public ArmorProperties getProperties(EntityLiving player, ItemStack armor,
			DamageSource source, double damage, int slot) {
		return null;
	}
	
	@Override
	 public String getTextureFile() {
	      return Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET;
	   }

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		return 0;
	}

	@Override
	public void damageArmor(EntityLiving entity, ItemStack stack,
			DamageSource source, int damage, int slot) {
	}
	
}
