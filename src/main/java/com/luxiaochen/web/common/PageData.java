package com.luxiaochen.web.common;

public class PageData {

    private final int pageNo;
    private final int pageSize;
    private final int totalPage;
    private final int totalCount;
    private final Object data;

    public PageData(int pageNo, int pageSize, int totalPage, int totalCount, Object data) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
        this.totalCount = totalCount;
        this.data = data;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public Object getData() {
        return data;
    }
}
