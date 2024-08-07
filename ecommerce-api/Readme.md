# E-Commerce API

This is a Spring Boot-based e-commerce API that provides endpoints for user authentication, product listing, and checkout processes. It leverages MySQL for database management, JWT for authentication, and Mockito for unit testing.

## Table of Contents

- [Problem Statement](#problem-statement)
- [Solution](#solution)
- [Use Case](#use-case)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [API Endpoints](#api-endpoints)
    - [Authentication](#authentication)
    - [Products](#products)
    - [Orders](#orders)

## Problem Statement

Develop E-commerce API

Design : Develop a Restful API for an e-commerce platform that allows users to browse and purchase products. Implement endpoints for user authentication, product listing and checkout.
Instructions- Use java with Spring boot to create the backend logic for the API. Ensure proper validation and error handling for each end point.
Examples with related information - For user authentication, we can include methods for user login and registration, securely storing passwords using hasing algorithms.
For product listing , fetch product details from a database and paginate the results for better user experience.
Tools - Use Spring boot, mysql for database management, JWT for authentication.

## Solution

This API uses Spring Boot to manage dependencies and create a robust backend system. The system includes user authentication via JWT tokens, CRUD operations for products, and a checkout process to handle orders.

## Use Case

The e-commerce API allows users to:

- **Register and authenticate**: Users can register and log in to access protected endpoints.
- **Browse products**: Users can view all available products.
- **Purchase products**: Authenticated users can place orders and checkout.

## Features

- User registration and authentication
- Product listing and details
- Secure checkout process
- Role-based access control
- JWT-based authentication // WIP
- Unit and integration tests //WIP

## Technologies Used

- **Java**: Programming language
- **Spring Boot**: Framework for building the application
- **MySQL**: Database management system
- **JWT**: Authentication mechanism //WIP
- **Mockito**: Unit testing framework //WIP




