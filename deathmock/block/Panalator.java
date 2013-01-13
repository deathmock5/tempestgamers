package com.tempestgamers.deathmock.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.lib.GuiIds;
import com.tempestgamers.deathmock.lib.RenderIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.tileentity.TilePanalator;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Panalator extends DMCCBLOCK {
	public Panalator(int id) {
		super(id, Material.wood);
		this.setBlockName(Strings.PANALATORNAME);
		this.setCreativeTab(ChaosCrossover.tabsDMCC);
		this.setHardness(0.5F);
		LanguageRegistry.addName(this, Strings.PANALATORNAME);
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

        if (!world.isRemote) {
        	TilePanalator tilePanalator = (TilePanalator) world.getBlockTileEntity(x, y, z);

            if (tilePanalator != null) {
                player.openGui(ChaosCrossover.instance, GuiIds.PANALATOR, world, x, y, z);
            }
        }

        return true;

    }
	@Override
	public String getTextureFile() {
		return Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET;
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		// TODO Auto-generated method stub
		return new TilePanalator();
	}
	
	 @Override
	    public int getRenderType() {

	        return RenderIds.panalatorRenderId;
	    }
	 @Override
		public int getBlockTextureFromSide(int i) {
			switch (i) {
			case 0:
				return 1 * 16 + 0;//bottom
			case 1:
				return 1 * 16 + 1;//top
			default:
				return 1 * 16 + 2;//side
			}
		}
}
