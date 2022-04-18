package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.CarConsigneeFromStorage;
import ru.nsu.fit.carfactory.application.port.CarSupplierToStorage;
import ru.nsu.fit.carfactory.domain.Car;
import ru.nsu.fit.carfactory.infrastructure.port.CarStorage;

public class CarStorageController implements CarSupplierToStorage, CarConsigneeFromStorage {
    private final CarStorage<Car> storage;

    public CarStorageController(CarStorage<Car> storage) {
        this.storage = storage;
    }

    @Override
    public void supplyCar(Car car) {
        storage.store(car);
    }

    @Override
    public Car getCar() {
        return storage.consign();
    }
}
