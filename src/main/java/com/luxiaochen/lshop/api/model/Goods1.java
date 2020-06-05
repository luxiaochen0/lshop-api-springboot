package com.luxiaochen.lshop.api.model;

public class Goods1 {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Goods1(Integer id, String name){
        this.id=id;
        this.name=name;
    }
}
