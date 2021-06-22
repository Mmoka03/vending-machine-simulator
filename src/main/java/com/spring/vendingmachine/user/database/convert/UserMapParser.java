package com.spring.vendingmachine.user.database.convert;

import com.spring.vendingmachine.database.util.Caster;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;
import com.spring.vendingmachine.user.database.VO.UserVO;

import java.util.ArrayList;
import java.util.HashMap;

public class UserMapParser {

    public static UserVO convertHashMapToUserVO(HashMap<String, Object> map) {
        UserVO vo = new UserVO();
        vo.setId((Caster.bigDecimalObjToLong(map.get("id"))));
        vo.setUser_name((String)(map.get("user_name")));
        vo.setPossession_money((Caster.bigDecimalObjToLong(map.get("possession_money"))));
        return vo;
    }

    public static ArrayList<UserVO> convertHashMapListToUserVO(ArrayList<HashMap<String, Object>> list) {
        ArrayList<UserVO> resultList = new ArrayList<UserVO>();
        for (HashMap<String, Object> map : list) {
            UserVO vo = convertHashMapToUserVO(map);
            resultList.add(vo);
        }
        return resultList;
    }
}
