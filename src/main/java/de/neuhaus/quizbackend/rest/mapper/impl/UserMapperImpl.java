package de.neuhaus.quizbackend.rest.mapper.impl;

import de.neuhaus.quizbackend.data.entity.User;
import de.neuhaus.quizbackend.rest.dto.UserCreationDTO;
import de.neuhaus.quizbackend.rest.mapper.UserMapper;
import de.neuhaus.quizbackend.rest.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class UserMapperImpl implements UserMapper {
    @Override
    public UserModel mapEntityToModel(User user) {
        UserModel userModel = new UserModel();
        userModel.setId(BigInteger.valueOf(user.getId()));
        userModel.setName(user.getName());
        userModel.setPassword(user.getPassword());
        return userModel;
    }

    @Override
    public User updateEntity(User userEntity, UserCreationDTO userCreationDTO) {
        userEntity.setName(userCreationDTO.getName());
        userEntity.setPassword(userCreationDTO.getPassword());
        return userEntity;
    }
}
