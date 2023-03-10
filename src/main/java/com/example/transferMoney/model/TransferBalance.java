package com.example.transferMoney.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class TransferBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Long fromBalance;

    public Long toBalance;

    public BigDecimal transferMoney;

}
