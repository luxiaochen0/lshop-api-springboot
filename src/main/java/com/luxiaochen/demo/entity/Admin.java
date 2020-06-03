package com.luxiaochen.demo.entity;

public class Admin {
    private Integer id;

    private String username;

    private String phone;

    private String email;

    private String avatar;

    private String accessToken;

    private Byte status;

    public Admin(Integer id, String username, String phone, String email, String avatar, String accessToken, Byte status) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
        this.accessToken = accessToken;
        this.status = status;
    }

    public Admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}