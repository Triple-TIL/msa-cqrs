package com.example.user.core.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private String firstname;
    private String lastname;
    private String emailAddress;
    private Account account;

    public User(String id, String firstname, String lastname, String emailAddress, Account account) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
        this.account = account;
    }
}
