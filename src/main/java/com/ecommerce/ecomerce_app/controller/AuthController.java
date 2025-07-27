package com.ecommerce.ecomerce_app.controller;

import com.ecommerce.ecomerce_app.dto.ForgotPasswordRequest;
import com.ecommerce.ecomerce_app.dto.LoginRequest;
import com.ecommerce.ecomerce_app.dto.RegisterRequest;
import com.ecommerce.ecomerce_app.dto.UpdateProfileRequest;
import com.ecommerce.ecomerce_app.model.User;
import com.ecommerce.ecomerce_app.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    AuthController(AuthService authService){
        this.authService=authService;
    }


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest dto){
        User user =this.authService.register(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest user){
        String token =this.authService.login(user);
        return  ResponseEntity.ok(Map.of("token",token));
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<?> changePassword(@RequestBody ForgotPasswordRequest user){
        this.authService.forgotPassword(user);
        return ResponseEntity.ok("Password reset successfully");
    }
    @PostMapping("/profile")
    public ResponseEntity<?> updateProfileController(@RequestBody UpdateProfileRequest user){
        User updateduser =this.authService.updateProfile(user);
        return ResponseEntity.ok(updateduser);
    }

}
