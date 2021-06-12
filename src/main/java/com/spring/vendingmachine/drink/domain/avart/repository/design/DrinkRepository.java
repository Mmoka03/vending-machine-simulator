package com.spring.vendingmachine.drink.domain.avart.repository.design;

import com.spring.vendingmachine.drink.database.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.DrinkVO;

import java.util.ArrayList;

public interface DrinkRepository {

    ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id);

    Long updateDrink(Long product_id, DrinkVO item);

    ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id);

    Long RegisterPurchaseHistoryList(Long user_id, Long vending_id, DrinkTransactionVO item);
}
