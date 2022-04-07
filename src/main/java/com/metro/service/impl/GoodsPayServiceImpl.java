package com.metro.service.impl;
import com.metro.mapper.GoodsPayMapper;
import com.metro.pojo.Goods;
import com.metro.service.GoodsPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsPayServiceImpl implements GoodsPayService {
    @Autowired
    GoodsPayMapper goodsPayMapper;
    @Override
    public int insertBuyGoods(Map map) {
        return goodsPayMapper.insertBuyGoods(map);
    }

    @Override
    public List<Goods> findMyGoods(String uid) {
        return goodsPayMapper.findMyGoods(uid);
    }

    @Override
    public List<Goods> findAllGoodsPay() {
        return goodsPayMapper.findAllGoodsPay();
    }

    @Override
    public List<Goods> findAllGoodsPayByPage(int satrt, int pagesize) {
        return goodsPayMapper.findAllGoodsPayByPage(satrt, pagesize);
    }
}
