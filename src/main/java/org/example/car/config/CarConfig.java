package org.example.car.config;

import org.example.car.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.example.car")
public class CarConfig {

    @Bean
    public Car mercedesCar() {
        MercedesCar mercedesCar = new MercedesCar();
        mercedesCar.setIdCar(1);
        mercedesCar.setVendor("Mercedes");
        mercedesCar.setModel("Sl120");
        mercedesCar.setColor("red");
        mercedesCar.setComplectation(new ArrayList<>(List.of("com1", "com2", "com3")));
        return mercedesCar;
    }

    @Bean
    public Car nissanCar() {
        return new NissanCar(1, "Ukrain", "Leaf", 2000);
    }


    @Bean
    public Driver mercedesDriver() { // id = mercedesDriver
        return new MercedesDriver("Jack", "777");
    }

    @Bean
    public Driver nissanDriver() { // id = nissanDriver
        return new NissanDriver("Max", "555");
    }


//    @Bean
//    public CarFabric carFabric() {
//        return new CarFabric(nissanCar());
//    }


}
