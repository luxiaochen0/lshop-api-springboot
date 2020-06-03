package com.luxiaochen.demo.entity;

import java.math.BigDecimal;

public class OrderGoods {
    private Integer id;

    private Integer orderId;

    private Integer goodsId;

    private Integer goodsNum;

    private BigDecimal goodsPrice;

    private String goodsName;

    private String goodsImage;

    public OrderGoods(Integer id, Integer orderId, Integer goodsId, Integer goodsNum, BigDecimal goodsPrice, String goodsName, String goodsImage) {
        this.id = id;
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
        this.goodsName = goodsName;
        this.goodsImage = goodsImage;
    }

    public OrderGoods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }
}