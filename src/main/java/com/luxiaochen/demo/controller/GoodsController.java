package com.luxiaochen.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luxiaochen.web.common.CustomException;
import com.luxiaochen.web.common.PageData;
import com.luxiaochen.demo.dao.GoodsMapper;
import com.luxiaochen.demo.entity.Goods;
import com.luxiaochen.demo.entity.GoodsExample;
import com.luxiaochen.demo.model.Goods1;
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
@RequestMapping("/goods")
public class GoodsController {

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

    @RequestMapping("")
    public PageData index(@RequestParam(value="page_no",required = false, defaultValue = "1") int page_no,@RequestParam(value="page_size",required = false, defaultValue = "10") int page_size){
        GoodsExample example=new GoodsExample();
        //example.createCriteria().andIdEqualTo(1);
        Page<Goods> page = PageHelper.startPage(page_no, page_size,true);
        List<Goods> list  = goodsMapper.selectByExample(example);

        PageData pageData=new PageData(page.getPageNum(),page.getPageNum(),page.getPages(), (int) page.getTotal(),list);

        return pageData;
    }

    @RequestMapping("/{id}")
    public Goods detail(@PathVariable int id){
        Goods goods=goodsMapper.selectByPrimaryKey(id);
        return goods;
    }

    @RequestMapping("/add")
    public int add(){
        Goods goods = new Goods();
        goods.setCateId(1);
        goods.setShopId(1);
        goods.setName("aaa");
        goods.setImage("https://");
        goods.setTitle("-");
        goods.setContent("sss");
        goods.setStock(999);
//        goods.setSale(1);
        goods.setMarketPrice(new BigDecimal("500.01"));
        goods.setShopPrice(new BigDecimal("100.02"));
        int res=goodsMapper.insertSelective(goods);
        return res;
    }

    @RequestMapping("/{id}/edit")
    public int edit(@PathVariable int id){
        Goods goods = new Goods();
        goods.setId(id);
        goods.setMarketPrice(new BigDecimal("500.41"));
        goods.setShopPrice(new BigDecimal("100.42"));
        int res=goodsMapper.updateByPrimaryKeySelective(goods);
        return res;
    }

    @RequestMapping("/{id}/delete")
    public int delete(@PathVariable int id){
        int res=goodsMapper.deleteByPrimaryKey(id);
        return res;
    }

    @RequestMapping("/redis")
    public String re(){
        redisTemplate.opsForValue().set("key", "value");
        System.out.println(redisTemplate.getConnectionFactory());
        return "redis";
    }
}
