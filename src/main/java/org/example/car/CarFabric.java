package org.example.car;

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
