package ru.nsu.fit.carfactory.application.supplier;

import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;

public interface RecipientOfSparePartsFromSupplier<T extends SparePart> {
    T getSparePart();
}
