package com.ming.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerBalanceWarningPO {
    private Long sn;

    private String customerId;

    private BigDecimal balanceWarning;

    private String phone;

    private String email;

    private String insertTime;

    private Date updateTime;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public BigDecimal getBalanceWarning() {
        return balanceWarning;
    }

    public void setBalanceWarning(BigDecimal balanceWarning) {
        this.balanceWarning = balanceWarning;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime == null ? null : insertTime.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}