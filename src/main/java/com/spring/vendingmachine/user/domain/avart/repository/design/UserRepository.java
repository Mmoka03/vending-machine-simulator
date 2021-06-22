package com.spring.vendingmachine.user.domain.avart.repository.design;

import com.spring.vendingmachine.user.database.VO.UserVO;

import java.util.ArrayList;

public interface UserRepository {

    Long getUserMoney(Long user_id);

    UserVO getUserData(Long user_id);

    ArrayList<UserVO> getUserDataList();

    int insertUser(UserVO item);

    Long getUserMaxId();
}
