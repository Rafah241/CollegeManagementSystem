package com.cms.cms.controller;

import com.cms.cms.entity.User;
import com.cms.cms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody User loginUser) {

        Optional<User> userOptional = userRepository.findByEmail(loginUser.getEmail());

        if (userOptional.isEmpty()) {
            return "User not found";
        }

        User user = userOptional.get();

        if (passwordEncoder.matches(loginUser.getPassword(), user.getPassword())) {
            return "Login Successful";
        } else {
            return "Invalid Password";
        }
    }
}