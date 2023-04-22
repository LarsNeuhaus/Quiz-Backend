package de.neuhaus.quizbackend.dto;

import lombok.Data;

@Data
public class UserCreationDTO {
    private String name;
    private String password;
}
