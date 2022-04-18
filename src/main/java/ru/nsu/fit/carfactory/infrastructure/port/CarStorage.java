package ru.nsu.fit.carfactory.infrastructure.port;

import ru.nsu.fit.carfactory.domain.Car;

public interface CarStorage<Car> {
    void store(Car car);
    Car consign();
}
