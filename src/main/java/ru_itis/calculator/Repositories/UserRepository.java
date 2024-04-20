package ru_itis.calculator.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru_itis.calculator.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);

}
