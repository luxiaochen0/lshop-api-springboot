package com.luxiaochen.lshop.api.controller;

import com.luxiaochen.lshop.api.service.IUserService;
import com.luxiaochen.lshop.config.ApiRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@ApiRestController()
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login(){
        String token=userService.login();
        return token;
    }
}
