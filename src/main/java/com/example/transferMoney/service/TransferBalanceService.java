package com.example.transferMoney.service;

import com.example.transferMoney.model.Balance;
import com.example.transferMoney.model.TransferBalance;
import com.example.transferMoney.repository.BalanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@AllArgsConstructor
@Service
public class TransferBalanceService {

    private BalanceRepository balanceRepository;

    public void transferBalance(TransferBalance transferBalance) {

        Balance balanceTo = balanceRepository.findBalanceById(transferBalance.getToBalance());
        Balance balanceFrom = balanceRepository.findBalanceById(transferBalance.getFromBalance());

        BigDecimal MoneyFromTransfer = balanceFrom.getAmountMoney();
        BigDecimal MoneyToTransfer = balanceTo.getAmountMoney();

        balanceTo.setAmountMoney(MoneyToTransfer.add(transferBalance.getTransferMoney()));
        balanceFrom.setAmountMoney(MoneyFromTransfer.subtract(transferBalance.getTransferMoney()));

        balanceRepository.save(balanceFrom);
        balanceRepository.save(balanceTo);

    }

}
