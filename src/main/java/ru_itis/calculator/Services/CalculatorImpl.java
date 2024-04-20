package ru_itis.calculator.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru_itis.calculator.Dto.CalculatorForm;
import ru_itis.calculator.Models.CalculationHistory;
import ru_itis.calculator.Models.User;
import ru_itis.calculator.Repositories.CalculatorRepository;
import ru_itis.calculator.Repositories.UserRepository;

@Component
public  class CalculatorImpl implements CalculatorService {

    @Autowired
    private CalculatorRepository calculatorRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public double calculate(CalculatorForm calculatorForm, User currentUser) {
       double result;
        switch (calculatorForm.getOperator()) {
            case "+":
                result = calculatorForm.getFirstNumber() + calculatorForm.getSecondNumber();
                break;
            case "-":
                result = calculatorForm.getFirstNumber() - calculatorForm.getSecondNumber();
                break;
            case "/":
                 result = calculatorForm.getFirstNumber() / calculatorForm.getSecondNumber();
                 break;
            case "*":
                 result = calculatorForm.getFirstNumber() * calculatorForm.getSecondNumber();
                 break;
            case "^2":
                 result = Math.pow(calculatorForm.getFirstNumber(), 2);
                 break;
            case "sqrt":
                result = Math.sqrt(calculatorForm.getFirstNumber());
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + calculatorForm.getOperator());
        }

        CalculationHistory calculationHistory = CalculationHistory.builder()
                .firstNumber(calculatorForm.getFirstNumber())
                .operator(calculatorForm.getOperator())
                .secondNumber(calculatorForm.getSecondNumber())
                .user(currentUser)
                .result(result)
                .build();
        System.out.println(calculationHistory);
        calculatorRepository.save(calculationHistory);

        return result;
    }

}
