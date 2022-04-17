package ru.nsu.fit.carfactory.application.worker;

import ru.nsu.fit.carfactory.domain.Car;
import ru.nsu.fit.carfactory.domain.partsofcar.Accessory;
import ru.nsu.fit.carfactory.domain.partsofcar.CarBody;
import ru.nsu.fit.carfactory.domain.partsofcar.Engine;

public class Worker {
    EngineConsigneeFromStorage engineConsignee;
    CarBodyConsigneeFromStorage carBodyConsignee;
    AccessoryConsigneeFromStorage accessoryConsignee;
    CarStorageSupplier carSupplier;

    public Worker(EngineConsigneeFromStorage engineConsignee,
                  CarBodyConsigneeFromStorage carBodyConsignee,
                  AccessoryConsigneeFromStorage accessoryConsignee,
                  CarStorageSupplier carSupplier) {
        this.engineConsignee = engineConsignee;
        this.carBodyConsignee = carBodyConsignee;
        this.accessoryConsignee = accessoryConsignee;
        this.carSupplier = carSupplier;
    }

    public void work(){
        Engine engine = engineConsignee.getEngine();
        CarBody body = carBodyConsignee.getCarBody();
        Accessory accessory = accessoryConsignee.getAccessory();

        Car car = Car.buildFromSpareParts(engine, body, accessory);

        carSupplier.supplyCar(car);
    }
}
