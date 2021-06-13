package com.spring.vendingmachine.drink.domain.service;

import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink.domain.DrinkApplicationConfig;
import com.spring.vendingmachine.drink.domain.avart.cancel.design.DrinkCancel;
import com.spring.vendingmachine.drink.domain.avart.purchase.design.DrinkPurchase;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;
import com.spring.vendingmachine.drink.domain.service.design.DrinkService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class DrinkServiceImpl implements DrinkService {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DrinkApplicationConfig.class);
    final DrinkRepository drinkRepository;
    final DrinkPurchase drinkPurchase;
    final DrinkCancel drinkCancel;

    public DrinkServiceImpl(DrinkRepository drinkRepository, DrinkPurchase drinkPurchase, DrinkCancel drinkCancel) {
        this.drinkRepository = drinkRepository;
        this.drinkPurchase = drinkPurchase;
        this.drinkCancel = drinkCancel;
    }

    @Override
    public Long cancelDrinkPurchase(Long product_id) {
        drinkCancel.cancelDrinkPurchase();
        return getDrink(product_id).getDrink_price();
    }

    @Override
    public Long drinkPurchase(Long product_id, Long user_id, Long vending_id) {
        drinkPurchase.drinkPurchase(product_id, user_id, vending_id);
        return (getDrink(product_id).getDrink_price() * -1);
    }

    @Override
    public DrinkVO getDrink(Long product_id) {
        return drinkRepository.getDrink(product_id);
    }

    @Override
    public ArrayList<DrinkVO> getDrinkList() {
        return drinkRepository.getDrinkList();
    }

    @Override
    public ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id) {
        return drinkRepository.getVendingMachineUpdateHistoryList(vending_id);
    }

    @Override
    public ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id) {
        return drinkRepository.getUserPurchaseHistoryList(user_id);
    }
}
