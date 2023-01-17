package com.project.ProductManagement.models;

import java.util.ArrayList;

public class Wholesalers {

    int id;

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

    String name;
    public ArrayList<Products> w_products = new ArrayList<>();

    public Wholesalers(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

}
