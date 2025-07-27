package com.ecommerce.ecomerce_app.repository;

import com.ecommerce.ecomerce_app.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
