package com.spring.vendingmachine.drink_application.domain.avart.history;

import com.spring.vendingmachine.drink_application.database.DAO.DrinkApplicationHistoryDAO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;
import com.spring.vendingmachine.drink_application.domain.DrinkApplicationConfig;
import com.spring.vendingmachine.drink_application.domain.avart.history.design.DrinkApplicationHistory;
import com.spring.vendingmachine.drink_application.domain.avart.repository.design.DrinkApplicationRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class DrinkApplicationSimpleHistory implements DrinkApplicationHistory {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkApplicationConfig.class);
    DrinkApplicationRepository drinkApplicationRepository = ac.getBean(DrinkApplicationRepository.class);

    @Override
    public void registerUpdateHistory(String revision_history) {
        drinkApplicationRepository.registrationOfApplicationHistory(makingSimpleHistoryVO(revision_history, "UPDATE"));
    }

    @Override
    public void registerRegistrationHistory(String revision_history) {
        drinkApplicationRepository.registrationOfApplicationHistory(makingSimpleHistoryVO(revision_history, "RECORD"));
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getHistoryList() {
        return drinkApplicationRepository.getDrinkApplicationHistoryList();
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getHistoryListWithIssueId(Long issue_id) {
        return drinkApplicationRepository.getDrinkApplicationHistoryListWithIssueId(issue_id);
    }

    private DrinkApplicationHistoryVO makingSimpleHistoryVO(String revision_history, String history_type) {
        DrinkApplicationHistoryVO history = new DrinkApplicationHistoryVO();
        history.setId(drinkApplicationRepository.getDrinkApplicationHistoryMaxId());
        history.setRevision_history(revision_history);
        history.setRecorded_date(new java.sql.Date(new java.util.Date().getTime()));
        history.setHistory_type(history_type);
        return history;
    }
}
