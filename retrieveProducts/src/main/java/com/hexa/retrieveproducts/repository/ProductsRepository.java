package com.hexa.retrieveproducts.repository;

import com.hexa.retrieveproducts.model.Products;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductsRepository extends MongoRepository<Products, String> {

  Products findBy_id(String _id);
  
  List<Products> findAll();
}
