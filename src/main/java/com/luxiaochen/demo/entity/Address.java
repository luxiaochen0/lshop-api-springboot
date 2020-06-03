package com.luxiaochen.demo.entity;

public class Address {
    private Integer id;

    private String username;

    private String phone;

    private Integer provinceId;

    private Integer cityId;

    private Integer districtId;

    private String address;

    private Byte isDefault;

    public Address(Integer id, String username, String phone, Integer provinceId, Integer cityId, Integer districtId, String address, Byte isDefault) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.districtId = districtId;
        this.address = address;
        this.isDefault = isDefault;
    }

    public Address() {
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

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }
}