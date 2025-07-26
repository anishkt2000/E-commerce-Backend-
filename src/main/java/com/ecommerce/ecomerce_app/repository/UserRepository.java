package com.ecommerce.ecomerce_app.repository;

import com.ecommerce.ecomerce_app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User,String> {
}
