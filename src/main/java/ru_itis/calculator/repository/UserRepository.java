package ru_itis.calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru_itis.calculator.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String username);
}