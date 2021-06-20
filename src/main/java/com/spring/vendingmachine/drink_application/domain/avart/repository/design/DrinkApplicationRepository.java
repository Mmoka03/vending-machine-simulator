package com.spring.vendingmachine.drink_application.domain.avart.repository.design;

import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;

import java.util.ArrayList;

public interface DrinkApplicationRepository {

    DrinkApplicationVO getDetailedDrinkApplication(Long issue_id);

    ArrayList<DrinkApplicationVO> getDetailedDrinkApplicationList();

    ArrayList<DrinkApplicationHistoryVO> getDrinkApplicationHistoryListWithIssueId(Long issue_id);

    ArrayList<DrinkApplicationHistoryVO> getDrinkApplicationHistoryList();

    int registrationOfApplication(DrinkApplicationVO item);

    int updateDrinkApplication(DrinkApplicationVO item);

    int registrationOfApplicationHistory(DrinkApplicationHistoryVO item);

    int registrationOfDrink(DrinkVO item);

    int updateDrink(DrinkVO item);

    Long getDrinkApplicationMaxId();

    Long getDrinkApplicationHistoryMaxId();
}
