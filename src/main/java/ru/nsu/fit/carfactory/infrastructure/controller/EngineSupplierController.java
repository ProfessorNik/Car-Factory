package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromOutside;
import ru.nsu.fit.carfactory.domain.partsofcar.Engine;

public class EngineSupplierController implements SparePartsConsigneeFromOutside<Engine> {
    @Override
    public Engine getSparePart() {
        return Engine.build();
    }
}
