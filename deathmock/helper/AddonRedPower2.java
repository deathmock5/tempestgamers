package com.tempestgamers.deathmock.helper;
import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.Loader;

public class AddonRedPower2 {

    public static Item rp2RedBar = null;

    public static void initWorld() {

        if (Loader.isModLoaded("RedPowerBace")) {
            try {
                rp2RedBar = (Item) Class.forName("com.eloraam.redpower.RedPowerBace").getField("ingotRed").get(null);

                LogHelper.log(Level.INFO, "Loaded RP2 Bace addon");
            }
            catch (Exception e) {
                LogHelper.log(Level.SEVERE, "Could not load RP2 Bace addon");
                e.printStackTrace(System.err);
            }
        }
        else
        {
        	LogHelper.log(Level.INFO, "Could not load RP2 Bace addon Reason:RP2 Not found");
        }
    }

}
