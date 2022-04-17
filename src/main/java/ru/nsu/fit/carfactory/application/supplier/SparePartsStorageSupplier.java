package ru.nsu.fit.carfactory.application.supplier;

import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;

public interface SparePartsStorageSupplier<T extends SparePart> {
    void supplySparePart(T sparePart);
}
