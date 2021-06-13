package com.spring.vendingmachine.drink.database.VO;

import java.sql.Date;

public class DrinkTransactionVO {

    Long id = null;
    String transaction_type = null;
    Long recorded_money = null;
    Date recorded_date = null;
    Long product_id = null;
    Long user_id = null;
    Long vending_id = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public Long getRecorded_money() {
        return recorded_money;
    }

    public void setRecorded_money(Long recorded_money) {
        this.recorded_money = recorded_money;
    }

    public Date getRecorded_date() {
        return recorded_date;
    }

    public void setRecorded_date(Date recorded_date) {
        this.recorded_date = recorded_date;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getVending_id() {
        return vending_id;
    }

    public void setVending_id(Long vending_id) {
        this.vending_id = vending_id;
    }

    @Override
    public String toString() {
        return "DrinkTransactionVO{" +
                "id=" + id +
                ", transaction_type=" + transaction_type +
                ", recorded_money=" + recorded_money +
                ", recorded_date=" + recorded_date +
                ", product_id=" + product_id +
                ", user_id=" + user_id +
                ", vending_id=" + vending_id +
                '}';
    }
}
