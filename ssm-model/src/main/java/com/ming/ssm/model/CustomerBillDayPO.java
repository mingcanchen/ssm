package com.ming.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerBillDayPO {
    private Long sn;

    private String systemYwId;

    private String customerYwId;

    private String customerId;

    private Long useAllNum;

    private Long useTNum;

    private Long useFNum;

    private BigDecimal balance;

    private Date inDate;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getSystemYwId() {
        return systemYwId;
    }

    public void setSystemYwId(String systemYwId) {
        this.systemYwId = systemYwId == null ? null : systemYwId.trim();
    }

    public String getCustomerYwId() {
        return customerYwId;
    }

    public void setCustomerYwId(String customerYwId) {
        this.customerYwId = customerYwId == null ? null : customerYwId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Long getUseAllNum() {
        return useAllNum;
    }

    public void setUseAllNum(Long useAllNum) {
        this.useAllNum = useAllNum;
    }

    public Long getUseTNum() {
        return useTNum;
    }

    public void setUseTNum(Long useTNum) {
        this.useTNum = useTNum;
    }

    public Long getUseFNum() {
        return useFNum;
    }

    public void setUseFNum(Long useFNum) {
        this.useFNum = useFNum;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }
}