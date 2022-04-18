package ru.nsu.fit.carfactory.infrastructure.port;

import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;

public interface SparePartsStorage<T>{
    void store(T sparePart);
    T consign();
}
