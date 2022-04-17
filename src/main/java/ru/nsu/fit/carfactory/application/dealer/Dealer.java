package ru.nsu.fit.carfactory.application.dealer;

import ru.nsu.fit.carfactory.domain.Car;

public class Dealer {
    CarConsigneeFromStorage carConsignee;
    CarCustomerSupplier carSupplier;
    void deal(){
        Car car = carConsignee.getCar();
        //TODO log (<Time>: Dealer <Number>: Auto <ID> (Body: <ID>, Motor: <ID>, Accessory: <ID>)
        carSupplier.supply(car);
    }
}
