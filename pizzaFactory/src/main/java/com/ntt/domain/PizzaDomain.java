package com.ntt.domain;

import com.ntt.repository.PizzaRepository;
import com.ntt.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;

public class PizzaDomain{

    private final PizzaService PizzaService;
    private final PizzaRepository PizzaRepository;

    public PizzaDomain(PizzaService PizzaService, PizzaRepository PizzaRepository){
        this.PizzaService = PizzaService;
        this.PizzaRepository = PizzaRepository;
    }

}