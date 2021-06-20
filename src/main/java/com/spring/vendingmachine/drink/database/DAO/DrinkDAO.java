package com.spring.vendingmachine.drink.database.DAO;

import com.spring.vendingmachine.database.access.DAOCommon;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink.database.convert.DrinkMapParser;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DrinkDAO {

    DAOCommon dao = new DAOCommon();

    public ArrayList<DrinkVO> getDrinkList() {
        String sql = "SELECT id, drink_name, drink_price, manufacturer, issue_id FROM DRINK";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql);
        return DrinkMapParser.convertHashMapListToDrinkVO(list);
    }

    public DrinkVO getDrink(Long product_id) {
        String sql = "SELECT id, drink_name, drink_price, manufacturer, issue_id FROM DRINK WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, product_id);
        if(list.size() > 0)
            return DrinkMapParser.convertHashMapToDrinkVO(list.get(0));
        return null;
    }

    public int registrationOfDrink(DrinkVO item) {
        String sql = "INSERT INTO DRINK VALUES(?,?,?,?,?)";
        return dao.executeUpdateSQL(sql, item.getId(), item.getDrink_name(), item.getDrink_price(), item.getManufacturer(), item.getIssue_id());
    }

    public int updateDrink(DrinkVO item) {
        String sql = "UPDATE DRINK SET drink_name=?, drink_price=?, manufacturer=?, issue_id=? WHERE id = ?";
        return dao.executeUpdateSQL(sql, item.getDrink_name(), item.getDrink_price(), item.getManufacturer(), item.getIssue_id(), item.getId());
    }
}
