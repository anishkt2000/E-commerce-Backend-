package com.ecommerce.ecomerce_app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class ForgotPasswordRequest {

    @Email @NotBlank
    private String email;
    @NotBlank
    private String answer;
    @NotBlank
    private String newPassword;
}
