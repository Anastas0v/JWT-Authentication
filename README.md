# Spring Boot JWT Authentication with Role-Based Authorization

This project implements token-based authentication and role-based authorization using Spring Boot 3, Spring Security, JWT (JSON Web Token), and a MySQL database.

## Overview

The application provides a secure REST API with:

- **Login API** to authenticate users
- **JWT generation** upon successful authentication
- **Authorization** based on user roles
- **MySQL database** for user and role persistence

Subsequent API requests are secured by requiring a valid JWT token in the `Authorization` header.

## Technology Stack

- **Spring Boot**: Simplifies development of stand-alone, production-ready Spring applications.
- **Spring Security**: Handles authentication, authorization, and protection against common vulnerabilities.
- **JWT (JSON Web Token)**: A compact, secure token format for transmitting authentication and identity information.
- **MySQL**: A reliable relational database used to store user and role data.

Together, these technologies create a robust foundation for developing secure, scalable, and maintainable backend services.
