package com.spring.vendingmachine.vending_machine.domain;

import com.spring.vendingmachine.user.domain.avart.info.UserFixedInformation;
import com.spring.vendingmachine.user.domain.avart.info.design.UserInformation;
import com.spring.vendingmachine.user.domain.avart.money.UserSimpleMoney;
import com.spring.vendingmachine.user.domain.avart.money.design.UserMoney;
import com.spring.vendingmachine.user.domain.avart.repository.UserDatabaseRepository;
import com.spring.vendingmachine.user.domain.avart.repository.design.UserRepository;
import com.spring.vendingmachine.user.domain.service.UserServiceImpl;
import com.spring.vendingmachine.user.domain.service.design.UserService;
import com.spring.vendingmachine.vending_machine.domain.avart.info.VendingMachineFixedInformation;
import com.spring.vendingmachine.vending_machine.domain.avart.info.design.VendingMachineInformation;
import com.spring.vendingmachine.vending_machine.domain.avart.money.VendingMachineSimpleMoney;
import com.spring.vendingmachine.vending_machine.domain.avart.money.design.VendingMachineMoney;
import com.spring.vendingmachine.vending_machine.domain.avart.repository.VendingMachineDatabaseRepository;
import com.spring.vendingmachine.vending_machine.domain.avart.repository.design.VendingMachineRepository;
import com.spring.vendingmachine.vending_machine.domain.service.VendingMachineServiceImpl;
import com.spring.vendingmachine.vending_machine.domain.service.design.VendingMachineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendingMachineConfig {

    @Bean
    public VendingMachineService vendingMachineService() {
        return new VendingMachineServiceImpl(vendingMachineInformation(), vendingMachineMoney());
    }

    @Bean
    public VendingMachineRepository vendingMachineRepository() {
        return new VendingMachineDatabaseRepository();
    }

    @Bean
    public VendingMachineInformation vendingMachineInformation() {
        return new VendingMachineFixedInformation();
    }

    @Bean
    public VendingMachineMoney vendingMachineMoney() {
        return new VendingMachineSimpleMoney();
    }
}
