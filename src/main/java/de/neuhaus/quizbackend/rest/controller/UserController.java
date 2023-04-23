package de.neuhaus.quizbackend.rest.controller;

import de.neuhaus.quizbackend.rest.dto.UserCreationDTO;
import de.neuhaus.quizbackend.rest.model.UserModel;
import de.neuhaus.quizbackend.rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/user/{userId}")
    public ResponseEntity<UserModel> getUser(@PathVariable BigInteger userId) {
        UserModel userModel = userService.getUser(userId);
        if (userModel != null) {
            return ResponseEntity.ok(userModel);
        }
        return ResponseEntity.internalServerError().build();
    }

    @PutMapping(value = "/user/create")
    public ResponseEntity<UserModel> createUser(@RequestBody UserCreationDTO userCreationDTO) {
        UserModel userModel = userService.createUser(userCreationDTO);
        if (userModel != null) {
            return ResponseEntity.ok(userModel);
        }
        return ResponseEntity.internalServerError().build();
    }

    @DeleteMapping(value = "/user/delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        if (userService.deleteUser(userId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.internalServerError().build();
    }

    @PostMapping(value = "/user/edit/{userId}")
    public ResponseEntity<UserModel> editUser(@PathVariable Long userId, @RequestBody UserCreationDTO userCreationDTO) {
        UserModel userModel = userService.editUser(userId, userCreationDTO);
        if (userModel != null) {
            return ResponseEntity.ok(userModel);
        }
        return ResponseEntity.internalServerError().build();
    }
}
