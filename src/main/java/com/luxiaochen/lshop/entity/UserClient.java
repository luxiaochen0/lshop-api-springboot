package com.luxiaochen.lshop.entity;

import java.util.Date;

public class UserClient {
    private Integer id;

    private Integer userId;

    private String uuid;

    private String accessToken;

    private Date loginTime;

    private Date lastActiveTime;

    private String ip;

    public UserClient(Integer id, Integer userId, String uuid, String accessToken, Date loginTime, Date lastActiveTime, String ip) {
        this.id = id;
        this.userId = userId;
        this.uuid = uuid;
        this.accessToken = accessToken;
        this.loginTime = loginTime;
        this.lastActiveTime = lastActiveTime;
        this.ip = ip;
    }

    public UserClient() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}