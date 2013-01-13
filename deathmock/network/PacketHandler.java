package com.tempestgamers.deathmock.network;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

import com.tempestgamers.deathmock.network.packet.PacketDMCC;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {

    /***
     * 
     * @param manager
     *            The NetworkManager associated with the current platform
     *            (client/server)
     * @param packet
     *            The Packet250CustomPayload that was received
     * @param player
     *            The Player associated with the packet
     */
    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {

        // Build a PacketEE object from the data contained within the Packet250CustomPayload packet
        PacketDMCC packetdm = PacketTypeHandler.buildPacket(packet.data);

        // Execute the appropriate actions based on the PacketEE type
        packetdm.execute(manager, player);
    }

}