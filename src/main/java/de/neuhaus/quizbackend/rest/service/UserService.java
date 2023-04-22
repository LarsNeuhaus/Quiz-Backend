package de.neuhaus.quizbackend.rest.service;

import de.neuhaus.quizbackend.rest.dto.UserCreationDTO;
import de.neuhaus.quizbackend.rest.model.UserModel;

import java.math.BigInteger;

public interface UserService {
    UserModel getUser(BigInteger userId);

    UserModel createUser(UserCreationDTO userCreationDTO);

    boolean deleteUser(BigInteger userId);

    UserModel editUser(BigInteger userId, UserCreationDTO userCreationDTO);
}
