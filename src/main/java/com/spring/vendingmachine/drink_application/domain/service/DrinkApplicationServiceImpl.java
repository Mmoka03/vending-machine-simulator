package com.spring.vendingmachine.drink_application.domain.service;

import com.spring.vendingmachine.drink.domain.DrinkConfig;
import com.spring.vendingmachine.drink.domain.avart.cancel.design.DrinkCancel;
import com.spring.vendingmachine.drink.domain.avart.purchase.design.DrinkPurchase;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;
import com.spring.vendingmachine.drink_application.domain.avart.history.design.DrinkApplicationHistory;
import com.spring.vendingmachine.drink_application.domain.avart.management.design.DrinkApplicationManagement;
import com.spring.vendingmachine.drink_application.domain.avart.repository.design.DrinkApplicationRepository;
import com.spring.vendingmachine.drink_application.domain.service.design.DrinkApplicationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class DrinkApplicationServiceImpl implements DrinkApplicationService {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkConfig.class);
    final DrinkApplicationHistory drinkApplicationHistory;
    final DrinkApplicationManagement drinkApplicationManagement;

    public DrinkApplicationServiceImpl(DrinkApplicationHistory drinkApplicationHistory, DrinkApplicationManagement drinkApplicationManagement) {
        this.drinkApplicationHistory = drinkApplicationHistory;
        this.drinkApplicationManagement = drinkApplicationManagement;
    }

    @Override
    public DrinkApplicationVO getDrinkApplication(Long issue_id) {
        return drinkApplicationManagement.getDrinkApplication(issue_id);
    }

    @Override
    public ArrayList<DrinkApplicationVO> getDrinkApplicationList() {
        return drinkApplicationManagement.getDrinkApplicationList();
    }

    @Override
    public void registrationOfApplication(DrinkApplicationVO item, Long drink_id) {
        drinkApplicationManagement.registrationOfApplication(item, drink_id);
    }

    @Override
    public void updateDrinkApplication(DrinkApplicationVO item, String revision_history) {
        drinkApplicationManagement.updateDrinkApplication(item, revision_history);
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getHistoryList() {
        return drinkApplicationHistory.getHistoryList();
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getHistoryListWithIssueId(Long issue_id) {
        return  drinkApplicationHistory.getHistoryListWithIssueId(issue_id);
    }
}
