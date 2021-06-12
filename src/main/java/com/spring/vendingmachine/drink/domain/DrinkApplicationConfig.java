package com.spring.vendingmachine.drink.domain;

import com.spring.vendingmachine.drink.domain.avart.repository.DrinkMemoryRepository;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import com.spring.vendingmachine.drink.domain.service.design.DrinkService;
import com.spring.vendingmachine.drink.domain.service.DrinkServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkApplicationConfig {

    @Bean
    public DrinkService drinkService() {
        return new DrinkServiceImpl(drinkRepository());
    }

    @Bean
    public DrinkRepository drinkRepository() {
        return new DrinkMemoryRepository();
    }
}
