package com.spring.vendingmachine.drink.domain;

import com.spring.vendingmachine.drink.domain.avart.cancel.DrinkMostRecentlyCancel;
import com.spring.vendingmachine.drink.domain.avart.cancel.design.DrinkCancel;
import com.spring.vendingmachine.drink.domain.avart.purchase.DrinkOneByOnePurchase;
import com.spring.vendingmachine.drink.domain.avart.purchase.design.DrinkPurchase;
import com.spring.vendingmachine.drink.domain.avart.repository.DrinkDatabseRepository;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import com.spring.vendingmachine.drink.domain.service.design.DrinkService;
import com.spring.vendingmachine.drink.domain.service.DrinkServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean
    public DrinkService drinkService() {
        return new DrinkServiceImpl(drinkRepository(), drinkPurchase(), drinkCancel());
    }

    @Bean
    public DrinkRepository drinkRepository() {
        return new DrinkDatabseRepository();
    }

    @Bean
    public DrinkPurchase drinkPurchase() {
        return new DrinkOneByOnePurchase();
    }

    @Bean
    public DrinkCancel drinkCancel() {
        return new DrinkMostRecentlyCancel();
    }
}
