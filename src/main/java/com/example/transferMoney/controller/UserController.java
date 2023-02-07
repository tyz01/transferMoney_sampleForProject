package com.example.transferMoney.controller;

import com.example.transferMoney.model.User;
import com.example.transferMoney.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
UserService userService;

@PostMapping("/")
    public User createUser(@RequestBody User user){
return userService.createUser(user);
    }
}
