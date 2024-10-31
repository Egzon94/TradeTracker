package com.example.demo.repository;

import com.example.demo.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraderRepository extends JpaRepository<Trader, Long> {

}
