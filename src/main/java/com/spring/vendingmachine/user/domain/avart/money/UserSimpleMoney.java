package com.spring.vendingmachine.user.domain.avart.money;

import com.spring.vendingmachine.user.domain.UserConfig;
import com.spring.vendingmachine.user.domain.avart.money.design.UserMoney;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserSimpleMoney implements UserMoney {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(UserConfig.class);
    UserRepository userRepository = ac.getBean(UserRepository.class);

    @Override
    public Long checkMoney(Long user_id) {
        return userRepository.getUserMoney(user_id);
    }
}
