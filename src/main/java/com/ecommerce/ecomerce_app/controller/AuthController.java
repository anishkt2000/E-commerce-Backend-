package com.ecommerce.ecomerce_app.controller;

import com.ecommerce.ecomerce_app.model.User;
import com.ecommerce.ecomerce_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public void login(@RequestBody User loginRequest){
//        User user = userRepository.findByUserName(loginRequest.getUserName());

    }
}
