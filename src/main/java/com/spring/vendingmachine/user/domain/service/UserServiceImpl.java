package com.spring.vendingmachine.user.domain.service;

import com.spring.vendingmachine.drink.domain.DrinkConfig;
import com.spring.vendingmachine.drink_application.domain.avart.history.design.DrinkApplicationHistory;
import com.spring.vendingmachine.drink_application.domain.avart.management.design.DrinkApplicationManagement;
import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.domain.avart.info.design.UserInformation;
import com.spring.vendingmachine.user.domain.avart.money.design.UserMoney;
import com.spring.vendingmachine.user.domain.service.design.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkConfig.class);
    final UserInformation userInformation;
    final UserMoney userMoney;

    public UserServiceImpl(UserInformation userInformation, UserMoney userMoney) {
        this.userInformation = userInformation;
        this.userMoney = userMoney;
    }


    @Override
    public Long checkMoney(Long user_id) {
        return userMoney.checkMoney(user_id);
    }

    @Override
    public UserVO getUserInfo(Long user_id) {
        return userInformation.getUserInfo(user_id);
    }

    @Override
    public ArrayList<UserVO> getUserInfoList() {
        return userInformation.getUserInfoList();
    }

    @Override
    public void userReplacement() {
        userInformation.userReplacement();
    }
}
