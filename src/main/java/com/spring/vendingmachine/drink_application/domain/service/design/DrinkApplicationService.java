package com.spring.vendingmachine.drink_application.domain.service.design;

import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;

import java.util.ArrayList;

public interface DrinkApplicationService {

    DrinkApplicationVO getDrinkApplication(Long issue_id) ;

    ArrayList<DrinkApplicationVO> getDrinkApplicationList();

    void registrationOfApplication(DrinkApplicationVO item, Long drink_id);

    void updateDrinkApplication(DrinkApplicationVO item, String revision_history);

    ArrayList<DrinkApplicationHistoryVO> getHistoryList();

    ArrayList<DrinkApplicationHistoryVO> getHistoryListWithIssueId(Long issue_id);
}
