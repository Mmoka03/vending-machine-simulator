package com.spring.vendingmachine.user.domain.avart.info.design;

import com.spring.vendingmachine.user.database.VO.UserVO;

import java.util.ArrayList;

public interface UserInformation {

    ArrayList<UserVO> getUserInfoList();

    UserVO getUserInfo(Long user_id);

    void userReplacement();
}
