package com.spring.vendingmachine.user.domain;

import com.spring.vendingmachine.drink_application.domain.service.DrinkApplicationServiceImpl;
import com.spring.vendingmachine.user.domain.avart.info.UserFixedInformation;
import com.spring.vendingmachine.user.domain.avart.info.design.UserInformation;
import com.spring.vendingmachine.user.domain.avart.money.UserSimpleMoney;
import com.spring.vendingmachine.user.domain.avart.money.design.UserMoney;
import com.spring.vendingmachine.user.domain.avart.repository.UserDatabaseRepository;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import com.spring.vendingmachine.user.domain.service.UserServiceImpl;
import com.spring.vendingmachine.user.domain.service.design.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userInformation(), userMoney());
    }

    @Bean
    public UserRepository userRepository() {
        return new UserDatabaseRepository();
    }

    @Bean
    public UserInformation userInformation() {
        return new UserFixedInformation();
    }

    @Bean
    public UserMoney userMoney() {
        return new UserSimpleMoney();
    }
}
