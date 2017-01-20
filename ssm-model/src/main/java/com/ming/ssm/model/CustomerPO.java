package com.ming.ssm.model;

import java.util.Date;

/**
 * Created by chenmingcan on 2017/1/18.
 */
public class CustomerPO {
    private int sn; // '主键自增',
    private int custType;// '非空，用户类型默认为0，0:个人用户1：企业用户',
    private String customerId; // '非空，账号id唯一',
    private String customerPwd; //'非空，客户密码',
    private String customerName; //'账号名',
    private String email; // '注册邮箱，非空',
    private String phone; // '手机号',
    private String mobile; //座机',
    private int auditStatus; //'0' COMMENT '非空，默认为0，审核状态0：待审核（否）1：通过（是）2：不通过（否）',
    private int activation; //'0' COMMENT '非空，默认为0，激活状态，0：未激活 1：已激活',
    private int status;//'0' COMMENT '非空，默认为0，状态 0正常、1异常',
    private int payType;//'0' COMMENT '付费类型 0:预付费，1:后付费',
    private int chargeType; // '0' COMMENT '计费类型 0:提交计费，1:成功计费',
    private String financeId; //'财务id',
    private String insertTime;// '创建时间',
    private Date updateTime; // '修改时间',

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getCustType() {
        return custType;
    }

    public void setCustType(int custType) {
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

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getActivation() {
        return activation;
    }

    public void setActivation(int activation) {
        this.activation = activation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getChargeType() {
        return chargeType;
    }

    public void setChargeType(int chargeType) {
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
