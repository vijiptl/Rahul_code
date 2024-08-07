package com.example.ecommerce_api.controller;

import com.example.ecommerce_api.model.PurchaseOrder;
import com.example.ecommerce_api.model.User;
import com.example.ecommerce_api.service.ProductService;
import com.example.ecommerce_api.service.PurchaseOrderService;
import com.example.ecommerce_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user)
    {
        userService.registerUser(user.getUsername(), user.getPassword());
        return ResponseEntity.ok("User registered successfully.");
    }
}
