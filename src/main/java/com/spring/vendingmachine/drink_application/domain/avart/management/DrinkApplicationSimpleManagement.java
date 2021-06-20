package com.spring.vendingmachine.drink_application.domain.avart.management;

import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;
import com.spring.vendingmachine.drink_application.domain.DrinkApplicationConfig;
import com.spring.vendingmachine.drink_application.domain.avart.history.design.DrinkApplicationHistory;
import com.spring.vendingmachine.drink_application.domain.avart.management.design.DrinkApplicationManagement;
import com.spring.vendingmachine.drink_application.domain.avart.repository.design.DrinkApplicationRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class DrinkApplicationSimpleManagement implements DrinkApplicationManagement {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkApplicationConfig.class);
    DrinkApplicationRepository drinkApplicationRepository = ac.getBean(DrinkApplicationRepository.class);
    DrinkApplicationHistory drinkApplicationHistory = ac.getBean(DrinkApplicationHistory.class);

    @Override
    public DrinkApplicationVO getDrinkApplication(Long issue_id) {
        return drinkApplicationRepository.getDetailedDrinkApplication(issue_id);
    }

    @Override
    public ArrayList<DrinkApplicationVO> getDrinkApplicationList() {
        return drinkApplicationRepository.getDetailedDrinkApplicationList();
    }

    @Override
    public void registrationOfApplication(DrinkApplicationVO item, Long drink_id) {
        simpleRegistrationOfApplication(item, drink_id, "Registered "+item.getIssuer_name());
    }

    @Override
    public void updateDrinkApplication(DrinkApplicationVO item, String revision_history) {
        simpleRegistrationOfApplication(item, item.getId(), revision_history);
    }

   private void simpleRegistrationOfApplication(DrinkApplicationVO item, Long drink_id, String revision_history) {
       DrinkVO drink = new DrinkVO();
       drink.setDrink_name(item.getIssuer_name());
       drink.setDrink_price(item.getDrink_price());
       drink.setManufacturer(item.getManufacturer());
       drink.setIssue_id(item.getId());
       item.setId(drinkApplicationRepository.getDrinkApplicationMaxId());
       drinkApplicationRepository.registrationOfApplication(item);
       drinkApplicationRepository.registrationOfDrink(drink);
       drinkApplicationHistory.registerRegistrationHistory(revision_history);
   }
}
