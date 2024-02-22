package org.example.car.model;

import org.springframework.stereotype.Component;

@Component
public class MercedesDriver implements Driver {

    private String name;
    private String phone;


    public MercedesDriver() {
    }

    public MercedesDriver(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String drive() {
        return this.name + " drive Mercedes car";
    }
}
