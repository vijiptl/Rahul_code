package com.example.ecommerce_api.controller;

import com.example.ecommerce_api.model.Product;
import com.example.ecommerce_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController
{
    //concept of autowiring a/c to architecture and field DI.
    @Autowired
    private ProductService productService;
 @GetMapping
    public ResponseEntity<List<Product>>getAllProducts()
 {
     // This method returns a ResponseEntity containing a list of Product objects.
     // ResponseEntity represents the entire HTTP response including status code, headers, and body.
     List<Product> products = productService.getAllProducts();
     return ResponseEntity.ok().body(products);
 }

 //This method retrieves a single product by its ID and returns it wrapped in a ResponseEntity.
// This annotation maps GET requests with a path variable id to this method
// It means this method will handle requests like /api/products/{id} where {id} is a placeholder for the product ID.
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id)
    {
        Product product = productService.getProductById(id);
        // This returns an HTTP 200 OK status code with the product object in the response body.
        return ResponseEntity.ok().body(product);
    }


    }

