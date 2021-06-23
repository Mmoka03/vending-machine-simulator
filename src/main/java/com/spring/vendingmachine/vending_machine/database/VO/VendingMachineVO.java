package com.spring.vendingmachine.vending_machine.database.VO;

public class VendingMachineVO {

    Long id = null;
    Long holding_amount = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHolding_amount() {
        return holding_amount;
    }

    public void setHolding_amount(Long holding_amount) {
        this.holding_amount = holding_amount;
    }

    @Override
    public String toString() {
        return "VendingMachineVO{" +
                "id=" + id +
                ", holding_amount=" + holding_amount +
                '}';
    }
}
