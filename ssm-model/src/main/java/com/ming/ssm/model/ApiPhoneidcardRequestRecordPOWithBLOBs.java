package com.ming.ssm.model;

public class ApiPhoneidcardRequestRecordPOWithBLOBs extends ApiPhoneidcardRequestRecordPO {
    private String requestData;

    private String apiData;

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData == null ? null : requestData.trim();
    }

    public String getApiData() {
        return apiData;
    }

    public void setApiData(String apiData) {
        this.apiData = apiData == null ? null : apiData.trim();
    }
}