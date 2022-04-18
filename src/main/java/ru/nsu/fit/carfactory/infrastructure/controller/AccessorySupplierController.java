package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromOutside;
import ru.nsu.fit.carfactory.domain.partsofcar.Accessory;

public class AccessorySupplierController
        implements SparePartsConsigneeFromOutside<Accessory> {
    @Override
    public Accessory getSparePart() {
        return Accessory.build();
    }
}
