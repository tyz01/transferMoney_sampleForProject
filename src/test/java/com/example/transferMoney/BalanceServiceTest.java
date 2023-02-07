package com.example.transferMoney;

import com.example.transferMoney.model.Balance;
import com.example.transferMoney.repository.BalanceRepository;
import com.example.transferMoney.service.BalanceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;

@SpringBootTest
public class BalanceServiceTest {
    @Autowired
    BalanceService balanceService;

    @MockBean
    BalanceRepository balanceRepository;


    @BeforeEach//когда нужно писать одно и тоже в тестовых методах
    public void setUp () {

    }
    @Test
    public void createBalance() {
        Balance balance = new Balance();
        BigDecimal bigDecimal = new BigDecimal(10);
        balance.setAmountMoney(bigDecimal);//инициализация
        Mockito.when(balanceRepository.save(balance)).thenReturn(balance);
        Balance newBalance = balanceService.createBalance(balance); // то что тестируем
        Assertions.assertEquals(balance, newBalance);//проверка
    }

}
