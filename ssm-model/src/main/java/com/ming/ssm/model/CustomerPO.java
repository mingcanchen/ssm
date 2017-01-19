package com.ming.ssm.model;

import java.util.Date;

/**
 * Created by chenmingcan on 2017/1/18.
 */
public class CustomerPO {
    private int sn; // '主键自增',
    private String custType;// '非空，用户类型默认为0，0:个人用户1：企业用户',
    private String customerId; // '非空，账号id唯一',
    private String customerPwd; //'非空，客户密码',
    private String customerName; //'账号名',
    private String email; // '注册邮箱，非空',
    private String phone; // '手机号',
    private String mobile; //座机',
    private String auditStatus; //'0' COMMENT '非空，默认为0，审核状态0：待审核（否）1：通过（是）2：不通过（否）',
    private String activation; //'0' COMMENT '非空，默认为0，激活状态，0：未激活 1：已激活',
    private String status;//'0' COMMENT '非空，默认为0，状态 0正常、1异常',
    private String payType;//'0' COMMENT '付费类型 0:预付费，1:后付费',
    private String chargeType; // '0' COMMENT '计费类型 0:提交计费，1:成功计费',
    private String financeId; //'财务id',
    private String insertTime;// '创建时间',
    private Date updateTime; // '修改时间',

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getFinanceId() {
        return financeId;
    }

    public void setFinanceId(String financeId) {
        this.financeId = financeId;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
