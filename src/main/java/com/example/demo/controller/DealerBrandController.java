package com.example.demo.controller;

import com.example.demo.dao.domain.DealerBrand;
import com.example.demo.service.DealerBrandService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuanjinglin on 17/6/30.
 * http://localhost:8080/dealerBrand/1
 */
@Api(description="提供品牌服务API")
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

    /**
     * 这种写法
     * 1 dataType 如果没有页面不显示bean,
     * 2 如果bean中写了@ApiModel bean也会不显示
     * @param dealerBrand
     */
    @ApiOperation(value="新增品牌", notes="新增品牌notes")
    @ApiImplicitParam(name = "dealerBrand", value = "实体DealerBrand", required = true, dataType = "DealerBrand")
    @RequestMapping(value="/insert",method= RequestMethod.POST)
    private void insert(@RequestBody DealerBrand dealerBrand) {
         dealerBrandService.inserBean(dealerBrand);
    }

    /**
     * param传参
     * @param brandName
     * @param orderId
     * 需要指定 paramType = "query"
     */
    @ApiOperation(value="新增品牌", notes="新增品牌notes")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "brandName", value = "品牌名brandName", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "orderId", value = "排序ID", required = true, dataType = "int",paramType = "query")
    })
    @RequestMapping(value="/insertByCode",method= RequestMethod.GET)
    private void insertByCode(@RequestParam("brandName") String brandName, @RequestParam("orderId")Integer orderId) {
        dealerBrandService.inserByCode(brandName,orderId);
    }

    /**
     *  ApiParam 方式注解 不需要写 dataType
     * @param dealerBrand
     */
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void add(@RequestBody
                      @ApiParam(name = "dealerBrand",value = "品牌",required = true)
                        DealerBrand dealerBrand){
        dealerBrandService.inserBean(dealerBrand);
    }
    /**
     *  ApiParam 方式注解 不需要写 dataType
     * @param
     */
    @ApiOperation(value="两个RequestParam")
    @RequestMapping(value="/add2",method = RequestMethod.GET)
    public void add2(
            @ApiParam(name = "brandName",value = "品牌",required = true)
            @RequestParam
            String brandName,
            @ApiParam(name="orderId",value="orderId",required=true)
            @RequestParam
            Integer orderId
                    ){
        dealerBrandService.inserByCode(brandName,orderId);
    }
    @ApiOperation(value="RequestBody,RequestParam两种参数")
    @RequestMapping(value="/add3",method = RequestMethod.POST)
    public void add3(
            @ApiParam(name = "brandName",value = "品牌",required = true)
            @RequestBody
            DealerBrand dealerBrand,
            @ApiParam(name="orderId",value="orderId",required=true)
            @RequestParam
            Integer orderId
    ){
        dealerBrandService.inserBean(dealerBrand);
    }
}
