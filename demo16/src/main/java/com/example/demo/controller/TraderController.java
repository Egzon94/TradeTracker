package com.example.demo.controller;


import com.example.demo.model.Trader;
import com.example.demo.service.TraderService;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traders")
public class TraderController {

    private final TraderService traderService;

    public TraderController(TraderService traderService) {
        this.traderService = traderService;
    }


    @GetMapping
    public List<Trader> findAll(){
        return traderService.findAll();
    }

    @PostMapping
    public Trader save(@RequestBody Trader trader) {
        return traderService.save(trader);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        traderService.delete((long) id);
    }
}
