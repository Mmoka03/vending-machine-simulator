package com.spring.vendingmachine.drink.domain.avart.repository;

import com.spring.vendingmachine.drink.database.DAO.DrinkDAO;
import com.spring.vendingmachine.drink.database.DAO.DrinkTransactionDAO;
import com.spring.vendingmachine.drink.database.VO.DrinkTransactionVO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink.domain.avart.repository.design.DrinkRepository;

import java.util.ArrayList;

public class DrinkDatabseRepository implements DrinkRepository {

    DrinkDAO drinkDAO = new DrinkDAO();
    DrinkTransactionDAO drinkTransactionDAO = new DrinkTransactionDAO();

    @Override
    public ArrayList<DrinkTransactionVO> getVendingMachineUpdateHistoryList(Long vending_id) {
        return drinkTransactionDAO.getVendingMachineUpdateHistoryList(vending_id);
    }

    @Override
    public ArrayList<DrinkTransactionVO> getUserPurchaseHistoryList(Long user_id) {
        return new ArrayList<DrinkTransactionVO>();
    }

    @Override
    public DrinkTransactionVO getPurchaseHistory(Long history_id) {
        return drinkTransactionDAO.getPurchaseHistory(history_id);
    }

    @Override
    public int RegisterPurchaseHistory(DrinkTransactionVO item) {
        return drinkTransactionDAO.RegisterPurchaseHistory(item);
    }

    @Override
    public DrinkVO getDrink(Long product_id) {
        return drinkDAO.getDrink(product_id);
    }

    @Override
    public ArrayList<DrinkVO> getDrinkList() {
        return drinkDAO.getDrinkList();
    }

    @Override
    public Long getDrinkHistoryMaxId() {
        return drinkTransactionDAO.getMaxId();
    }
}
