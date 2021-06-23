package com.spring.vendingmachine.vending_machine.domain.avart.money;

import com.spring.vendingmachine.user.domain.UserConfig;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import com.spring.vendingmachine.vending_machine.domain.VendingMachineConfig;
import com.spring.vendingmachine.vending_machine.domain.avart.money.design.VendingMachineMoney;
import com.spring.vendingmachine.vending_machine.domain.avart.repository.design.VendingMachineRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VendingMachineSimpleMoney implements VendingMachineMoney {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(VendingMachineConfig.class);
    VendingMachineRepository vendingMachineRepository = ac.getBean(VendingMachineRepository.class);

    @Override
    public Long checkMoney(Long vending_id) {
        return vendingMachineRepository.getVendingMachineMoney(vending_id);
    }
}
