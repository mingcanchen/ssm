package com.ming.ssm.model;

import java.util.Date;

public class SmsTplPO {
    private Long sn;

    private Short smsApply;

    private String smsName;

    private Short smsType;

    private String smsApplyId;

    private String customerId;

    private String smsMsg;

    private String applyMsg;

    private Short status;

    private String insertTime;

    private Date updateTime;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Short getSmsApply() {
        return smsApply;
    }

    public void setSmsApply(Short smsApply) {
        this.smsApply = smsApply;
    }

    public String getSmsName() {
        return smsName;
    }

    public void setSmsName(String smsName) {
        this.smsName = smsName == null ? null : smsName.trim();
    }

    public Short getSmsType() {
        return smsType;
    }

    public void setSmsType(Short smsType) {
        this.smsType = smsType;
    }

    public String getSmsApplyId() {
        return smsApplyId;
    }

    public void setSmsApplyId(String smsApplyId) {
        this.smsApplyId = smsApplyId == null ? null : smsApplyId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getSmsMsg() {
        return smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg == null ? null : smsMsg.trim();
    }

    public String getApplyMsg() {
        return applyMsg;
    }

    public void setApplyMsg(String applyMsg) {
        this.applyMsg = applyMsg == null ? null : applyMsg.trim();
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