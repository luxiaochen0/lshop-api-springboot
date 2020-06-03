package com.luxiaochen.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private String no;

    private String parentNo;

    private Byte status;

    private Integer shopId;

    private Byte payType;

    private Byte deliveryType;

    private BigDecimal goodsMoney;

    private BigDecimal deliveryMoney;

    private BigDecimal totalMoney;

    private BigDecimal payMoney;

    private String remark;

    private String payChannel;

    private String payChannelNo;

    private Date createTime;

    private Date payTime;

    private Date sendTime;

    private Date completeTime;

    public Order(Integer id, String no, String parentNo, Byte status, Integer shopId, Byte payType, Byte deliveryType, BigDecimal goodsMoney, BigDecimal deliveryMoney, BigDecimal totalMoney, BigDecimal payMoney, String remark, String payChannel, String payChannelNo, Date createTime, Date payTime, Date sendTime, Date completeTime) {
        this.id = id;
        this.no = no;
        this.parentNo = parentNo;
        this.status = status;
        this.shopId = shopId;
        this.payType = payType;
        this.deliveryType = deliveryType;
        this.goodsMoney = goodsMoney;
        this.deliveryMoney = deliveryMoney;
        this.totalMoney = totalMoney;
        this.payMoney = payMoney;
        this.remark = remark;
        this.payChannel = payChannel;
        this.payChannelNo = payChannelNo;
        this.createTime = createTime;
        this.payTime = payTime;
        this.sendTime = sendTime;
        this.completeTime = completeTime;
    }

    public Order() {
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

    public String getParentNo() {
        return parentNo;
    }

    public void setParentNo(String parentNo) {
        this.parentNo = parentNo == null ? null : parentNo.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Byte deliveryType) {
        this.deliveryType = deliveryType;
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public BigDecimal getDeliveryMoney() {
        return deliveryMoney;
    }

    public void setDeliveryMoney(BigDecimal deliveryMoney) {
        this.deliveryMoney = deliveryMoney;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayChannelNo() {
        return payChannelNo;
    }

    public void setPayChannelNo(String payChannelNo) {
        this.payChannelNo = payChannelNo == null ? null : payChannelNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }
}