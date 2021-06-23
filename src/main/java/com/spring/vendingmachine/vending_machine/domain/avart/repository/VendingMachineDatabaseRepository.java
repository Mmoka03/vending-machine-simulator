package com.spring.vendingmachine.vending_machine.domain.avart.repository;

import com.spring.vendingmachine.vending_machine.database.DAO.VendingMachineDAO;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;
import com.spring.vendingmachine.vending_machine.domain.avart.repository.design.VendingMachineRepository;

import java.util.ArrayList;

public class VendingMachineDatabaseRepository implements VendingMachineRepository {

    VendingMachineDAO vendingMachineDAO = new VendingMachineDAO();

    @Override
    public Long getVendingMachineMoney(Long vending_id) {
        return vendingMachineDAO.getVendingMachineMoney(vending_id);
    }

    @Override
    public ArrayList<VendingMachineVO> getUserDataList() {
        return vendingMachineDAO.getUserDataList();
    }

    @Override
    public VendingMachineVO getUserData(Long vending_id) {
        return vendingMachineDAO.getUserData(vending_id);
    }

    @Override
    public int insertVendingMachine(VendingMachineVO item) {
        return vendingMachineDAO.insertVendingMachine(item);
    }

    @Override
    public Long getMaxId() {
        return vendingMachineDAO.getVendingMachineMaxId();
    }
}
