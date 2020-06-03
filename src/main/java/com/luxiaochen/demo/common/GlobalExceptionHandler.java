package com.luxiaochen.demo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseData jsonExceptionHandler(HttpServletRequest request, CustomException e) {
        return new ResponseData(e.getCode(),e.getMessage(),"");
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseData runtimeExceptionHandler(HttpServletRequest request, RuntimeException e) {
        return new ResponseData(500,e.getMessage(),"");
    }
}
