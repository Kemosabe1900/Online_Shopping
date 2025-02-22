package com.example.CLproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderUtil {

    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public PasswordEncoderUtil(BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public String encodePassword(String plainPassword) {
        return passwordEncoder.encode(plainPassword);
    }
}