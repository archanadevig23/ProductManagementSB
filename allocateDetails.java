package com.project.ProductManagement.models;

import com.project.ProductManagement.services.ProductsOp;
import com.project.ProductManagement.services.RetailersOp;
import com.project.ProductManagement.services.WholesalersOp;
import com.project.ProductManagement.services.getData;
import org.springframework.beans.factory.annotation.Autowired;

public interface allocateDetails {

    public String allocateToWholesaler(int w_id, int p_id, int stock);

}
