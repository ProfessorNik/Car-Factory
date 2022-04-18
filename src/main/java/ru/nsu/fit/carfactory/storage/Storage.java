package ru.nsu.fit.carfactory.storage;

import ru.nsu.fit.carfactory.infrastructure.port.CarStorage;
import ru.nsu.fit.carfactory.infrastructure.port.SparePartsStorage;

import java.util.ArrayDeque;

public class Storage<T> implements SparePartsStorage<T>, CarStorage<T> {
    private final ArrayDeque<T> storage;

    public Storage() {
        this.storage = new ArrayDeque<>();
    }

    public void store(T engine){
        storage.add(engine);
    }

    public T consign(){
        return storage.pop();
    }
}
