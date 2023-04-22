package de.neuhaus.quizbackend.rest.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class UserModel {
    private BigInteger id;
    private String name;
    private String password;
}
