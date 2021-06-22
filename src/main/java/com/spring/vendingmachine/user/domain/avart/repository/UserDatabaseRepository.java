package com.spring.vendingmachine.user.domain.avart.repository;

import com.spring.vendingmachine.user.database.DAO.UserDAO;
import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;

import java.util.ArrayList;

public class UserDatabaseRepository implements UserRepository {

    UserDAO userDAO = new UserDAO();

    @Override
    public Long getUserMoney(Long user_id) {
        return userDAO.getUserPossessionMoney(user_id);
    }

    @Override
    public UserVO getUserData(Long user_id) {
        return userDAO.getUserData(user_id);
    }

    @Override
    public ArrayList<UserVO> getUserDataList() {
        return userDAO.getUserDataList();
    }

    @Override
    public int insertUser(UserVO item) {
        return userDAO.insertUser(item);
    }

    @Override
    public Long getUserMaxId() {
        return userDAO.getMaxId();
    }
}
