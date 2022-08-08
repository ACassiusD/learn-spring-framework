package com.firstproject.learnspringframework.flow.services;

import javax.persistence.Id;

//Product class has more functionality and used by service class.
public class Product {
    //Table column representation
    private Integer id;
    private String name;
    private float price;


    //GETTERS
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
