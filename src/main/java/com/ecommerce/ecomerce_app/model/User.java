package com.ecommerce.ecomerce_app.model;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String email;
    private String name;
    private String password;
    private String phone;
    private String address;
    private String answer;
    @Builder.Default
    private Number role =0;
}
