package com.firstproject.learnspringframework.flow.services;

import com.firstproject.learnspringframework.flow.dataaccess.ProductRepository;
import com.firstproject.learnspringframework.flow.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Business Layer.
@Component
public class ProductService {

    //Reference to Data Access layer
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getAll(){
        return productMapper.toModels(productRepository.findAll());
    }

    //Do business logic.
    public String getFirstProductName(){
        return productRepository.findById(1).get().getName();
    }

    public String getSecondProductName(){
        return productRepository.findById(2).get().getName();
    }
}
