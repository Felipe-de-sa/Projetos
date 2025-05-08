package com.example.loginauthapi.dto;

public record LoginRequestDTO(String email, String password) {
    public CharSequence getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
