package com.spring.vendingmachine.drink_application.database.VO;

import java.sql.Date;

public class DrinkApplicationHistoryKeyVO {

    Long application_history_id = null;
    Long issue_id = null;

    public Long getApplication_history_id() {
        return application_history_id;
    }

    public void setApplication_history_id(Long application_history_id) {
        this.application_history_id = application_history_id;
    }

    public Long getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(Long issue_id) {
        this.issue_id = issue_id;
    }

    @Override
    public String toString() {
        return "DrinkApplicationHistoryKeyVO{" +
                "application_history_id=" + application_history_id +
                ", issue_id=" + issue_id +
                '}';
    }
}
