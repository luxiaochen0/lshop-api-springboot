package com.luxiaochen.demo.common;

/**
 * 自定义异常处理
 */
public class CustomException extends RuntimeException{
    private static final long serialVersionUID = -6987820169478671586L;

    private int code;
    //异常信息
    private String message;

    //构造器
    public CustomException(int code,String message){
        super(message);
        this.code=code;
        this.message=message;
    }
    @Override
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
