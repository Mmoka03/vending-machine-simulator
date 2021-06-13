package com.spring.vendingmachine.drink.database.convert;

import com.spring.vendingmachine.database.util.Caster;
import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class DrinkTransactionMapParser {

    public static DrinkTransactionVO convertHashMapToDrinkTransactionVO(HashMap<String, Object> map) {
        DrinkTransactionVO vo = new DrinkTransactionVO();
        vo.setId((Caster.bigDecimalObjToLong(map.get("id"))));
        vo.setTransaction_type((String)(map.get("transaction_type")));
        vo.setRecorded_money((Caster.bigDecimalObjToLong(map.get("recorded_money"))));
        vo.setRecorded_date((Date)(map.get("recorded_date")));
        vo.setProduct_id((Caster.bigDecimalObjToLong(map.get("product_id"))));
        vo.setUser_id((Caster.bigDecimalObjToLong(map.get("user_id"))));
        vo.setVending_id((Caster.bigDecimalObjToLong(map.get("vending_id"))));
        return vo;
    }

    public static ArrayList<DrinkTransactionVO> convertHashMapListToDrinkTransactionVO(ArrayList<HashMap<String, Object>> list) {
        ArrayList<DrinkTransactionVO> resultList = new ArrayList<DrinkTransactionVO>();
        for (HashMap<String, Object> map : list) {
            DrinkTransactionVO vo = convertHashMapToDrinkTransactionVO(map);
            resultList.add(vo);
        }
        return resultList;
    }
}
