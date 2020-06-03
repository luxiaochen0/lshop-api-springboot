package com.luxiaochen.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Balance {
    private Integer id;

    private String no;

    private Integer shopid;

    private Byte action;

    private Byte type;

    private BigDecimal money;

    private BigDecimal moneyAfter;

    private String remark;

    private Date time;

    public Balance(Integer id, String no, Integer shopid, Byte action, Byte type, BigDecimal money, BigDecimal moneyAfter, String remark, Date time) {
        this.id = id;
        this.no = no;
        this.shopid = shopid;
        this.action = action;
        this.type = type;
        this.money = money;
        this.moneyAfter = moneyAfter;
        this.remark = remark;
        this.time = time;
    }

    public Balance() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getMoneyAfter() {
        return moneyAfter;
    }

    public void setMoneyAfter(BigDecimal moneyAfter) {
        this.moneyAfter = moneyAfter;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}