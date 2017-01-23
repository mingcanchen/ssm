package com.ming.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerYwInfoPO {
    private Long sn;

    private String customerYwId;

    private String customerYwName;

    private String customerYwPwd;

    private String customerId;

    private BigDecimal price;

    private Integer status;

    private String systemYwId;

    private String insertTime;

    private Date updateTime;

    private Integer delStatus;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getCustomerYwId() {
        return customerYwId;
    }

    public void setCustomerYwId(String customerYwId) {
        this.customerYwId = customerYwId == null ? null : customerYwId.trim();
    }

    public String getCustomerYwName() {
        return customerYwName;
    }

    public void setCustomerYwName(String customerYwName) {
        this.customerYwName = customerYwName == null ? null : customerYwName.trim();
    }

    public String getCustomerYwPwd() {
        return customerYwPwd;
    }

    public void setCustomerYwPwd(String customerYwPwd) {
        this.customerYwPwd = customerYwPwd == null ? null : customerYwPwd.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSystemYwId() {
        return systemYwId;
    }

    public void setSystemYwId(String systemYwId) {
        this.systemYwId = systemYwId == null ? null : systemYwId.trim();
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

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
}