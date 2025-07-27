package com.ecommerce.ecomerce_app.dto;
import jakarta.validation.constraints.*;
public class UpdateProfileRequest {

    @Email @NotBlank
    private String email;
    private String name;
    private String password;
    private String phone;
    private String address;
    private String answer;
}
