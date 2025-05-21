package com.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @GetMapping("/me")
    public ResponseEntity<String> getCurrentUser(Authentication authentication)
    {
        return ResponseEntity.ok("Hello, " + authentication.getName());
    }
}