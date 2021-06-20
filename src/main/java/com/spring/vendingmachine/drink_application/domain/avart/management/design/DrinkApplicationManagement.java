package com.spring.vendingmachine.drink_application.domain.avart.management.design;

import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;

import java.util.ArrayList;

public interface DrinkApplicationManagement {

    DrinkApplicationVO getDrinkApplication(Long issue_id);

    ArrayList<DrinkApplicationVO> getDrinkApplicationList();

    void registrationOfApplication(DrinkApplicationVO item, Long drink_id);

    void updateDrinkApplication(DrinkApplicationVO item, String revision_history);
}
