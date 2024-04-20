package ru_itis.calculator.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru_itis.calculator.Models.CalculationHistory;

public interface CalculatorRepository extends JpaRepository<CalculationHistory, Long> {
}
