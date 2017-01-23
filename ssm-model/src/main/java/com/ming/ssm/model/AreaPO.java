package com.ming.ssm.model;

public class AreaPO {
    private Long sn;

    private String areaId;

    private String areaName;

    private String enName;

    private String shortName;

    private String upAreaId;

    private String areaLevel;

    private Integer sortNo;

    private String isCity;

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getUpAreaId() {
        return upAreaId;
    }

    public void setUpAreaId(String upAreaId) {
        this.upAreaId = upAreaId == null ? null : upAreaId.trim();
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel == null ? null : areaLevel.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getIsCity() {
        return isCity;
    }

    public void setIsCity(String isCity) {
        this.isCity = isCity == null ? null : isCity.trim();
    }
}