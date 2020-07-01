package com.luxiaochen.lshop.api.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.luxiaochen.web.common.CustomException;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class UserServiceImpl implements IUserService {
    @Override
    public String login() {
        return "login";
    }

    @Override
    public String create() {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.MONTH,3);
        String token= JWT.create()
                .withIssuer("lshop")
                .withSubject("API")
                .withAudience("ALL")
                .withExpiresAt(c.getTime())
                .withNotBefore(new Date())
                .withIssuedAt(new Date())
                .withJWTId(UUID.randomUUID().toString())
                .withClaim("uid",12345)
                .sign(Algorithm.HMAC256("aosjusnmnklodius"));
        return token;
    }

    @Override
    public String verify() {
        String token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBUEkiLCJhdWQiOiJBTEwiLCJ1aWQiOiIxMjM0NSIsIm5iZiI6MTU5MzYyMzI2NywiaXNzIjoibHNob3AiLCJleHAiOjE2MDE1NzIwNjcsImlhdCI6MTU5MzYyMzI2NywianRpIjoiYjA3ZWM1N2QtNWYxMi00MjlkLWJhMTktMmQyYTEyOTk3YjY1In0.1dnHgQHB0F2Zyg4TVsd4inHdAMy_ljIrx7PVzcDWSeg";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("aosjusnmnklodius")).build();
        DecodedJWT d;
        try{
            d=jwtVerifier.verify(token);
        }catch(Exception e){
            throw new CustomException(401,"登录失效");
        }
        return d.getClaim("uid").asString();
    }
}
