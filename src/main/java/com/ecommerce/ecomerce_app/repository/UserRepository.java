package com.ecommerce.ecomerce_app.repository;

import com.ecommerce.ecomerce_app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User,String> {
    User findByEmail(String email);
    User findByEmailAndAddress(String email,String answer);

}
