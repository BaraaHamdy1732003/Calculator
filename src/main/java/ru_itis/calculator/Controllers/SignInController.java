package ru_itis.calculator.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {
    @GetMapping("/login")
    public String getLoginPage() {
        return "signin_page";
    }
    @PostMapping("/login")
    public String loginPage() {
        return "redirect:/calculate";
    }
}
