package com.example.demo.service;


import com.example.demo.model.Trader;
import com.example.demo.repository.TraderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraderService {

    private final TraderRepository traderRepository;

    public TraderService(TraderRepository traderRepository) {
        this.traderRepository = traderRepository;
    }

    public List<Trader> findAll() { return traderRepository.findAll(); }
    public Trader save(Trader trader) { return traderRepository.save(trader); }
    public void delete(Long id) { traderRepository.deleteById(id); }
}