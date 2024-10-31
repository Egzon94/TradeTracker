package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.swing.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "portofolio")
public class Portofolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;


    @ManyToOne
    private Trader trader;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Trade> trades;


    public Portofolio(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
