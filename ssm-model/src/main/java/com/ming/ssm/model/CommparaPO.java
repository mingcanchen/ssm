package com.ming.ssm.model;

public class CommparaPO {
    private Long sn;

    private String paraCode;

    private String paraName;

    private String paraKey;

    private String paraValue;

    private Short remark;

    private String paraDesc;

    private Integer sortNo;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getParaCode() {
        return paraCode;
    }

    public void setParaCode(String paraCode) {
        this.paraCode = paraCode == null ? null : paraCode.trim();
    }

    public String getParaName() {
        return paraName;
    }

    public void setParaName(String paraName) {
        this.paraName = paraName == null ? null : paraName.trim();
    }

    public String getParaKey() {
        return paraKey;
    }

    public void setParaKey(String paraKey) {
        this.paraKey = paraKey == null ? null : paraKey.trim();
    }

    public String getParaValue() {
        return paraValue;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue == null ? null : paraValue.trim();
    }

    public Short getRemark() {
        return remark;
    }

    public void setRemark(Short remark) {
        this.remark = remark;
    }

    public String getParaDesc() {
        return paraDesc;
    }

    public void setParaDesc(String paraDesc) {
        this.paraDesc = paraDesc == null ? null : paraDesc.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
}