package com.back.tienda.Security;


public class AuthResponse {
    private String usuario;

    private String accessToken;

    public AuthResponse() {
    }

    public AuthResponse(String usuario, String accessToken) {
        this.usuario = usuario;
        this.accessToken = accessToken;


    }

    public String getEmail() {
        return usuario;
    }

    public void setEmail(String email) {
        this.usuario = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}