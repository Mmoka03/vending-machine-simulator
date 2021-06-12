package com.spring.vendingmachine.drink.domain.service;

import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import com.spring.vendingmachine.drink.domain.service.design.DrinkService;

public class DrinkServiceImpl implements DrinkService {

    private final DrinkRepository drinkRepository;

    public DrinkServiceImpl(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @Override
    public void someting() {
        System.out.println("test");
    }

}
