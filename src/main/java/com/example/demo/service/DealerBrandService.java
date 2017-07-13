package com.example.demo.service;

import com.example.demo.dao.domain.DealerBrand;
import com.example.demo.dao.mapper.DealerBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yuanjinglin on 17/7/11.
 */
@Service("dealerBrandService")
public class DealerBrandService {
    @Autowired
    private DealerBrandMapper dealerBrandMapper;
    public List<DealerBrand> queryAllBand(){
        List<DealerBrand> list=dealerBrandMapper.queryAllBand();
        return list;
    }

    /**
     * propagation = Propagation.REQUIRED 指定事务传播特性
     * isolation = Isolation.DEFAULT 指定隔离级别
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void inserBean(){
        DealerBrand dealerBrand=new DealerBrand();
        dealerBrand.setBrand("果味水");
        dealerBrand.setOrderId(3);
        dealerBrand.setStatus(1);
        dealerBrandMapper.insert(dealerBrand);
        throw  new RuntimeException("故意的");

    }

    public void inserByCode(){
        dealerBrandMapper.insertByCode("力量帝",2,1);
    }
}
