package de.neuhaus.quizbackend.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class UserModel {
    private BigInteger id;
    private String name;
    private String password;
}
