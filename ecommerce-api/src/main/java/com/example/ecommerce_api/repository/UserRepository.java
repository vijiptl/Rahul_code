package com.example.ecommerce_api.repository;

import com.example.ecommerce_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{



    //JpaRepository<User, Long> is a parameterized interface.
    // The first parameter (User) is the type of the entity, and the second parameter (Long) is the type of the entity's primary key.

    //By extending JpaRepository, the UserRepository inherits several methods for performing CRUD operations,
    // such as save(), findById(), findAll(), deleteById(), etc.
    Optional<User> findByUsername (String username); //The method Optional<User> findByUsername(String username) is a custom query method.
    // Spring Data JPA parses the method name and creates a query to find a User entity by its username field.
    // It returns an Optional<User> to handle cases where no user is found.

}

