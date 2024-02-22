package org.example.car.fabric;

import org.example.car.model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarFabric {

    private Car car; //Dependency injection

    public CarFabric() {
    }

    public CarFabric(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
