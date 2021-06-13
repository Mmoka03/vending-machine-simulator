package com.spring.vendingmachine.drink.domain.avart.repository.design;

import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;

import java.util.ArrayList;

public interface DrinkRepository {

    ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id);

    ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id);

    int RegisterPurchaseHistoryList(DrinkTransactionVO item);

    DrinkVO getDrink(Long product_id);

    ArrayList<DrinkVO> getDrinkList();
}
