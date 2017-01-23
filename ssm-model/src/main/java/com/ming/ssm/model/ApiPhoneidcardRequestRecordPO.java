package com.ming.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class ApiPhoneidcardRequestRecordPO {
    private Long sn;

    private String customerId;

    private String customerYwId;

    private String systemYwId;

    private String requestKey;

    private BigDecimal chargePrice;

    private String receiveTime;

    private String cacheRequestTime;

    private String dataFrom;

    private String apiId;

    private String apiRequestTime;

    private String apiResponseTime;

    private String doneTime;

    private Integer result;

    private String apiCode;

    private Date insertTime;

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

    public String getCustomerYwId() {
        return customerYwId;
    }

    public void setCustomerYwId(String customerYwId) {
        this.customerYwId = customerYwId == null ? null : customerYwId.trim();
    }

    public String getSystemYwId() {
        return systemYwId;
    }

    public void setSystemYwId(String systemYwId) {
        this.systemYwId = systemYwId == null ? null : systemYwId.trim();
    }

    public String getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(String requestKey) {
        this.requestKey = requestKey == null ? null : requestKey.trim();
    }

    public BigDecimal getChargePrice() {
        return chargePrice;
    }

    public void setChargePrice(BigDecimal chargePrice) {
        this.chargePrice = chargePrice;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime == null ? null : receiveTime.trim();
    }

    public String getCacheRequestTime() {
        return cacheRequestTime;
    }

    public void setCacheRequestTime(String cacheRequestTime) {
        this.cacheRequestTime = cacheRequestTime == null ? null : cacheRequestTime.trim();
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId == null ? null : apiId.trim();
    }

    public String getApiRequestTime() {
        return apiRequestTime;
    }

    public void setApiRequestTime(String apiRequestTime) {
        this.apiRequestTime = apiRequestTime == null ? null : apiRequestTime.trim();
    }

    public String getApiResponseTime() {
        return apiResponseTime;
    }

    public void setApiResponseTime(String apiResponseTime) {
        this.apiResponseTime = apiResponseTime == null ? null : apiResponseTime.trim();
    }

    public String getDoneTime() {
        return doneTime;
    }

    public void setDoneTime(String doneTime) {
        this.doneTime = doneTime == null ? null : doneTime.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode == null ? null : apiCode.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}