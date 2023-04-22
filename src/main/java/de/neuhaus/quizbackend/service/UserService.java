package de.neuhaus.quizbackend.service;

import de.neuhaus.quizbackend.dto.UserCreationDTO;
import de.neuhaus.quizbackend.model.UserModel;

import java.math.BigInteger;

public interface UserService {
    UserModel getUser(BigInteger userId);

    UserModel createUser(UserCreationDTO userCreationDTO);

    boolean deleteUser(BigInteger userId);

    UserModel editUser(BigInteger userId, UserCreationDTO userCreationDTO);
}
