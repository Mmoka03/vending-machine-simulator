package com.spring.vendingmachine.vending_machine.database.convert;

import com.spring.vendingmachine.database.util.Caster;
import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachineMapParser {

    public static VendingMachineVO convertHashMapToVendingMachineVO(HashMap<String, Object> map) {
        VendingMachineVO vo = new VendingMachineVO();
        vo.setId((Caster.bigDecimalObjToLong(map.get("id"))));
        vo.setHolding_amount((Caster.bigDecimalObjToLong(map.get("holding_amount"))));
        return vo;
    }

    public static ArrayList<VendingMachineVO> convertHashMapListToVendingMachineVO(ArrayList<HashMap<String, Object>> list) {
        ArrayList<VendingMachineVO> resultList = new ArrayList<VendingMachineVO>();
        for (HashMap<String, Object> map : list) {
            VendingMachineVO vo = convertHashMapToVendingMachineVO(map);
            resultList.add(vo);
        }
        return resultList;
    }
}
