package org.example.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ============= var1 ===============
//        Car mercedes = new MercedesCar(1, "mercedes-bans", "sl300", "black",
//                new ArrayList<>(List.of("climat-control", "front-camera", "skin-saloon")));
//
//        Car nissan = new NissanCar(1, "japan", "Nissan gtr", 1500);
//
//        CarFabric fabricMers = new CarFabric();
//        fabricMers.setCar(nissan);
//
//        System.out.println(fabricMers.getCar().carInfo());

// ============= var2 ===============

//        CarMenuInit.carInit(); // mercedes
//        CarFabric fabric = CarMenuInit.carFabricInit();
//        System.out.println(fabric.getCar().carInfo());


// ============= var3 Spring ===============

        ApplicationContext context = new ClassPathXmlApplicationContext("car-context.xml");
        CarFabric carFabric = context.getBean("carFabric", CarFabric.class);
        System.out.println(carFabric.getCar().carInfo());
    }
}
