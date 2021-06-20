package com.spring.vendingmachine.drink.domain.avart.cancel;

import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.domain.DrinkConfig;
import com.spring.vendingmachine.drink.domain.avart.cancel.design.DrinkCancel;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrinkMostRecentlyCancel implements DrinkCancel {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkConfig.class);

    @Override
    public void cancelDrinkPurchase() {
        DrinkRepository drinkRepository = ac.getBean(DrinkRepository.class);
        Long history_id = drinkRepository.getDrinkHistoryMaxId();
        DrinkTransactionVO history = drinkRepository.getPurchaseHistory(history_id-1);
        history.setId(history_id);
        history.setTransaction_type("CANCEL");
        history.setRecorded_date(new java.sql.Date(new java.util.Date().getTime()));
        drinkRepository.RegisterPurchaseHistory(history);
    }
}
