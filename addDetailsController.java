package com.project.ProductManagement.controller;

import com.project.ProductManagement.ProductManagementApplication;
import com.project.ProductManagement.models.Products;
import com.project.ProductManagement.models.Retailers;
import com.project.ProductManagement.models.Wholesalers;
import com.project.ProductManagement.services.ProductsOp;
import com.project.ProductManagement.services.RetailersOp;
import com.project.ProductManagement.services.WholesalersOp;
import com.project.ProductManagement.services.getData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/add")
public class addDetailsController {

    @Autowired
    getData gd;

    @Autowired
    ProductsOp pd;

    @Autowired
    RetailersOp rd;

    @Autowired
    WholesalersOp wd;

    @PostMapping("/product")
    public String addDetails(@RequestBody Products p) {
        System.out.println(p.getId());
        String res = pd.addDetails(p);
        return res;
    }

    @PostMapping("/wholesaler")
    public String addDetails(@RequestBody Wholesalers w) {
//        wd.addDetails(w);
        return "Added succesfully";
    }

    @PostMapping("/retailer")
    public String addDetails(@RequestBody Retailers r) {
//        rd.addDetails(r);
        return "Added succesfully";
    }
}
