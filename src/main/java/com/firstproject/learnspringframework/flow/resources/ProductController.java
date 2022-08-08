package com.firstproject.learnspringframework.flow.resources;

import com.firstproject.learnspringframework.flow.services.Product;
import com.firstproject.learnspringframework.flow.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    //Reference to Business Logic class
    @Autowired
    private ProductService productService;

    @GetMapping("/test123")
    public List<Product> getAll(){
        //Reference to business logic layer
        System.out.println("bing");
        return productService.getAll();
    }

    @GetMapping("/test")
    public String GetName(){
        return productService.getFirstProductName();
    }
}
