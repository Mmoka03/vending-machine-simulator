package com.spring.vendingmachine.user.database.VO;

public class UserVO {

    Long id = null;
    String user_name = null;
    Long possession_money = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getPossession_money() {
        return possession_money;
    }

    public void setPossession_money(Long possession_money) {
        this.possession_money = possession_money;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", possession_money=" + possession_money +
                '}';
    }
}
