package com.example.demo.service;


import com.example.demo.model.Portofolio;
import com.example.demo.repository.PortofolioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortofolioService {

    private final PortofolioRepository prepository;
    private final PortofolioRepository portofolioRepository;

    public PortofolioService(PortofolioRepository prepository, PortofolioRepository portofolioRepository) {
        this.prepository = prepository;
        this.portofolioRepository = portofolioRepository;
    }


    public List<Portofolio> findAll() { return portofolioRepository.findAll(); }
    public Portofolio save(Portofolio portfolio) { return portofolioRepository.save(portfolio); }
    public void delete(Long id) { portofolioRepository.deleteById(id); }
}