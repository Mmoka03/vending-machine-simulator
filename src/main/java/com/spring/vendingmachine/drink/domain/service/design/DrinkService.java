package com.spring.vendingmachine.drink.domain.service.design;

import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;

import java.util.ArrayList;

public interface DrinkService {

    Long cancelDrinkPurchase(Long product_id);

    Long drinkPurchase(Long product_id, Long user_id, Long vending_id);

    DrinkVO getDrink(Long product_id);

    ArrayList<DrinkVO> getDrinkList();

    ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id);

    ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id);

}
