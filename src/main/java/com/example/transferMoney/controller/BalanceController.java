package com.example.transferMoney.controller;

import com.example.transferMoney.model.Balance;
import com.example.transferMoney.service.BalanceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@AllArgsConstructor
@RequestMapping("/balance")
@RestController
public class BalanceController {

    private BalanceService balanceService;

    @PostMapping("/")
    public Balance createBalance(@RequestBody Balance balance) {
        return balanceService.createBalance(balance);
    }

    @GetMapping("/{accountId}")
    public BigDecimal checkBalance(@PathVariable Long accountId) {
        return balanceService.checkBalance(accountId);
    }

    @GetMapping("/addMoney/{accountId}")
    public BigDecimal findBalanceById(@PathVariable Long accountId) {
        return balanceService.findBalanceById(accountId);
    }

    @PostMapping("/addMoney/{accountId}")
    public BigDecimal addMoneyOnBalance(@PathVariable Long accountId, @RequestBody Balance balance) {
        return balanceService.addMoneyOnBalance(accountId, balance.getMoneyAdd());
    }
}
