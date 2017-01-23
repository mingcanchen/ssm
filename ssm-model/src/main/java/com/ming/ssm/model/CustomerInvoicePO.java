package com.ming.ssm.model;

import java.util.Date;

public class CustomerInvoicePO {
    private Long sn;

    private String customerId;

    private String taxNum;

    private String bankName;

    private String bankNum;

    private String mobile;

    private String address;

    private String busLicUrl;

    private String custLicUrl;

    private String otherLicUrl;

    private String remark;

    private Short status;

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

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum == null ? null : taxNum.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum == null ? null : bankNum.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBusLicUrl() {
        return busLicUrl;
    }

    public void setBusLicUrl(String busLicUrl) {
        this.busLicUrl = busLicUrl == null ? null : busLicUrl.trim();
    }

    public String getCustLicUrl() {
        return custLicUrl;
    }

    public void setCustLicUrl(String custLicUrl) {
        this.custLicUrl = custLicUrl == null ? null : custLicUrl.trim();
    }

    public String getOtherLicUrl() {
        return otherLicUrl;
    }

    public void setOtherLicUrl(String otherLicUrl) {
        this.otherLicUrl = otherLicUrl == null ? null : otherLicUrl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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