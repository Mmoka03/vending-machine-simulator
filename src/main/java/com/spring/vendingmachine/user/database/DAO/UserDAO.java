package com.spring.vendingmachine.user.database.DAO;

import com.spring.vendingmachine.database.access.DAOCommon;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;
import com.spring.vendingmachine.drink_application.database.convert.DrinkApplicationMapParser;
import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.database.convert.UserMapParser;

import java.util.ArrayList;
import java.util.HashMap;

public class UserDAO {

    DAOCommon dao = new DAOCommon();

    public ArrayList<UserVO> getUserDataList() {
        String sql = "SELECT id, user_name, possession_money FROM GENERAL_USER";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql);
        return UserMapParser.convertHashMapListToUserVO(list);
    }

    public UserVO getUserData(Long user_id) {
        String sql = "SELECT id, user_name, possession_money FROM GENERAL_USER WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, user_id);
        if(list.size() > 0)
            return UserMapParser.convertHashMapToUserVO(list.get(0));
        return null;
    }

    public Long getUserPossessionMoney(Long user_id) {
        String sql = "SELECT possession_money FROM GENERAL_USER WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, user_id);
        if(list.size() > 0)
            return UserMapParser.convertHashMapToUserVO(list.get(0)).getPossession_money();
        return null;
    }

    public int insertUser(UserVO item) {
        String sql = "INSERT INTO GENERAL_USER VALUES(?,?,?)";
        return dao.executeUpdateSQL(sql, item.getId(), item.getUser_name(), item.getPossession_money());
    }

    public Long getMaxId() {
        return dao.executeSQLForId("GENERAL_USER");
    }
}
