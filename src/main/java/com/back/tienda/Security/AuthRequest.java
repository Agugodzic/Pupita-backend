package com.back.tienda.Security;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class AuthRequest {
    @Length(min=5, max=50)
    private String user;

    @Length(min=5)
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
