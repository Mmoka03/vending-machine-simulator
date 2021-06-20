package com.spring.vendingmachine.drink_application.domain.avart.history.design;

import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;

import java.util.ArrayList;

public interface DrinkApplicationHistory {

    void registerUpdateHistory(String revision_history);

    void registerRegistrationHistory(String revision_history);

    ArrayList<DrinkApplicationHistoryVO> getHistoryList();

    ArrayList<DrinkApplicationHistoryVO> getHistoryListWithIssueId(Long issue_id);
}
