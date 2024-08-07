package com.example.ecommerce_api.service;

import com.example.ecommerce_api.model.Product;
import com.example.ecommerce_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductService
{
    //Spring boot architecture main feature.
    @Autowired
    private ProductRepository productRepository;

//This method retrieves all products from the database.
    public List<Product> getAllProducts()

    {
        return productRepository.findAll();
    }

    //This method retrieves a product by its unique identifier (id) from the database.
    public Product getProductById(Long id)
    {
        return productRepository.findById(id).orElse(null);
    }
}