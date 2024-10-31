package com.example.demo.controller;


import com.example.demo.model.Trade;
import com.example.demo.service.TradeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final TradeService tradeService;

    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @GetMapping
    public List<Trade> findAll() {
        return tradeService.findAll();
    }

    @PostMapping
    public Trade save(@RequestBody Trade trade) {
        return tradeService.save(trade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tradeService.delete(id);
    }
}
