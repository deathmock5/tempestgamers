package com.tempestgamers.deathmock.network.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;

import com.tempestgamers.deathmock.item.IKeyBound;
import com.tempestgamers.deathmock.network.PacketTypeHandler;

import cpw.mods.fml.common.network.Player;
public class PacketKeyPressed extends PacketDMCC {

    public String key;

    public PacketKeyPressed() {

        super(PacketTypeHandler.KEY, false);
    }

    public PacketKeyPressed(String key) {

        super(PacketTypeHandler.KEY, false);
        this.key = key;
    }

    public void writeData(DataOutputStream data) throws IOException {

        data.writeUTF(key);
    }

    public void readData(DataInputStream data) throws IOException {

        this.key = data.readUTF();
    }

    public void setKey(String key) {

        this.key = key;
    }

    public void execute(INetworkManager manager, Player player) {

        EntityPlayer thePlayer = (EntityPlayer) player;

        //if ((thePlayer.getCurrentEquippedItem() != null) && (thePlayer.getCurrentEquippedItem().getItem() instanceof IKeyBound)) {
        //    ((IKeyBound) thePlayer.getCurrentEquippedItem().getItem()).doKeyBindingAction(thePlayer, thePlayer.getCurrentEquippedItem(), this.key);
        //}
    }
}