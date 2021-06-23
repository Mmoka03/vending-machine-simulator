package com.spring.vendingmachine.vending_machine.domain.avart.repository.design;

import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;

import java.util.ArrayList;

public interface VendingMachineRepository {

    Long getVendingMachineMoney(Long vending_id);

    ArrayList<VendingMachineVO> getUserDataList();

    VendingMachineVO getUserData(Long vending_id);

    int insertVendingMachine(VendingMachineVO item);

    Long getMaxId();
}
