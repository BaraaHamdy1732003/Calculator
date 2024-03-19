package ru_itis.calculator.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru_itis.calculator.model.User;
import ru_itis.calculator.service.CalculatorService;
import ru_itis.calculator.model.CalculationHistory;
import ru_itis.calculator.service.UserService;

import java.util.List;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private UserService userService;

    @GetMapping("/calculator")
    public String showCalculator(Model model) {
        model.addAttribute("calculation", new CalculationHistory());
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(CalculationHistory calculation, @AuthenticationPrincipal User user) {
        double result = calculatorService.calculate(calculation.getLineEntered());
        calculation.setCalculationResult(result);
        calculation.setUser(user);
        userService.saveCalculation(calculation);
        return "redirect:/calculator";
    }

    @GetMapping("/history")
    public String showHistory(Model model, @AuthenticationPrincipal User user) {
        List<CalculationHistory> history = userService.getCalculationHistory(user);
        model.addAttribute("history", history);
        return "history";
    }
}