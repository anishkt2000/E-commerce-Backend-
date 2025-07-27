package com.ecommerce.ecomerce_app.service;

import com.ecommerce.ecomerce_app.dto.ForgotPasswordRequest;
import com.ecommerce.ecomerce_app.dto.LoginRequest;
import com.ecommerce.ecomerce_app.dto.RegisterRequest;
import com.ecommerce.ecomerce_app.dto.UpdateProfileRequest;
import com.ecommerce.ecomerce_app.model.User;

public interface AuthService {
    String  login(LoginRequest loginRequest);
    User register(RegisterRequest registerRequest);
    void forgotPassword(ForgotPasswordRequest forgotPasswordRequest);
    User updateProfile(UpdateProfileRequest updateProfileRequest);
}
