package com.example.transferMoney.controller;

import com.example.transferMoney.model.TransferBalance;
import com.example.transferMoney.service.TransferBalanceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transfer")
@AllArgsConstructor
@RestController
public class TransferBalanceController {

    private TransferBalanceService transferBalanceService;

    @PostMapping("/")
    public void transferBalance(@RequestBody TransferBalance transferBalance) {
        transferBalanceService.transferBalance(transferBalance);
    }
}
