package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.SparePartsSupplierToStorage;
import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromStorage;
import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;
import ru.nsu.fit.carfactory.infrastructure.port.SparePartsStorage;

public class SparePartsStorageController<T extends SparePart>
        implements SparePartsSupplierToStorage<T>, SparePartsConsigneeFromStorage<T> {
    SparePartsStorage<T> storage;

    public SparePartsStorageController(SparePartsStorage<T> storage) {
        this.storage = storage;
    }

    @Override
    public void supplySparePart(T sparePart) {
        storage.store(sparePart);
    }

    @Override
    public T consign() {
        return storage.consign();
    }
}
