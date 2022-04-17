package ru.nsu.fit.carfactory.application.worker;

import ru.nsu.fit.carfactory.domain.Car;

public interface CarStorageSupplier {
    void supplyCar(Car car);
}
