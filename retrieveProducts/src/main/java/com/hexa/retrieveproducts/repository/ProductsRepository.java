package com.hexa.retrieveproducts.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hexa.retrieveproducts.model.Products;


/**
 * This is the Repository which interacts with MongoRepository and getch the data.
 * @author Prabhakaran V
 *
 */
public interface ProductsRepository extends MongoRepository<Products, String> {

  /**
   * To fetch a specific Product data from  MongoDB.
   */
  Products findBy_id(String id);
  
  /**
   * To fetch all the product List data from  MongoDB.
   */
  List<Products> findAll();
}
