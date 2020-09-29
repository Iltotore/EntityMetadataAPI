package fr.il_totore.spigotmetadata.api.v1_16_R2.nbt;

public class NBTTagLong extends NBTNumber<net.minecraft.server.v1_16_R2.NBTTagLong, Long> {

    public NBTTagLong(net.minecraft.server.v1_16_R2.NBTTagLong handle) {
        super(handle);
    }

    @Override
    public Long get() {
        return longValue();
    }
}
