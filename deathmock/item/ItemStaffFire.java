package com.tempestgamers.deathmock.item;

import java.util.logging.Level;

import com.tempestgamers.deathmock.helper.LogHelper;
import com.tempestgamers.deathmock.lib.ItemIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemStaffFire extends ItemStaff{
	
	public ItemStaffFire() {
		super(ItemIds.ITEMSTAFFFIRE, EnumToolMaterial.STONE, Strings.ITEMSTAFFFIRE,Sprites.ITEMSTAFFFIRE_EXP);
		// TODO Auto-generated constructor stub
		this.setMaxDamage(400);
	}
	 
}
 