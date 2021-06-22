package com.spring.vendingmachine.user.domain.service.design;

import com.spring.vendingmachine.user.database.VO.UserVO;

import java.util.ArrayList;

public interface UserService {

    Long checkMoney(Long user_id);

    UserVO getUserInfo(Long user_id);

    ArrayList<UserVO> getUserInfoList();

    void userReplacement();
}
