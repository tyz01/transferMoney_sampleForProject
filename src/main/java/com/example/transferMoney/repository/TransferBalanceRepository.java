package com.example.transferMoney.repository;

import com.example.transferMoney.model.TransferBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferBalanceRepository extends JpaRepository<TransferBalance, Long> {
}
