package com.example.user.core.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Account {
    private String username;
    private String password;
    private List<Role> roles;

    public Account(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
