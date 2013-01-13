package com.tempestgamers.deathmock.block;

import com.tempestgamers.deathmock.lib.Strings;

import com.tempestgamers.deathmock.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidTank;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.GuiIds;
import com.tempestgamers.deathmock.lib.RenderIds;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.tileentity.TileSink;
import net.minecraftforge.liquids.ILiquidTank;
import net.minecraftforge.liquids.LiquidTank;

import cpw.mods.fml.common.registry.LanguageRegistry;

import buildcraft.api.core.Position;

public class Sink extends DMCCBLOCK implements ILiquidTank {
	public static int MAX_LIQUID = LiquidContainerRegistry.BUCKET_VOLUME * 10;
	private LiquidTank watertank;
	LiquidStack water = LiquidContainerRegistry.getLiquidForFilledItem(new ItemStack(Item.bucketWater));
	public Sink (int id){
		super(id,Material.rock);
		this.setBlockName(Strings.SINKNAME);
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		this.setHardness(5f);
		watertank = new LiquidTank(MAX_LIQUID);
		watertank.setLiquid(water);
		LanguageRegistry.addName(this, Strings.SINKNAME);
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {

        return new TileSink();
    }
	
	@Override
	public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving) {
		super.onBlockPlacedBy(world, i, j, k, entityliving);

		ForgeDirection orientation = get2dOrientation(new Position(entityliving.posX, entityliving.posY, entityliving.posZ), new Position(i, j, k));

		world.setBlockMetadataWithNotify(i, j, k, orientation.getOpposite().ordinal());
	}
	
	public static ForgeDirection get2dOrientation(Position pos1, Position pos2) {
		double Dx = pos1.x - pos2.x;
		double Dz = pos1.z - pos2.z;
		double angle = Math.atan2(Dz, Dx) / Math.PI * 180 + 180;

		if (angle < 45 || angle > 315)
			return ForgeDirection.EAST;
		else if (angle < 135)
			return ForgeDirection.SOUTH;
		else if (angle < 225)
			return ForgeDirection.WEST;
		else
			return ForgeDirection.NORTH;
	}
	
	@Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {

        return false;
    }
    
    @Override
    public int getRenderType() {
 
        return RenderIds.sinkRenderId;
    }

    @Override
    public int getBlockTextureFromSide(int par1) {

        return 1;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
    	super.onBlockActivated(world, x, y, z, player, par6, par7, par8, par9);
    	ItemStack current = player.inventory.getCurrentItem();
    	if(current != null){
    		LiquidStack liquid = LiquidContainerRegistry.getLiquidForFilledItem(current);
    		if(liquid != null){
    			//ok trying to put liquid in. NO
    			return false;
    		}
    		else{
    			//ok we got an somthing. my be a container may not be. may be already filled.
    			ItemStack filled = LiquidContainerRegistry.fillLiquidContainer(water, current);
    			if (water != null && filled != null){
    				if (filled.stackSize > 1) {
    					if (!player.inventory.addItemStackToInventory(filled))
    						return false;
    					else {
    						player.inventory.setInventorySlotContents(player.inventory.currentItem, consumeItem(current));
    						player.inventory.setInventorySlotContents(player.inventory.currentItem, filled);
    					}
    				} else {
    					player.inventory.setInventorySlotContents(player.inventory.currentItem, consumeItem(current));
    					player.inventory.setInventorySlotContents(player.inventory.currentItem, filled);
    				}
    			}
    			else
    			{
    				return false;
    			}
    		}
    	}
        return true;

    }
    /* ITANKCONTAINER */
    public LiquidTank[] getLiquidSlots() {
		return new LiquidTank[0];
	}

	
    private static ItemStack consumeItem(ItemStack stack) {
		if (stack.stackSize == 1) {
			if (stack.getItem().hasContainerItem())
				return stack.getItem().getContainerItemStack(stack);
			else
				return null;
		} else {
			stack.splitStack(1);

			return stack;
		}
	}

	@Override
	public LiquidStack getLiquid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fill(LiquidStack resource, boolean doFill) {
		// TODO Auto-generated method stub
		return watertank.fill(resource, doFill);
	}

	@Override
	public LiquidStack drain(int maxDrain, boolean doDrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTankPressure() {
		// TODO Auto-generated method stub
		return 0;
	}
}
