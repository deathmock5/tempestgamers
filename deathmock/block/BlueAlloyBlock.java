package com.tempestgamers.deathmock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.ChaosCrossover;

import cpw.mods.fml.common.registry.LanguageRegistry;
public class BlueAlloyBlock extends Block{

	public BlueAlloyBlock(int id) {
		super(id,Sprites.BLUEALLOYBLOCKSPRITEID,Material.iron);
		setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setBlockName(Strings.BLUEALLOYBLOCKNAME);
        setCreativeTab(ChaosCrossover.tabsDMCC);
        LanguageRegistry.addName(this, Strings.BLUEALLOYBLOCKNAME);
        
	}
	
	 @Override
     public String getTextureFile () {
             return Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET;
     }
	 
}
