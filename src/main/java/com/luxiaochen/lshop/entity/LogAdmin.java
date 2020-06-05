package com.luxiaochen.lshop.entity;

import java.util.Date;

public class LogAdmin {
    private Integer id;

    private Integer adminId;

    private Integer uuid;

    private Date time;

    private String operate;

    private String object;

    private String originContent;

    private String newContent;

    private String errorCode;

    private String errorInfo;

    public LogAdmin(Integer id, Integer adminId, Integer uuid, Date time, String operate, String object, String originContent, String newContent, String errorCode, String errorInfo) {
        this.id = id;
        this.adminId = adminId;
        this.uuid = uuid;
        this.time = time;
        this.operate = operate;
        this.object = object;
        this.originContent = originContent;
        this.newContent = newContent;
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    public LogAdmin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
    }

    public String getOriginContent() {
        return originContent;
    }

    public void setOriginContent(String originContent) {
        this.originContent = originContent == null ? null : originContent.trim();
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo == null ? null : errorInfo.trim();
    }
}