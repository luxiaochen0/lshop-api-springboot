package com.luxiaochen.lshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.luxiaochen.lshop","com.luxiaochen.web"})
@MapperScan("com.luxiaochen.lshop.dao")
public class LshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LshopApplication.class, args);
    }

}
