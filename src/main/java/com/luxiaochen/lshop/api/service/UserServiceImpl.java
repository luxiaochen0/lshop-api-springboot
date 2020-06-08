package com.luxiaochen.lshop.api.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;

public class UserServiceImpl implements IUserService {
    @Override
    public String login() {
        String token="";
        long time=Calendar.getInstance().getTimeInMillis();
        token= JWT.create().withAudience(Long.toString(time))
                .sign(Algorithm.HMAC256("xxx"));
        return token;
    }
}
