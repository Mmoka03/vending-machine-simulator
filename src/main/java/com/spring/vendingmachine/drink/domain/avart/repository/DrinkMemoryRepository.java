package com.spring.vendingmachine.drink.domain.avart.repository;

import com.spring.vendingmachine.drink.database.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.DrinkVO;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;

import java.util.ArrayList;

public class DrinkMemoryRepository  implements DrinkRepository {

    @Override
    public ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id) {
        return new ArrayList<DrinkTransactionVO>();
    }

    @Override
    public Long updateDrink(Long product_id, DrinkVO item) {
        return 10L;
    }

    @Override
    public ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id) {
        return new ArrayList<DrinkTransactionVO>();
    }

    @Override
    public Long RegisterPurchaseHistoryList(Long user_id, Long vending_id, DrinkTransactionVO item) {
        return 10L;
    }
}
