package com.tempestgamers.deathmock.proxy;
//import static com.tempestgamers.deathmock.lib.CustomItemRarity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;

import com.tempestgamers.deathmock.ChaosCrossover;
import com.tempestgamers.deathmock.client.audio.SoundHandler;
import com.tempestgamers.deathmock.client.renderer.ItemSinkRenderer;
//import com.tempestgamers.deathmock.client.renderer.ItemCalcinatorRenderer;
//import com.tempestgamers.deathmock.client.renderer.texturefx.TextureRedWaterFX;
//import com.tempestgamers.deathmock.client.renderer.texturefx.TextureRedWaterFlowFX;
//import com.tempestgamers.deathmock.client.renderer.tileentity.TileEntityCalcinatorRenderer;
//import com.tempestgamers.deathmock.core.handlers.DrawBlockHighlightHandler;
//TODO:import com.tempestgamers.deathmock.core.handlers.KeyBindingHandler;
//TODO:import com.tempestgamers.deathmock.core.handlers.TransmutationTargetOverlayHandler;
//TODO:import com.tempestgamers.deathmock.core.helper.KeyBindingHelper;
//TODO:import com.tempestgamers.deathmock.core.helper.TransmutationHelper;
//TODO:import com.tempestgamers.deathmock.item.IChargeable;
//TODO:import com.tempestgamers.deathmock.lib.ActionTypes;
import com.tempestgamers.deathmock.item.HeroOutfit;
import com.tempestgamers.deathmock.item.MaidOutfit;
import com.tempestgamers.deathmock.item.ModItems;
import com.tempestgamers.deathmock.lib.BlockIds;
import com.tempestgamers.deathmock.lib.RenderIds;
import com.tempestgamers.deathmock.lib.Sprites;
import com.tempestgamers.deathmock.network.PacketTypeHandler;
import com.tempestgamers.deathmock.network.packet.PacketRequestEvent;
import com.tempestgamers.deathmock.tileentity.TileEntitySinkRenderer;
import com.tempestgamers.deathmock.tileentity.TileSink;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * ClientProxy
 * 
 * Client specific functionality that cannot be put into CommonProxy
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerKeyBindingHandler() {

      //  KeyBindingRegistry.registerKeyBinding(new KeyBindingHandler());
    }

    @Override
    public void registerRenderTickHandler() {

       // TickRegistry.registerTickHandler(new TransmutationTargetOverlayHandler(), Side.CLIENT);
    }

    @Override
    public void registerDrawBlockHighlightHandler() {

      //  MinecraftForge.EVENT_BUS.register(new DrawBlockHighlightHandler());
    }

    @Override
    public void setKeyBinding(String name, int value) {

      //  KeyBindingHelper.addKeyBinding(name, value);
      //  KeyBindingHelper.addIsRepeating(false);
    }

    @Override
    public void registerSoundHandler() {

        MinecraftForge.EVENT_BUS.register(new SoundHandler());
    }

    @Override
    public void initCustomRarityTypes() {

     //TODO:   EnumHelperClient.addRarity(JUNK, COLOR_JUNK, DISPLAY_NAME_JUNK);
     //TODO:   EnumHelperClient.addRarity(NORMAL, COLOR_NORMAL, DISPLAY_NAME_NORMAL);
     //TODO:   EnumHelperClient.addRarity(UNCOMMON, COLOR_UNCOMMON, DISPLAY_NAME_UNCOMMON);
     //TODO:   EnumHelperClient.addRarity(MAGICAL, COLOR_MAGICAL, DISPLAY_NAME_MAGICAL);
     // TODO:  EnumHelperClient.addRarity(RARE, COLOR_RARE, DISPLAY_NAME_RARE);
     // TODO:  EnumHelperClient.addRarity(EPIC, COLOR_EPIC, DISPLAY_NAME_EPIC);
     // TODO:  EnumHelperClient.addRarity(LEGENDARY, COLOR_LEGENDARY, DISPLAY_NAME_LEGENDARY);
    }

    @Override
    public EnumRarity getCustomRarityType(String customRarity) {

        for (EnumRarity rarity : EnumRarity.class.getEnumConstants()) {
            if (rarity.name().equals(customRarity))
                return rarity;
        }
        return EnumRarity.common;
    }

    @Override
    public void initRenderingAndTextures() {

    	RenderIds.sinkRenderId = RenderingRegistry.getNextAvailableRenderId();

        MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET);
        MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET);
        MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.Item_Staff_Sprites);
        ModItems.preloadTextures();
       // FMLClientHandler.instance().getClient().renderEngine.registerTextureFX(new TextureRedWaterFX());
       // FMLClientHandler.instance().getClient().renderEngine.registerTextureFX(new TextureRedWaterFlowFX());

       MinecraftForgeClient.registerItemRenderer(BlockIds.SINK, new ItemSinkRenderer());
    }

    @Override
    public void initTileEntities() {

        super.initTileEntities();

        ClientRegistry.bindTileEntitySpecialRenderer(TileSink.class, new TileEntitySinkRenderer());
    }

    @Override
    public void sendRequestEventPacket(byte eventType, int originX, int originY, int originZ, byte sideHit, byte rangeX, byte rangeY, byte rangeZ, String data) {

        PacketDispatcher.sendPacketToServer(PacketTypeHandler.populatePacket(new PacketRequestEvent(eventType, originX, originY, originZ, sideHit, rangeX, rangeY, rangeZ, data)));
    }

  
}
