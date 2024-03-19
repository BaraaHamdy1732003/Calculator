package ru_itis.calculator.repository;


import ru_itis.calculator.model.CalculationHistory;
import ru_itis.calculator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalculationHistoryRepository extends JpaRepository<CalculationHistory, Long> {
    List<CalculationHistory> findByUser(User user);
}