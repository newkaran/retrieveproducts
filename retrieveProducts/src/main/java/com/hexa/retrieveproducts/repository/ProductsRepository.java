package com.hexa.retrieveproducts.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.hexa.retrieveproducts.model.Products; 

public interface ProductsRepository extends MongoRepository<Products, String>{

	Products findBy_id(String _id);
	List<Products> findAll();
}
