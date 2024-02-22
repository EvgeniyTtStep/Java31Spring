package org.example.car.service;

import org.example.car.model.Car;
import org.example.car.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarService {

    @Autowired //    @Autowired - is dependency injection (DI)
    @Qualifier("nissanCar")
    Car nissanCar; //NissanCar.java


    private final Driver driver;

    @Autowired
    public CarService(@Qualifier("mercedesDriver") Driver driver) {
        this.driver = driver;
    }


    public void showCar() {
        System.out.println("Show: " + nissanCar.carInfo());
        System.out.println(driver.drive());
    }

}
