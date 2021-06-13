package com.spring.vendingmachine.drink.database.VO;

public class DrinkVO {

    Long id = null;
    String drink_name = null;
    Long drink_price = null;
    String manufacturer = null;
    Long issue_id = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public Long getDrink_price() {
        return drink_price;
    }

    public void setDrink_price(Long drink_price) {
        this.drink_price = drink_price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(Long issue_id) {
        this.issue_id = issue_id;
    }

    @Override
    public String toString() {
        return "DrinkVO{" +
                "id=" + id +
                ", drink_name='" + drink_name + '\'' +
                ", drink_price=" + drink_price +
                ", manufacturer='" + manufacturer + '\'' +
                ", issue_id=" + issue_id +
                '}';
    }
}
