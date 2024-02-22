package org.example.car.model;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NissanCar implements Car {

    private Integer idNissan;

    private String country;

    private String name;

    private Integer weight;

    Map<String, Integer> map;


    public NissanCar() {
    }

    public NissanCar(Integer idNissan, String country, String name, Integer weight) {
        this.idNissan = idNissan;
        this.country = country;
        this.name = name;
        this.weight = weight;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Integer getIdNissan() {
        return idNissan;
    }

    public void setIdNissan(Integer idNissan) {
        this.idNissan = idNissan;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String carInfo() {
        return this.country + " " + this.name + " " + this.weight;
    }
}
