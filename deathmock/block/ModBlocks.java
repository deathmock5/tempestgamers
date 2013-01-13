package com.tempestgamers.deathmock.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.tempestgamers.deathmock.lib.BlockIds;
import com.tempestgamers.deathmock.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
public class ModBlocks {

    /* Mod block instances */
    public static Block sink;
    public static Block aloyblue;
    public static Block aloyred;
    public static Block silverblock;
    public static Block brassblock;
    public static Block panalatorblock;
    public static void init() {

        sink = new Sink(BlockIds.SINK);
        aloyblue = new BlueAlloyBlock(BlockIds.BlueAlloyBlock);
        aloyred = new RedAlloyBlock(BlockIds.RedAlloyBlock);
        silverblock = new SilverBlock(BlockIds.SilverBlock);
        brassblock = new BrassBlock(BlockIds.BrassBlock);
        panalatorblock = new Panalator(BlockIds.PanalatorBlock);
        GameRegistry.registerBlock(sink,Strings.SINKNAME);
        GameRegistry.registerBlock(aloyblue,Strings.BLUEALLOYBLOCKNAME);
        GameRegistry.registerBlock(aloyred,Strings.REDALLOYBLOCKNAME);
        GameRegistry.registerBlock(brassblock,Strings.BRASSBLOCKNAME);
        GameRegistry.registerBlock(silverblock,Strings.SILVERBLOCKNAME);
        GameRegistry.registerBlock(panalatorblock,Strings.PANALATORNAME);
        initBlockRecipes();

    }

    private static void initBlockRecipes() {

    	GameRegistry.addRecipe(new ItemStack(sink), new Object[] {"iii","iii","iii",Character.valueOf('i'),Block.dirt});
    	
    }

}
