package de.neuhaus.quizbackend.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {

    }
}
