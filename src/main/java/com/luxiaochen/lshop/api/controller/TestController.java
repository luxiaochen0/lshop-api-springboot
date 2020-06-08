package com.luxiaochen.lshop.api.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luxiaochen.lshop.api.model.Goods1;
import com.luxiaochen.lshop.config.ApiRestController;
import com.luxiaochen.lshop.dao.GoodsMapper;
import com.luxiaochen.lshop.entity.Goods;
import com.luxiaochen.lshop.entity.GoodsExample;
import com.luxiaochen.web.common.CustomException;
import com.luxiaochen.web.common.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
@ApiRestController()
public class TestController {

    @Autowired
    private GoodsMapper goodsMapper;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/test")
    public List Test() {
        //throw new BadRequestException("xxx");
        Goods1 goods=new Goods1(1,"苹果");
        List<Goods1> list=new ArrayList<>();
        list.add(new Goods1(1,"苹果"));
        list.add(new Goods1(2,"梨11313"));
        return list;
    }
    @RequestMapping("/test2")
    public String Test2() {
        throw new CustomException(400,"参数错误");
        //return "a";
    }

    @RequestMapping("/redis")
    public String re(){
        redisTemplate.opsForValue().set("key", "value");
        System.out.println(redisTemplate.getConnectionFactory());
        return "redis";
    }

    @RequestMapping("/jwt")
    public String jwt(){



        return "redis";
    }
}
