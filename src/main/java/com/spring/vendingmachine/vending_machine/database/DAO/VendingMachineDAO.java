package com.spring.vendingmachine.vending_machine.database.DAO;

import com.spring.vendingmachine.database.access.DAOCommon;
import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.database.convert.UserMapParser;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;
import com.spring.vendingmachine.vending_machine.database.convert.VendingMachineMapParser;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachineDAO {

    DAOCommon dao = new DAOCommon();

    public Long getVendingMachineMoney(Long vending_id) {
        String sql = "SELECT id, holding_amount FROM VENDING_MACHINE WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, vending_id);
        if(list.size() > 0)
            return VendingMachineMapParser.convertHashMapToVendingMachineVO(list.get(0)).getHolding_amount();
        return null;
    }

    public ArrayList<VendingMachineVO> getUserDataList() {
        String sql = "SELECT id, holding_amount FROM VENDING_MACHINE";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql);
        return VendingMachineMapParser.convertHashMapListToVendingMachineVO(list);
    }

    public VendingMachineVO getUserData(Long vending_id) {
        String sql = "SELECT id, holding_amount FROM VENDING_MACHINE WHERE id = ?";
        ArrayList<HashMap<String, Object>> list = dao.executeSQL(sql, vending_id);
        if(list.size() > 0)
            return VendingMachineMapParser.convertHashMapToVendingMachineVO(list.get(0));
        return null;
    }

    public int insertVendingMachine(VendingMachineVO item) {
        String sql = "INSERT INTO VENDING_MACHINE VALUES(?,?)";
        return dao.executeUpdateSQL(sql, item.getId(), item.getHolding_amount());
    }

    public Long getVendingMachineMaxId() {
        return dao.executeSQLForId("VENDING_MACHINE");
    }
}
