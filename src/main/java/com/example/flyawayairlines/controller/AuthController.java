package com.example.flyawayairlines.controller;

import com.example.flyawayairlines.model.User;
import com.example.flyawayairlines.security.JwtTokenProvider;
import com.example.flyawayairlines.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/login")
    public String authenticateUser(@RequestBody User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return jwtTokenProvider.generateToken(user.getUsername());
        }
        return "Invalid username or password";
    }
}
