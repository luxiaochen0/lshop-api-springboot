package com.luxiaochen.lshop.api.config;

import com.luxiaochen.lshop.api.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean                                        // 此处返回的是一个Spring的配置Bean，与xml的“<bean>”等价
    public UserServiceImpl getUserService() {    // 方法名称随便写
        return new UserServiceImpl() ;
    }
}
