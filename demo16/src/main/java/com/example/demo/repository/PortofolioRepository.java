package com.example.demo.repository;

import com.example.demo.model.Portofolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortofolioRepository extends JpaRepository<Portofolio, Long> {
}
