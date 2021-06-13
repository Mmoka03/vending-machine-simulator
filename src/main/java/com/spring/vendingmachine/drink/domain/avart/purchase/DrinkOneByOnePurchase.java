package com.spring.vendingmachine.drink.domain.avart.purchase;

import com.spring.vendingmachine.drink.database.DAO.DrinkTransactionDAO;
import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink.domain.DrinkApplicationConfig;
import com.spring.vendingmachine.drink.domain.avart.purchase.design.DrinkPurchase;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrinkOneByOnePurchase implements DrinkPurchase {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkApplicationConfig.class);

    @Override
    public void drinkPurchase(Long product_id, Long user_id, Long vending_id) {
        DrinkTransactionDAO dao = new DrinkTransactionDAO();

        DrinkRepository drinkRepository = ac.getBean(DrinkRepository.class);
        DrinkVO drink = drinkRepository.getDrink(product_id);
        DrinkTransactionVO history = new DrinkTransactionVO();
        history.setId(dao.getMaxId());
        history.setTransaction_type("OK");
        history.setRecorded_money(drink.getDrink_price());
        history.setRecorded_date(new java.sql.Date(new java.util.Date().getTime()));
        history.setProduct_id(product_id);
        history.setUser_id(user_id);
        history.setVending_id(vending_id);
        drinkRepository.RegisterPurchaseHistoryList(history);
    }
}
