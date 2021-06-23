package com.spring.vendingmachine.vending_machine.domain.avart.info;

import com.spring.vendingmachine.user.database.VO.UserVO;
import com.spring.vendingmachine.user.domain.UserConfig;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import com.spring.vendingmachine.vending_machine.database.VO.VendingMachineVO;
import com.spring.vendingmachine.vending_machine.domain.VendingMachineConfig;
import com.spring.vendingmachine.vending_machine.domain.avart.info.design.VendingMachineInformation;
import com.spring.vendingmachine.vending_machine.domain.avart.repository.design.VendingMachineRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class VendingMachineFixedInformation implements VendingMachineInformation {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(VendingMachineConfig.class);
    VendingMachineRepository vendingMachineRepository = ac.getBean(VendingMachineRepository.class);

    @Override
    public ArrayList<VendingMachineVO> getVendingMachineInfoList() {
        return vendingMachineRepository.getUserDataList();
    }

    @Override
    public VendingMachineVO getVendingMachineInfo(Long user_id) {
        return vendingMachineRepository.getUserData(user_id);
    }

    @Override
    public void vendingMachineReplacement() {
        VendingMachineVO vending_machine = new VendingMachineVO();
        vending_machine.setId(vendingMachineRepository.getMaxId());

        Long fixedMoney = 0L;
        vending_machine.setHolding_amount(fixedMoney);

        vendingMachineRepository.insertVendingMachine(vending_machine);
    }
}
