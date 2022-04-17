package ru.nsu.fit.carfactory.application.supplier;

import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;

public class Supplier {
    private RecipientOfSparePartsFromSupplier<SparePart> recipient;
    private SparePartsStorageSupplier<SparePart> supplier;

    public void supplySparePart(){
        SparePart sparePart = recipient.getSparePart();
        supplier.supplySparePart(sparePart);
    }
}
