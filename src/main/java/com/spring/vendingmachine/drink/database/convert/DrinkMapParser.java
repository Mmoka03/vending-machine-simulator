package com.spring.vendingmachine.drink.database.convert;

import com.spring.vendingmachine.database.util.Caster;
import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;

import java.util.ArrayList;
import java.util.HashMap;

public class DrinkMapParser {

    public static DrinkVO convertHashMapToDrinkVO(HashMap<String, Object> map) {
        DrinkVO vo = new DrinkVO();
        vo.setId((Caster.bigDecimalObjToLong(map.get("id"))));
        vo.setDrink_name((String)(map.get("drink_name")));
        vo.setDrink_price((Caster.bigDecimalObjToLong(map.get("drink_price"))));
        vo.setManufacturer((String)(map.get("manufacturer")));
        vo.setIssue_id((Caster.bigDecimalObjToLong(map.get("issue_id"))));
        return vo;
    }

    public static ArrayList<DrinkVO> convertHashMapListToDrinkVO(ArrayList<HashMap<String, Object>> list) {
        ArrayList<DrinkVO> resultList = new ArrayList<DrinkVO>();
        for (HashMap<String, Object> map : list) {
            DrinkVO vo = convertHashMapToDrinkVO(map);
            resultList.add(vo);
        }
        return resultList;
    }
}
