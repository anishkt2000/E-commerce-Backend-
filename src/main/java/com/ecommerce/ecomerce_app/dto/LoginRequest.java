package com.ecommerce.ecomerce_app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @Email @NotBlank
    private String email;
    @NotBlank
    private String password;
}
