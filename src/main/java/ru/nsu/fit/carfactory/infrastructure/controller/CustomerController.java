package ru.nsu.fit.carfactory.infrastructure.controller;

import ru.nsu.fit.carfactory.application.port.CarSupplierToCustomer;
import ru.nsu.fit.carfactory.domain.Car;

public class CustomerController implements CarSupplierToCustomer {
    @Override
    public void supply(Car car) {

    }
}
