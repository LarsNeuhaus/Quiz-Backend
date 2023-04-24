package de.neuhaus.quizbackend.rest.mapper;

import de.neuhaus.quizbackend.data.entity.User;
import de.neuhaus.quizbackend.rest.dto.UserCreationDTO;
import de.neuhaus.quizbackend.rest.model.UserModel;

public interface UserMapper {
    UserModel mapEntityToModel(User user);

    User updateEntity(User userEntity, UserCreationDTO userCreationDTO);
}
