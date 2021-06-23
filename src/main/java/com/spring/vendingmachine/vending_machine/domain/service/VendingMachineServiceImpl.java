package com.spring.vendingmachine.vending_machine.domain.service;

import com.spring.vendingmachine.drink.domain.DrinkConfig;
import com.spring.vendingmachine.user.domain.avart.info.design.UserInformation;
import com.spring.vendingmachine.user.domain.avart.money.design.UserMoney;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;
import com.spring.vendingmachine.vending_machine.domain.VendingMachineConfig;
import com.spring.vendingmachine.vending_machine.domain.avart.info.design.VendingMachineInformation;
import com.spring.vendingmachine.vending_machine.domain.avart.money.design.VendingMachineMoney;
import com.spring.vendingmachine.vending_machine.domain.service.design.VendingMachineService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class VendingMachineServiceImpl implements VendingMachineService {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(VendingMachineConfig.class);
    final VendingMachineInformation vendingMachineInformation;
    final VendingMachineMoney vendingMachineMoney;

    public VendingMachineServiceImpl(VendingMachineInformation vendingMachineInformation, VendingMachineMoney vendingMachineMoney) {
        this.vendingMachineInformation = vendingMachineInformation;
        this.vendingMachineMoney = vendingMachineMoney;
    }

    @Override
    public Long checkMoney(Long vending_id) {
        return vendingMachineMoney.checkMoney(vending_id);
    }

    @Override
    public ArrayList<VendingMachineVO> getVendingMachineInfoList() {
        return vendingMachineInformation.getVendingMachineInfoList();
    }

    @Override
    public VendingMachineVO getVendingMachineInfo(Long vending_id) {
        return vendingMachineInformation.getVendingMachineInfo(vending_id);
    }

    @Override
    public void vendingMachineReplacement() {
        vendingMachineInformation.vendingMachineReplacement();
    }
}
