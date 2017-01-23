package com.ming.ssm.model;

public class TrackingSmsPO {
    private Long sn;

    private String phone;

    private String code;

    private Short smsType;

    private String sendDate;

    private String smsMsg;

    private String resultMsg;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Short getSmsType() {
        return smsType;
    }

    public void setSmsType(Short smsType) {
        this.smsType = smsType;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate == null ? null : sendDate.trim();
    }

    public String getSmsMsg() {
        return smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg == null ? null : smsMsg.trim();
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg == null ? null : resultMsg.trim();
    }
}