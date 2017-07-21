package com.example.demo.controller;

import com.example.demo.dao.domain.DealerBrand;
import com.example.demo.service.DealerBrandService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuanjinglin on 17/6/30.
 * http://localhost:8080/dealerBrand/1
 */
@RestController
@RequestMapping("/dealerBrand")
public class DealerBrandController {
    @Autowired
    private DealerBrandService dealerBrandService;
    @ApiOperation(value="查询所有品牌", notes="查询所有品牌notes")
    @RequestMapping(value="/queryAll" ,method= RequestMethod.GET)
    private List<DealerBrand> view() {
        return dealerBrandService.queryAllBand();

    }
    @ApiOperation(value="新增品牌", notes="新增品牌notes")
    @ApiImplicitParam(name = "dealerBrand", value = "实体DealerBrand", required = true, dataType = "DealerBrand")
    @RequestMapping(value="/insert",method= RequestMethod.POST)
    private void insert(@RequestBody DealerBrand dealerBrand) {
         dealerBrandService.inserBean(dealerBrand);
    }

    @ApiOperation(value="新增品牌", notes="新增品牌notes")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "brandName", value = "品牌名brandName", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderId", value = "排序ID", required = true, dataType = "Integer",paramType = "query")
    })
    @RequestMapping(value="/insertByCode",method= RequestMethod.GET)
    private void insertByCode(@RequestParam("brandName") String brandName, @RequestParam("orderId")Integer orderId) {
        dealerBrandService.inserByCode(brandName,orderId);
    }
}
