package com.firstproject.learnspringframework.flow.mapper;

import com.firstproject.learnspringframework.flow.dataaccess.ProductEntity;
import com.firstproject.learnspringframework.flow.services.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {

    public ProductEntity toEntity(Product product){
        ProductEntity entity = new ProductEntity();
        entity.setId(product.getId());
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        return entity;
    }

    public Product toModel(ProductEntity productEntity){
        Product model = new Product();
        model.setId(productEntity.getId());
        model.setName(productEntity.getName());
        model.setPrice(productEntity.getPrice());
        return model;
    }

    public List<ProductEntity> toEntities(Iterable<Product> productList){
        List<ProductEntity> productEntitiesList = new ArrayList<ProductEntity>();

        productList.forEach(product -> {
            ProductEntity entity = new ProductEntity();
            entity.setId(product.getId());
            entity.setName(product.getName());
            entity.setPrice(product.getPrice());
            productEntitiesList.add(entity);
        });
        return productEntitiesList;
    }

    public List<Product> toModels(Iterable<ProductEntity> productEntities){
        List<Product> productList = new ArrayList<Product>();

        productEntities.forEach(productEntity -> {
            Product model = new Product();
            model.setId(productEntity.getId());
            model.setName(productEntity.getName());
            model.setPrice(productEntity.getPrice());
            productList.add(model);
        });
        return productList;
    }

}
