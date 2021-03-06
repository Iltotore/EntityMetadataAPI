package fr.il_totore.spigotmetadata.api.v1_8_R3.datawatcher;

import java.util.function.Function;

public class DataWatcherObject<F, T> implements fr.il_totore.spigotmetadata.api.datawatcher.DataWatcherObject<F, T> {

    private int index;
    private Function<F, T> bukkitToNotchFunction;
    private Function<T, F> notchToBukkitFunction;

    public DataWatcherObject(int index, Function<F, T> bukkitToNotchFunction, Function<T, F> notchToBukkitFunction) {
        this.index = index;
        this.bukkitToNotchFunction = bukkitToNotchFunction;
        this.notchToBukkitFunction = notchToBukkitFunction;
    }

    public int getIndex() {
        return index;
    }

    public T bukkitToNotch(F from) {
        return bukkitToNotchFunction.apply(from);
    }

    public F notchToBukkit(T to) {
        return notchToBukkitFunction.apply(to);
    }
}
