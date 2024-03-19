package ru_itis.calculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru_itis.calculator.model.CalculationHistory;
import ru_itis.calculator.model.User;
import ru_itis.calculator.repository.CalculationHistoryRepository;
import ru_itis.calculator.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CalculationHistoryRepository calculationHistoryRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByLogin(username);
    }

    @Override
    public void saveCalculation(CalculationHistory calculation) {
        calculationHistoryRepository.save(calculation);
    }

    @Override
    public List<CalculationHistory> getCalculationHistory(User user) {
        return calculationHistoryRepository.findByUser(user);
    }
}