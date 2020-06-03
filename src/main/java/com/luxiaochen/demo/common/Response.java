package com.luxiaochen.demo.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class Response implements ResponseBodyAdvice<Object> {
    //这个方法用来判断是否要执行beforeBodyWrite方法。
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        //在实际项目中可以添加注解来判断哪些需要进行数据的修改
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        //返回封装的数据
        ResponseData data;
        if(o instanceof ResponseData){//异常信息已经处理过响应了
            data=(ResponseData)o;
        }else{//处理响应
            data=new ResponseData(200,"ok",o);
        }
        //因为handler处理类的返回类型是String，为了保证一致性，这里需要将结果转为json字符串。实际上很少直接返回String。
        if(o instanceof String) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(data);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
