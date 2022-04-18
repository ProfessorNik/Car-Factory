package ru.nsu.fit.carfactory.application.usecase;

import ru.nsu.fit.carfactory.application.port.CarConsigneeFromStorage;
import ru.nsu.fit.carfactory.application.port.CarSupplierToCustomer;
import ru.nsu.fit.carfactory.domain.Car;

public class DealCar {
    CarConsigneeFromStorage carConsignee;
    CarSupplierToCustomer carSupplier;
    void deal(){
        Car car = carConsignee.getCar();
        //TODO log (<Time>: Dealer <Number>: Auto <ID> (Body: <ID>, Motor: <ID>, Accessory: <ID>)
        carSupplier.supply(car);
    }
}
