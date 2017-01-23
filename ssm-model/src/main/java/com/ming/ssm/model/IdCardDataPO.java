package com.ming.ssm.model;

import java.util.Date;

public class IdCardDataPO {
    private Long sn;

    private String idcard;

    private String name;

    private String insertTime;

    private Date updateTime;

    private String keyEleAuthz;

    private Integer result;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getKeyEleAuthz() {
        return keyEleAuthz;
    }

    public void setKeyEleAuthz(String keyEleAuthz) {
        this.keyEleAuthz = keyEleAuthz == null ? null : keyEleAuthz.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}