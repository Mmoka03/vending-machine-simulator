package com.spring.vendingmachine.drink.database.DAO;

import com.spring.vendingmachine.database.access.DAOCommon;
import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.convert.DrinkMapParser;
import com.spring.vendingmachine.drink.database.convert.DrinkTransactionMapParser;

import java.util.ArrayList;
import java.util.HashMap;

public class DrinkTransactionDAO {

    DAOCommon dao = new DAOCommon();

    public ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id) {
        String sql = "SELECT id, transaction_type, recorded_money, recorded_date, product_id, user_id, vending_id FROM DRINK_TRANSACTION WHERE vending_id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, vending_id);
        return DrinkTransactionMapParser.convertHashMapListToDrinkTransactionVO(list);
    }

    public ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long product_id) {
        String sql = "SELECT id, transaction_type, recorded_money, recorded_date, product_id, user_id, vending_id FROM DRINK_TRANSACTION WHERE product_id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, product_id);
        return DrinkTransactionMapParser.convertHashMapListToDrinkTransactionVO(list);
    }

    public DrinkTransactionVO getPurchaseHistory(Long history_id) {
        String sql = "SELECT id, transaction_type, recorded_money, recorded_date, product_id, user_id, vending_id FROM DRINK_TRANSACTION WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, history_id);
        if(list.size() > 0)
            return DrinkTransactionMapParser.convertHashMapToDrinkTransactionVO(list.get(0));
        return null;
    }

    public int RegisterPurchaseHistory(DrinkTransactionVO item) {
        String sql = "INSERT INTO DRINK_TRANSACTION VALUES(?,?,?,?,?,?,?)";
        return dao.executeUpdateSQL(sql, item.getId(), item.getTransaction_type(), item.getRecorded_money(), item.getRecorded_date(), item.getProduct_id(), item.getUser_id(), item.getVending_id());
    }

    public Long getMaxId() {
        return dao.executeSQLForId("DRINK_TRANSACTION");
    }
}
