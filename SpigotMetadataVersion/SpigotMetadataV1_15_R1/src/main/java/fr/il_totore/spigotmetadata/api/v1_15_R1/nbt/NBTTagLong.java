package fr.il_totore.spigotmetadata.api.v1_15_R1.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_15_R1.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_15_R1.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
    }
}
