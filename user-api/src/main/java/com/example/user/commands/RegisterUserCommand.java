package com.example.user.commands;

import com.example.user.core.models.User;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
public class RegisterUserCommand {

    @TargetAggregateIdentifier
    private String id;
    private User user;

}
