package com.example.ecommerce_api.service;

import com.example.ecommerce_api.model.User;
import com.example.ecommerce_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    //This field is a reference to the UserRepository, which is used to perform CRUD operations on the User entity.
    // It is injected by Spring using the @Autowired annotation.
    private UserRepository userRepository;

    //This field is a reference to the PasswordEncoder, which is used to encode passwords.
  //  @Autowired
   private PasswordEncoder passwordEncoder;

    //This method handles the registration of a new user.

    public User register(User user){

        //Password Encoding: The user's password is encoded using the PasswordEncoder.
        //Saving User: The encoded password is set back to the user object, and then the user object is saved to the database using the UserRepository
        /*user.setPassword(passwordEncoder.encode(user.getPassword()));*/

        return userRepository.save(user);
    }

    //This method retrieves a user by their username.
    public User findByUsername(String username){
       return userRepository.findByUsername(username).orElse(null);
    }

    public User registerUser(String username, String password) {
        // Check if username already exists
        if (userRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("Username already exists");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password)); // Use password hashing
        return userRepository.save(user);

}}
