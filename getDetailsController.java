package com.project.ProductManagement.controller;

import com.project.ProductManagement.services.ProductsOp;
import com.project.ProductManagement.services.RetailersOp;
import com.project.ProductManagement.services.WholesalersOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.ProductManagement.models.Products;
import com.project.ProductManagement.models.Retailers;
import com.project.ProductManagement.models.Wholesalers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.ProductManagement.services.getData;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

@RestController
@RequestMapping("/view")

public class getDetailsController {

    @Autowired
    getData gd;

    @Autowired
    ProductsOp pd;

    @Autowired
    RetailersOp rd;

    @Autowired
    WholesalersOp wd;

    @GetMapping("/load")
    public String obtainData() {
        gd.obtainData();
        return "Data obtained";
    }

    @GetMapping("/products/{id}")
    public String productDisplay(@PathVariable int id) {
        return pd.getDetails(id);
    }

    @GetMapping("/wholesalers/{id}")
    public String wholesalerDisplay(@PathVariable int id) {
        return wd.getDetails(id);
    }

    @GetMapping("/retailers/{id}")
    public String retailerDisplay(@PathVariable int id) {
        return rd.getDetails(id);
    }



}
