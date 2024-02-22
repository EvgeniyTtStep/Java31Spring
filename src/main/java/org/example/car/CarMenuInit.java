package org.example.car;

import org.example.car.fabric.CarFabric;
import org.example.car.model.Car;
import org.example.car.model.MercedesCar;
import org.example.car.model.NissanCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMenuInit {

    static Car car;

    static CarFabric carFabric;

    static public Car carInit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice your car:");
        String carName = scanner.nextLine();
        switch (carName.toLowerCase()) {
            case "mercedes" -> car = new MercedesCar(1, "mercedes-bans", "sl300", "black",
                    new ArrayList<>(List.of("climat-control", "front-camera", "skin-saloon")));
            case "nissan" -> car = new NissanCar(1, "japan", "Nissan gtr", 1500);
        }
        return car;
    }

    static public CarFabric carFabricInit() {
        carFabric = new CarFabric();
        carFabric.setCar(car);
        return carFabric;
    }


}
