package com.example.flyawayairlines.controller;

import com.example.flyawayairlines.dto.LoginRequest;
import com.example.flyawayairlines.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public String authenticateUser(@RequestBody LoginRequest loginRequest) {
        return jwtTokenProvider.generateToken(loginRequest.getUsername());
    }
}
