package com.luxiaochen.demo.entity;

import java.util.Date;

public class LogUserRequest {
    private Integer id;

    private Date time;

    private String uuid;

    private String device;

    private String version;

    private String ip;

    private String requestMethod;

    private String requestUrl;

    private String requestData;

    private String responseCode;

    private String responseBody;

    public LogUserRequest(Integer id, Date time, String uuid, String device, String version, String ip, String requestMethod, String requestUrl, String requestData, String responseCode, String responseBody) {
        this.id = id;
        this.time = time;
        this.uuid = uuid;
        this.device = device;
        this.version = version;
        this.ip = ip;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
        this.requestData = requestData;
        this.responseCode = responseCode;
        this.responseBody = responseBody;
    }

    public LogUserRequest() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData == null ? null : requestData.trim();
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode == null ? null : responseCode.trim();
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody == null ? null : responseBody.trim();
    }
}