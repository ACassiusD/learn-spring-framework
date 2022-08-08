package com.firstproject.learnspringframework.flow.dataaccess;

import javax.persistence.Entity;
import javax.persistence.Id;

//Model
//Part of the data access layer
//Entity classes just have references to the columns in the database
@Entity
public class ProductEntity {

    //Table column representation
    @Id
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
