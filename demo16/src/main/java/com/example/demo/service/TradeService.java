package com.example.demo.service;


import com.example.demo.model.Trade;
import com.example.demo.repository.TradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<Trade> findAll() { return tradeRepository.findAll(); }
    public Trade save(Trade trade) { return tradeRepository.save(trade); }
    public void delete(Long id) { tradeRepository.deleteById(id); }
}
