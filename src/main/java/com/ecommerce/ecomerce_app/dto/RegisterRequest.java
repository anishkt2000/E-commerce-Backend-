package com.ecommerce.ecomerce_app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class RegisterRequest {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    @NotBlank
    private String phone;
    @NotBlank
    private String address;
    @NotBlank
    private String answer;
}
