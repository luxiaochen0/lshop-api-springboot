package com.luxiaochen.lshop.config;

import com.luxiaochen.lshop.config.AdminRestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer
                .addPathPrefix("api",c -> c.isAnnotationPresent(RestController.class))
                .addPathPrefix("admin",c -> c.isAnnotationPresent(AdminRestController.class));

    }

}
