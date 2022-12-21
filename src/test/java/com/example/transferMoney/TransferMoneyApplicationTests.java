package com.example.transferMoney;

import com.example.transferMoney.repository.BalanceRepository;
import com.example.transferMoney.service.BankService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TransferMoneyApplicationTests {

    private final BalanceRepository balanceRepository = new BalanceRepository();
    private final BankService bankService = new BankService(balanceRepository);

    @Test
    void contextLoads() {
    }

    @Test
    void getBalance() {
        BigDecimal balance = bankService.getBalance(1L);
        assertEquals(balance, BigDecimal.TEN);
    }

    @Test
    void addMoney() {
        BigDecimal balance = bankService.addMoney(1L, BigDecimal.ONE);
        assertEquals( balance, BigDecimal.valueOf(11));
    }
}

