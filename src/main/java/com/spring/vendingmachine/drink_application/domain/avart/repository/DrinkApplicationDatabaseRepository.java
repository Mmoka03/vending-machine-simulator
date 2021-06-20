package com.spring.vendingmachine.drink_application.domain.avart.repository;

import com.spring.vendingmachine.drink.database.DAO.DrinkDAO;
import com.spring.vendingmachine.drink.database.DAO.DrinkTransactionDAO;
import com.spring.vendingmachine.drink.database.VO.DrinkVO;
import com.spring.vendingmachine.drink_application.database.DAO.DrinkApplicationDAO;
import com.spring.vendingmachine.drink_application.database.DAO.DrinkApplicationHistoryDAO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationHistoryVO;
import com.spring.vendingmachine.drink_application.database.VO.DrinkApplicationVO;
import com.spring.vendingmachine.drink_application.domain.avart.repository.design.DrinkApplicationRepository;

import java.util.ArrayList;

public class DrinkApplicationDatabaseRepository implements DrinkApplicationRepository {

    DrinkDAO drinkDAO = new DrinkDAO();
    DrinkApplicationDAO drinkApplicationDAO = new DrinkApplicationDAO();
    DrinkApplicationHistoryDAO drinkApplicationHistoryDAO = new DrinkApplicationHistoryDAO();

    @Override
    public DrinkApplicationVO getDetailedDrinkApplication(Long issue_id) {
        return drinkApplicationDAO.getDrinkApplication(issue_id);
    }

    @Override
    public ArrayList<DrinkApplicationVO> getDetailedDrinkApplicationList() {
        return drinkApplicationDAO.getDrinkApplicationList();
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getDrinkApplicationHistoryListWithIssueId(Long issue_id) {
        return drinkApplicationHistoryDAO.getDrinkApplicationHistoryListWithIssueId(issue_id);
    }

    @Override
    public ArrayList<DrinkApplicationHistoryVO> getDrinkApplicationHistoryList() {
        return drinkApplicationHistoryDAO.getDrinkApplicationHistoryList();
    }

    @Override
    public int registrationOfApplication(DrinkApplicationVO item) {
        return drinkApplicationDAO.registrationOfApplication(item);
    }

    @Override
    public int updateDrinkApplication(DrinkApplicationVO item) {
        return drinkApplicationDAO.updateDrinkApplication(item);
    }

    @Override
    public int registrationOfApplicationHistory(DrinkApplicationHistoryVO item) {
        return drinkApplicationHistoryDAO.registrationOfApplicationHistory(item);
    }

    @Override
    public int registrationOfDrink(DrinkVO item) {
        return drinkDAO.registrationOfDrink(item);
    }

    @Override
    public int updateDrink(DrinkVO item) {
        return drinkDAO.updateDrink(item);
    }

    @Override
    public Long getDrinkApplicationMaxId() {
        return drinkApplicationDAO.getMaxId();
    }

    @Override
    public Long getDrinkApplicationHistoryMaxId() {
        return drinkApplicationHistoryDAO.getMaxId();
    }
}
