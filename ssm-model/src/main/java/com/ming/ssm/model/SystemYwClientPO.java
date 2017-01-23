package com.ming.ssm.model;

import java.util.Date;

public class SystemYwClientPO {
    private Long sn;

    private String systemClientId;

    private String className;

    private Integer status;

    private String systemYwId;

    private String systemYwGroup;

    private String checkMethod;

    private String systemClientParam;

    private String insertTime;

    private Date updateTime;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getSystemClientId() {
        return systemClientId;
    }

    public void setSystemClientId(String systemClientId) {
        this.systemClientId = systemClientId == null ? null : systemClientId.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
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

    public String getSystemYwGroup() {
        return systemYwGroup;
    }

    public void setSystemYwGroup(String systemYwGroup) {
        this.systemYwGroup = systemYwGroup == null ? null : systemYwGroup.trim();
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod == null ? null : checkMethod.trim();
    }

    public String getSystemClientParam() {
        return systemClientParam;
    }

    public void setSystemClientParam(String systemClientParam) {
        this.systemClientParam = systemClientParam == null ? null : systemClientParam.trim();
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