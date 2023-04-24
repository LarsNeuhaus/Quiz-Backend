package de.neuhaus.quizbackend.rest.service.impl;

import de.neuhaus.quizbackend.data.entity.User;
import de.neuhaus.quizbackend.data.repository.UserRepository;
import de.neuhaus.quizbackend.rest.dto.UserCreationDTO;
import de.neuhaus.quizbackend.rest.mapper.UserMapper;
import de.neuhaus.quizbackend.rest.model.UserModel;
import de.neuhaus.quizbackend.rest.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserModel getUser(BigInteger userId) {
        User user = userRepository.findById(userId);
        UserModel userModel = userMapper.mapEntityToModel(user);
        return userModel;
    }

    @Override
    public UserModel createUser(UserCreationDTO userCreationDTO) {
        User user = new User(userCreationDTO.getName(), userCreationDTO.getPassword());
        user = userRepository.save(user);
        UserModel userModel = userMapper.mapEntityToModel(user);
        return userModel;
    }

    @Override
    public boolean deleteUser(Long userId) {
        try {
            userRepository.deleteById(userId);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public UserModel editUser(BigInteger userId, UserCreationDTO userCreationDTO) {
        User userEntity = userRepository.findById(userId);
        userEntity = userMapper.updateEntity(userEntity, userCreationDTO);
        userRepository.save(userEntity);
        UserModel userModel = userMapper.mapEntityToModel(userEntity);
        return userModel;
    }
}
