package com.luxiaochen.demo.common;

public class ResponseData {

    private final Integer code;
    private final String msg;
    private final Object data;

    public ResponseData(Integer code, String msg, Object data) {
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
