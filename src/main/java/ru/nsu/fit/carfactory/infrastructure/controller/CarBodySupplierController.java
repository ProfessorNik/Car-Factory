package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromOutside;
import ru.nsu.fit.carfactory.domain.partsofcar.CarBody;

public class CarBodySupplierController implements SparePartsConsigneeFromOutside<CarBody> {

    @Override
    public CarBody getSparePart() {
        return CarBody.build();
    }
}
