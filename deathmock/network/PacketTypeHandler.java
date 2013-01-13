package com.tempestgamers.deathmock.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

import com.tempestgamers.deathmock.lib.Reference;
import com.tempestgamers.deathmock.network.packet.PacketDMCC;
import com.tempestgamers.deathmock.network.packet.PacketKeyPressed;
import com.tempestgamers.deathmock.network.packet.PacketRequestEvent;
import com.tempestgamers.deathmock.network.packet.PacketSpawnParticle;
import com.tempestgamers.deathmock.network.packet.PacketTileUpdate;

public enum PacketTypeHandler {
    KEY(PacketKeyPressed.class),
    TILE(PacketTileUpdate.class),
    REQUEST_EVENT(PacketRequestEvent.class),
    SPAWN_PARTICLE(PacketSpawnParticle.class);

    private Class<? extends PacketDMCC> clazz;

    PacketTypeHandler(Class<? extends PacketDMCC> clazz) {

        this.clazz = clazz;
    }

    public static PacketDMCC buildPacket(byte[] data) {

        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        int selector = bis.read();
        DataInputStream dis = new DataInputStream(bis);

        PacketDMCC packet = null;

        try {
            packet = values()[selector].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        packet.readPopulate(dis);

        return packet;
    }

    public static PacketDMCC buildPacket(PacketTypeHandler type) {

    	PacketDMCC packet = null;

        try {
            packet = values()[type.ordinal()].clazz.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }

        return packet;
    }

    public static Packet populatePacket(PacketDMCC packetDMCC) {

        byte[] data = packetDMCC.populate();

        Packet250CustomPayload packet250 = new Packet250CustomPayload();
        packet250.channel = Reference.CHANNEL_NAME;
        packet250.data = data;
        packet250.length = data.length;
        packet250.isChunkDataPacket = packetDMCC.isChunkDataPacket;

        return packet250;
    }
}