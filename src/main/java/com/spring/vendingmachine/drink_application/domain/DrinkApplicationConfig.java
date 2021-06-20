package com.spring.vendingmachine.drink_application.domain;

import com.spring.vendingmachine.drink.domain.service.DrinkServiceImpl;
import com.spring.vendingmachine.drink_application.domain.avart.history.DrinkApplicationSimpleHistory;
import com.spring.vendingmachine.drink_application.domain.avart.history.design.DrinkApplicationHistory;
import com.spring.vendingmachine.drink_application.domain.avart.management.DrinkApplicationSimpleManagement;
import com.spring.vendingmachine.drink_application.domain.avart.management.design.DrinkApplicationManagement;
import com.spring.vendingmachine.drink_application.domain.avart.repository.DrinkApplicationDatabaseRepository;
import com.spring.vendingmachine.drink_application.domain.avart.repository.design.DrinkApplicationRepository;
import com.spring.vendingmachine.drink_application.domain.service.DrinkApplicationServiceImpl;
import com.spring.vendingmachine.drink_application.domain.service.design.DrinkApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkApplicationConfig {

    @Bean
    public DrinkApplicationService drinkApplicationService() {
        return new DrinkApplicationServiceImpl(drinkApplicationHistory(), drinkApplicationManagement());
    }

    @Bean
    public DrinkApplicationRepository drinkApplicationRepository() {
        return new DrinkApplicationDatabaseRepository();
    }

    public DrinkApplicationHistory drinkApplicationHistory() {
        return new DrinkApplicationSimpleHistory();
    }

    public DrinkApplicationManagement drinkApplicationManagement() {
        return new DrinkApplicationSimpleManagement();
    }
}
