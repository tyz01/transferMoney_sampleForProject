package com.example.transferMoney.repository;

import com.example.transferMoney.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {

  Balance findBalanceById(Long id);

}
