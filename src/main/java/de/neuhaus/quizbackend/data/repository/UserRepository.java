package de.neuhaus.quizbackend.data.repository;

import de.neuhaus.quizbackend.data.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserRepository extends CrudRepository<User, Long> {
    User findById(BigInteger id);
}
