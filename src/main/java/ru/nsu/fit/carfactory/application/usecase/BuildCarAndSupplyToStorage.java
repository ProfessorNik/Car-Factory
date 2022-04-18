package ru.nsu.fit.carfactory.application.usecase;

import ru.nsu.fit.carfactory.application.port.CarSupplierToStorage;
import ru.nsu.fit.carfactory.application.port.SparePartsConsigneeFromStorage;
import ru.nsu.fit.carfactory.domain.Car;
import ru.nsu.fit.carfactory.domain.partsofcar.Accessory;
import ru.nsu.fit.carfactory.domain.partsofcar.CarBody;
import ru.nsu.fit.carfactory.domain.partsofcar.Engine;

public class BuildCarAndSupplyToStorage {
    SparePartsConsigneeFromStorage<Engine> engineConsignee;
    SparePartsConsigneeFromStorage<CarBody> carBodyConsignee;
    SparePartsConsigneeFromStorage<Accessory> accessoryConsignee;
    CarSupplierToStorage carSupplier;

    public BuildCarAndSupplyToStorage(SparePartsConsigneeFromStorage<Engine> engineConsignee,
                                      SparePartsConsigneeFromStorage<CarBody> carBodyConsignee,
                                      SparePartsConsigneeFromStorage<Accessory> accessoryConsignee,
                                      CarSupplierToStorage carSupplier) {
        this.engineConsignee = engineConsignee;
        this.carBodyConsignee = carBodyConsignee;
        this.accessoryConsignee = accessoryConsignee;
        this.carSupplier = carSupplier;
    }

    public void work(){
        Engine engine = engineConsignee.consign();
        CarBody body = carBodyConsignee.consign();
        Accessory accessory = accessoryConsignee.consign();

        Car car = Car.buildFromSpareParts(engine, body, accessory);

        carSupplier.supplyCar(car);
    }
}
