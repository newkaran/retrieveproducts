package com.hexa.retrieveproducts.service;

import com.hexa.retrieveproducts.dao.ProductListDao;
import com.hexa.retrieveproducts.model.Products;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This is a Service Class which will retrieve the data from DAO Layer.
 * @author Prabhakaran V
 *
 */
@Component
public class ProductListService {

  @Autowired
  private ProductListDao productListDao;
  
  /**
   * To fetch a specific Product data from DAO Layer.
   */
  public Products findBy_id(String productId) throws Exception  {
    return productListDao.findBy_id(productId);
  }
  
  /**
   * To fetch all the product List data from DAO Layer.
   */
  public List<Products> findAll() throws Exception  {
    return productListDao.findAll();
  }
}
