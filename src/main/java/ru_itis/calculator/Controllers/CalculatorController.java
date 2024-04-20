package ru_itis.calculator.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru_itis.calculator.Dto.CalculatorForm;
import ru_itis.calculator.Models.User;
import ru_itis.calculator.Repositories.UserRepository;
import ru_itis.calculator.Services.CalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/calculate")
     public  String showCalculator() {
        return "calculator_page";
    }

    @PostMapping("/calculate")
    public String calculate(CalculatorForm calculatorForm, Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String username = userDetails.getUsername();
        User currentUser = userRepository.findByUsername(username);
        double result = calculatorService.calculate(calculatorForm, currentUser);
        model.addAttribute("result", result);
        return "calculator_page";
    }
}
