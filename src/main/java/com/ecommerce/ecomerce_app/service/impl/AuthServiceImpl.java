package com.ecommerce.ecomerce_app.service.impl;
import com.ecommerce.ecomerce_app.dto.ForgotPasswordRequest;
import com.ecommerce.ecomerce_app.dto.LoginRequest;
import com.ecommerce.ecomerce_app.dto.RegisterRequest;
import com.ecommerce.ecomerce_app.dto.UpdateProfileRequest;
import com.ecommerce.ecomerce_app.model.User;
import com.ecommerce.ecomerce_app.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public User register(RegisterRequest registerRequest) {
        return null;
    }

    @Override
    public void forgotPassword(ForgotPasswordRequest forgotPasswordRequest) {
        return;
    }

    @Override
    public User updateProfile(UpdateProfileRequest updateProfileRequest) {
        return null;
    }
}
