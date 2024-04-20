package ru_itis.calculator.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru_itis.calculator.Dto.UserForm;
import ru_itis.calculator.Services.RegisterService;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String getRegisterPage() {
        return "signup_page";
    }

    @PostMapping("/register")
    public String signUp(UserForm form) {
        registerService.addUser(form);
        return "redirect:/login";
    }
}
