package ru_itis.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImplementation implements CalculatorService {
    @Override
    public double calculate(String line) {
        String[] tokens = line.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Invalid input format. Please provide two operands and an operator separated by spaces.");
        }

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        char operator = tokens[1].charAt(0);

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return operand1 / operand2;
            case '^':
                return Math.pow(operand1, 2);
            case 's':
                return Math.sqrt(operand1);
            default:
                throw new IllegalArgumentException("Invalid operator. Supported operators are: +, -, *, /, ^, s (for square root).");
        }
    }
}