package com.example.demo.filter;

import org.springframework.security.authentication.AuthenticationManager;

import javax.servlet.Filter;

public class JWTLoginFilter implements Filter {
    public JWTLoginFilter(String s, AuthenticationManager authenticationManager) {
    }
}
