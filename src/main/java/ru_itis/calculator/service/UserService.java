package ru_itis.calculator.service;

import ru_itis.calculator.model.User;
import ru_itis.calculator.model.CalculationHistory;

import java.util.List;


public interface UserService {
    void saveUser(User user);

    User findByUsername(String username);

    void saveCalculation(CalculationHistory calculation);

    List<CalculationHistory> getCalculationHistory(User user);
}
