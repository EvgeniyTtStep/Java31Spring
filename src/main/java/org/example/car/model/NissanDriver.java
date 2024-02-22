package org.example.car.model;

import org.springframework.stereotype.Component;

@Component
public class NissanDriver implements Driver{
    private String name;
    private String phone;


    public NissanDriver() {
    }

    public NissanDriver(String name, String phone) {
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
        return this.name + " drive Nissan car";
    }
}
