package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "trade_type")
public abstract class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticker;
    private int quantity;
    private double price;
    private LocalDate date;

    @ManyToOne
    private Portofolio portfolio;

    public Trade(String ticker, int quantity, double price, LocalDate date, Portofolio portfolio) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }
}