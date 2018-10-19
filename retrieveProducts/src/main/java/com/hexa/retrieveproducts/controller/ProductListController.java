package com.hexa.retrieveproducts.controller;

import com.hexa.retrieveproducts.model.Products;
import com.hexa.retrieveproducts.repository.ProductsRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/products")
@Api(value = "FlipKart",description = "To List all the Products available in Flipkart.") 
public class ProductListController {
  
  @Autowired
  private ProductsRepository productsRepository;

  @ApiOperation(value = "View a list of available products", response = Iterable.class)
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "Successfully retrieved list"),
          @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
          @ApiResponse(code = 403, message = "Forbidden resource"),
          @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
      }
  )  
  @RequestMapping(value = "/",method = RequestMethod.GET)
  public List<Products> getAllProducts() {
    
    return productsRepository.findAll();
  }
  /**
   * This method is to get the product details.
   * @param id
   * @return
   */  
  @ApiOperation(value = "To Get the details of a product")  
  @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
  public Products getProductDetails(@PathVariable("productId") ObjectId id) {
    
    String productId = id.toString();
    return productsRepository.findBy_id(productId);
  }
}
