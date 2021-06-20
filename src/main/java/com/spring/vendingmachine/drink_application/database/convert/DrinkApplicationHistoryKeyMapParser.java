package com.spring.vendingmachine.drink_application.database.convert;

import com.spring.vendingmachine.database.util.Caster;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryKeyVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;

import java.util.ArrayList;
import java.util.HashMap;

public class DrinkApplicationHistoryKeyMapParser {

    public static DrinkApplicationHistoryKeyVO convertHashMapToDrinkApplicationHistoryKeyVO(HashMap<String, Object> map) {
        DrinkApplicationHistoryKeyVO vo = new DrinkApplicationHistoryKeyVO();
        vo.setApplication_history_id((Caster.bigDecimalObjToLong(map.get("application_history_id"))));
        vo.setIssue_id(Caster.bigDecimalObjToLong(map.get("issue_id")));
        return vo;
    }

    public static ArrayList<DrinkApplicationHistoryKeyVO> convertHashMapListToDrinkApplicationHistoryVO(ArrayList<HashMap<String, Object>> list) {
        ArrayList<DrinkApplicationHistoryKeyVO> resultList = new ArrayList<DrinkApplicationHistoryKeyVO>();
        for (HashMap<String, Object> map : list) {
            DrinkApplicationHistoryKeyVO vo = convertHashMapToDrinkApplicationHistoryKeyVO(map);
            resultList.add(vo);
        }
        return resultList;
    }
}
