package com.example.transferMoney.service;

import com.example.transferMoney.model.Balance;
import com.example.transferMoney.model.User;
import com.example.transferMoney.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;
    public User createUser(User user) {
        Balance balance = new Balance();
        user.setBalance(balance);
        return userRepository.save(user);
    }
}
