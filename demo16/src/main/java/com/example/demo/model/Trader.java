package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "trader")
public class Trader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;


    @OneToMany(mappedBy = "trader", cascade = CascadeType.ALL)
    private List<Portofolio> portofolios;

    public Trader(String name, String email, List<Portofolio> portofolios) {
        this.name = name;
        this.email = email;
        this.portofolios = portofolios;
    }
}
