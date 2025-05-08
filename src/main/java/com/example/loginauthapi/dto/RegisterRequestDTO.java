package com.example.loginauthapi.dto;

public record RegisterRequestDTO(String name, String email, String password, boolean isAdmin) {
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public CharSequence getPassword() {
        return password;
    }
}