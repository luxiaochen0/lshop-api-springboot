package com.luxiaochen.lshop.entity;

public class Cart extends CartKey {
    private Integer goodsNum;

    private Byte isCheck;

    public Cart(Integer userId, Integer goodsId, Integer goodsNum, Byte isCheck) {
        super(userId, goodsId);
        this.goodsNum = goodsNum;
        this.isCheck = isCheck;
    }

    public Cart() {
        super();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Byte getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }
}