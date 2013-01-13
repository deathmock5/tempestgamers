package com.tempestgamers.deathmock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.ChaosCrossover;

import cpw.mods.fml.common.registry.LanguageRegistry;
public class SilverBlock extends Block{

	public SilverBlock(int id) {
		super(id,Sprites.SILVERBLOCK,Material.iron);
		setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setBlockName(Strings.SILVERBLOCKNAME);
        setCreativeTab(ChaosCrossover.tabsDMCC);
        LanguageRegistry.addName(this, Strings.SILVERBLOCKNAME);
        
	}
	
	 @Override
     public String getTextureFile () {
             return Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET;
     }
	 
}
