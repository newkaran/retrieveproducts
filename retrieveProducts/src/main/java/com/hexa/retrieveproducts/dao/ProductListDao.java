package com.hexa.retrieveproducts.dao;

import com.hexa.retrieveproducts.model.Products;
import com.hexa.retrieveproducts.repository.ProductsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * This is a DAO Class which will retrieve the data from Mongo DB.
 * @author Prabhakaran V
 *
 */
@Component
public class ProductListDao {

  @Autowired
  private ProductsRepository productsRepository;
  
  /**
   * To fetch a specific Product data from MongoDB.
   */
  public Products findBy_id(String productId) throws Exception {
    return productsRepository.findBy_id(productId);
  }
  
  /**
   * To fetch all the product List data from MongoDB.
   */
  public List<Products> findAll() throws Exception  {
    return productsRepository.findAll();
  }
}
