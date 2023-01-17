package com.project.ProductManagement.controller;

import com.project.ProductManagement.services.ProductsOp;
import com.project.ProductManagement.services.RetailersOp;
import com.project.ProductManagement.services.WholesalersOp;
import com.project.ProductManagement.services.getData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/allocate-to")
public class allocateDetailsController {

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

    @PutMapping("/wholesaler")
    public String productDisplay(@RequestParam int w_id, @RequestParam int p_id, @RequestParam int stock) {
        return wd.allocateToWholesaler(w_id, p_id, stock);
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
