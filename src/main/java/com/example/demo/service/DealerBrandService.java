package com.example.demo.service;

import com.example.demo.dao.domain.DealerBrand;
import com.example.demo.dao.mapper.DealerBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void inserBean(){
        DealerBrand dealerBrand=new DealerBrand();
        dealerBrand.setBrand("果味水");
        dealerBrand.setOrderId(3);
        dealerBrand.setStatus(1);
        dealerBrandMapper.insert(dealerBrand);

    }
    public void inserByCode(){
        dealerBrandMapper.insertByCode("力量帝",2,1);
    }
}
