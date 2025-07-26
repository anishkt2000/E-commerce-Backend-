package com.ecommerce.ecomerce_app.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckHealth {

    @GetMapping("/hello")
    public String sayHello() {
        return "✅ Backend is working fine!";
    }

}
