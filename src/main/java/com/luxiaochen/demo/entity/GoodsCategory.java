package com.luxiaochen.demo.entity;

public class GoodsCategory {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer sort;

    public GoodsCategory(Integer id, Integer parentId, String name, Integer sort) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.sort = sort;
    }

    public GoodsCategory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}