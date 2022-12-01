package com.lis.prodconsTwoAndTaskPlayer.library;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {
    private final List<T> storage;

    public Storage() {
        this.storage = new ArrayList<>();
    }

    public List<T> read() {
        synchronized (storage) {
            return List.copyOf(storage);
        }
    }

    public void write(T t) {
        synchronized (storage) {
            storage.add(t);
        }
    }


}
