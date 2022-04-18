package ru.nsu.fit.carfactory.application.usecase;

import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromOutside;
import ru.nsu.fit.carfactory.application.port.SparePartsSupplierToStorage;
import ru.nsu.fit.carfactory.domain.partsofcar.SparePart;

public class ReceiveSparePartFromOutsideAndSupplyToStorage {
    private final SparePartsConsigneeFromOutside<SparePart> from;
    private final SparePartsSupplierToStorage<SparePart> to;

    public ReceiveSparePartFromOutsideAndSupplyToStorage
            (SparePartsConsigneeFromOutside<SparePart> from,
             SparePartsSupplierToStorage<SparePart> to) {
        this.from = from;
        this.to = to;
    }

    public void execute(){
        SparePart sparePart = from.getSparePart();
        to.supplySparePart(sparePart);
    }
}
