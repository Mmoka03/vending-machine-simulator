package com.spring.vendingmachine.user.domain.avart.info;

import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.domain.UserConfig;
import com.spring.vendingmachine.user.domain.avart.info.design.UserInformation;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class UserFixedInformation implements UserInformation {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(UserConfig.class);
    UserRepository userRepository = ac.getBean(UserRepository.class);

    @Override
    public ArrayList<UserVO> getUserInfoList() {
        return userRepository.getUserDataList();
    }

    @Override
    public UserVO getUserInfo(Long user_id) {
        return userRepository.getUserData(user_id);
    }

    @Override
    public void userReplacement() {
        UserVO user = new UserVO();
        user.setId(userRepository.getUserMaxId());

        String fixedName = "홍길동";
        user.setUser_name(fixedName);

        Long fixedMoney = 10000L;
        user.setPossession_money(fixedMoney);

        userRepository.insertUser(user);
    }
}
