package ru_itis.calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru_itis.calculator.model.User;
import ru_itis.calculator.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(User user) {
        userService.saveUser(user);
        return "redirect:/signin";
    }

    @GetMapping("/signin")
    public String showSigninForm() {
        return "signin";
    }
}