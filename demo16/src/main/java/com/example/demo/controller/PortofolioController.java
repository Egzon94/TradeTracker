package com.example.demo.controller;


import com.example.demo.model.Portofolio;
import com.example.demo.service.PortofolioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portofolios")
public class PortofolioController {

    private final PortofolioService portofolioService;

    public PortofolioController(PortofolioService portofolioService) {
        this.portofolioService = portofolioService;
    }

    @GetMapping
    public List<Portofolio> findAll() {
        return portofolioService.findAll();
    }

    @PostMapping
    public Portofolio save(@RequestBody Portofolio portofolio) {
        return portofolioService.save(portofolio);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        portofolioService.delete(id);
    }
}
