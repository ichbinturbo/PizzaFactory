package com.ntt.controller;

import com.ntt.domain.PizzaDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {

    private PizzaDomain PizzaDomain;

    public PizzaController(PizzaDomain PizzaDomain){
        this.PizzaDomain = PizzaDomain;
    }

}