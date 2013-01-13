package com.tempestgamers.deathmock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.lib.Strings;
import com.tempestgamers.deathmock.ChaosCrossover;

import cpw.mods.fml.common.registry.LanguageRegistry;
public class BrassBlock extends Block{

	public BrassBlock(int id) {
		super(id,Sprites.BRASSBLOCK,Material.iron);
		setHardness(1.0F);
        setStepSound(Block.soundStoneFootstep);
        setBlockName(Strings.BRASSBLOCKNAME);
        setCreativeTab(ChaosCrossover.tabsDMCC);
        LanguageRegistry.addName(this, Strings.BRASSBLOCKNAME);
        
	}
	
	 @Override
     public String getTextureFile () {
             return Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET;
     }
	 
}
