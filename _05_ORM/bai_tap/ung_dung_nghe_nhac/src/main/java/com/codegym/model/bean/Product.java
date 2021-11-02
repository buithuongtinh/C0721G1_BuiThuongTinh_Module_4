package com.codegym.model.bean;

import javax.persistence.*;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private double cost;
    private String description;
    private String producer;

    public Product() {
    }

    public Product(String name, double cost, String description, String producer) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
