package com.example.loginauthapi.dto;

public class ResponseDTO {
    private String name;
    private String token;

    public ResponseDTO(String name, String token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }
}
