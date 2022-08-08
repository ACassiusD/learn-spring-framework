package com.firstproject.learnspringframework.flow.dataaccess;

import org.springframework.data.repository.CrudRepository;

//Why does it get Declared as an interface if we never use it to extend anything.
//Extends CrudRepository.
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {
}
