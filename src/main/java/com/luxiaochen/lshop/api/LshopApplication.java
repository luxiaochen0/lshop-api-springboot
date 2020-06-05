package com.luxiaochen.lshop.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luxiaochen.lshop")
public class LshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LshopApplication.class, args);
    }

}
