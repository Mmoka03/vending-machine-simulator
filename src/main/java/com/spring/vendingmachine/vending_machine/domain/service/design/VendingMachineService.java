package com.spring.vendingmachine.vending_machine.domain.service.design;

import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;

import java.util.ArrayList;

public interface VendingMachineService {

    Long checkMoney(Long vending_id);

    ArrayList<VendingMachineVO> getVendingMachineInfoList();

    VendingMachineVO getVendingMachineInfo(Long vending_id);

    void vendingMachineReplacement();
}
