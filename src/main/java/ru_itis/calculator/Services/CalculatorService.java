package ru_itis.calculator.Services;


import ru_itis.calculator.Dto.CalculatorForm;
import ru_itis.calculator.Models.User;

public interface CalculatorService {
    double calculate(CalculatorForm calculatorForm, User user);
}