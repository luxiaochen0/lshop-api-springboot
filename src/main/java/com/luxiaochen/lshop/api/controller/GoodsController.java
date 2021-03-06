package com.luxiaochen.lshop.api.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luxiaochen.lshop.config.ApiRestController;
import com.luxiaochen.web.common.CustomException;
import com.luxiaochen.web.common.PageData;
import com.luxiaochen.lshop.dao.GoodsMapper;
import com.luxiaochen.lshop.entity.Goods;
import com.luxiaochen.lshop.entity.GoodsExample;
import com.luxiaochen.lshop.api.model.Goods1;
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
@ApiRestController()
public class GoodsController {

    @Autowired
    private GoodsMapper goodsMapper;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

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

}
