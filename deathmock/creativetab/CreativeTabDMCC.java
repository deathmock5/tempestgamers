package com.tempestgamers.deathmock.creativetab;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.tempestgamers.deathmock.block.ModBlocks;
import com.tempestgamers.deathmock.lib.BlockIds;
import com.tempestgamers.deathmock.lib.ItemIds;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;

	public class CreativeTabDMCC extends CreativeTabs
	{
	    
	    //public static final CreativeTabs tabTransport = new CreativeTabTransport(3, "transportation");
	    //public static final CreativeTabs tabMisc = new CreativeTabMisc(4, "misc");
	    //public static final CreativeTabs tabAllSearch = (new CreativeTabSearch(5, "search")).setBackgroundImageName("search.png");
	    //public static final CreativeTabs tabFood = new CreativeTabFood(6, "food");
	    //public static final CreativeTabs tabTools = new CreativeTabTools(7, "tools");
	    //public static final CreativeTabs tabCombat = new CreativeTabCombat(8, "combat");
	    //public static final CreativeTabs tabBrewing = new CreativeTabBrewing(9, "brewing");
	    //public static final CreativeTabs tabMaterials = new CreativeTabMaterial(10, "materials");
	    //public static final CreativeTabs tabInventory = (new CreativeTabInventory(11, "inventory")).setBackgroundImageName("survival_inv.png").setNoScrollbar().setNoTitle();
	    private final String tabLabel;

	    /** Texture to use. */
	    private String backgroundImageName = "list_items.png";
	    private boolean hasScrollbar = true;

	    /** Whether to draw the title in the foreground of the creative GUI */
	    private boolean drawTitle = true;

	    public CreativeTabDMCC(String label)
	    {
	        super( getNextID(), label);
	        tabLabel = "DMCC";
	       
	    }

	    public CreativeTabs setBackgroundImageName(String par1Str)
	    {
	        this.backgroundImageName = par1Str;
	        return this;
	    }


	    /**
	     * Get the ItemStack that will be rendered to the tab.
	     */
	    public ItemStack getIconItemStack()
	    {
	        return new ItemStack(ModBlocks.aloyred);
	    }

	   
	    
	}
