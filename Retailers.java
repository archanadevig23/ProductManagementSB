package com.project.ProductManagement.models;

import java.util.ArrayList;

public class Retailers {

    int id;
    String name;

    public Retailers(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Products> r_products = new ArrayList<>();

}
