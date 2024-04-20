package ru_itis.calculator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru_itis.calculator.Dto.UserForm;
import ru_itis.calculator.Models.User;
import ru_itis.calculator.Repositories.UserRepository;


@Component
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addUser(UserForm form) {
        System.out.println(form);
        User user = User.builder()
                .firstname(form.getFirstname())
                .lastname(form.getLastname())
                .password(passwordEncoder.encode(form.getPassword()))
                .username(form.getUsername())
                .build();
        userRepository.save(user);

    }
}
