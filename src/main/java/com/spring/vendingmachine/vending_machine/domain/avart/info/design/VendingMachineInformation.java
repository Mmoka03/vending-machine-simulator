package com.spring.vendingmachine.vending_machine.domain.avart.info.design;

import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;

import java.util.ArrayList;

public interface VendingMachineInformation {

    ArrayList<VendingMachineVO> getVendingMachineInfoList();

    VendingMachineVO getVendingMachineInfo(Long vending_id);

    void vendingMachineReplacement();
}
