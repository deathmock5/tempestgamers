package com.tempestgamers.deathmock.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class DMCCBLOCK extends BlockContainer {
	
	public DMCCBLOCK(int id, Material material){
		super(id,material);
	}
	
}
