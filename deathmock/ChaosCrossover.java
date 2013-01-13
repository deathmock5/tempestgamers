package com.tempestgamers.deathmock;

//api imports

//mod imports
import java.util.logging.Level;

import com.tempestgamers.deathmock.lib.Reference;
import com.tempestgamers.deathmock.network.PacketHandler;
import com.tempestgamers.deathmock.proxy.CommonProxy;
import com.tempestgamers.deathmock.proxy.ClientProxy;

//import com.tempestgamers.deathmock.core.helper.LogHelper;
//import com.tempestgamers.deathmock.core.helper.GeneralHelper;
import com.tempestgamers.deathmock.block.ModBlocks;
import com.tempestgamers.deathmock.creativetab.CreativeTabDMCC;
import com.tempestgamers.deathmock.handlers.LocalizationHandler;
import com.tempestgamers.deathmock.helper.AddonRedPower2;
import com.tempestgamers.deathmock.helper.LogHelper;
import com.tempestgamers.deathmock.item.ModItems;
//minecraft imports
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;

//forge imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
//import cpw.mods.fml.relauncher.Side;


/**
 * ChaosCrossover
 * This is the Base mod class for the ChaosCrossover Mod, an additive mod for
 * EE3 buildcraft, industrialcraft, redpower, T3
 * http://tempistgamers.com
 * 
 * @author Deathmock5
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,
version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true,
serverSideRequired = false, packetHandler = PacketHandler.class)
public class ChaosCrossover {

    @Instance(Reference.MOD_ID)
    public static ChaosCrossover instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
            serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    public static ClientProxy client;
    public static CreativeTabs tabsDMCC = new CreativeTabDMCC(CreativeTabs.getNextID(), Reference.MOD_ID);

    @ServerStarting
    public void serverStarting(FMLServerStartingEvent event) {

        // Initialize the custom commands
        //CommandHandler.initCommands(event);
    }
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

        // Initialize the log helper
    	LogHelper.init();
    	LogHelper.log(Level.INFO, "ChaosCrossover Initilizeing");
    	
        // Load the localization files into the LanguageRegistry
    	LocalizationHandler.loadLanguages();

        // Initialize the configuration
  //      ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        // Conduct the version check and log the result
      //  if (ConfigurationSettings.ENABLE_VERSION_CHECK) {
    //        VersionHelper.checkVersion();
    //    }
   //     VersionHelper.logResult();

        // Initialize the Version Check Tick Handler (Client only)
   //     TickRegistry.registerTickHandler(new VersionCheckTickHandler(), Side.CLIENT);

        // Initialize the Render Tick Handler (Client only)
        proxy.registerRenderTickHandler();

        // Register the KeyBinding Handler (Client only)
        proxy.registerKeyBindingHandler();

        // Register the Sound Handler (Client only)
        proxy.registerSoundHandler();

    }

    @Init
    public void load(FMLInitializationEvent event) {

        // Initialize the custom item rarity types
        proxy.initCustomRarityTypes();

        // Register the GUI Handler
        NetworkRegistry.instance().registerGuiHandler(instance, proxy);

        // Register the PlayerDestroyItem Handler
  //      MinecraftForge.EVENT_BUS.register(new PlayerDestroyItemHandler());

        // Register the Item Pickup Handler
 //  MinecraftForge.EVENT_BUS.register(new ItemPickupHandler());

        // Register the EntityLiving Handler
     //   MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());

  //      MinecraftForge.EVENT_BUS.register(new ActionRequestHandler());

   //     MinecraftForge.EVENT_BUS.register(new WorldTransmutationHandler());

        // Register the DrawBlockHighlight Handler
        proxy.registerDrawBlockHighlightHandler();
        
        //Atepting to load redpower blocks.
        AddonRedPower2.initWorld();

        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();

        // Initialize mod tile entities
        proxy.initTileEntities();

        // Initialize custom rendering and pre-load textures (Client only)
        proxy.initRenderingAndTextures();

        // Register the Fuel Handler
       // GameRegistry.registerFuelHandler(new FuelHandler());

    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event) {

        // Initialize the Addon Handler
       // AddonHandler.init();

    }
}
