package com.luxiaochen.lshop.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer id;

    private Integer cateId;

    private Integer shopId;

    private String name;

    private String image;

    private String title;

    private String content;

    private Integer stock;

    private Integer sale;

    private BigDecimal marketPrice;

    private BigDecimal shopPrice;

    public Goods(Integer id, Integer cateId, Integer shopId, String name, String image, String title, String content, Integer stock, Integer sale, BigDecimal marketPrice, BigDecimal shopPrice) {
        this.id = id;
        this.cateId = cateId;
        this.shopId = shopId;
        this.name = name;
        this.image = image;
        this.title = title;
        this.content = content;
        this.stock = stock;
        this.sale = sale;
        this.marketPrice = marketPrice;
        this.shopPrice = shopPrice;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }
}