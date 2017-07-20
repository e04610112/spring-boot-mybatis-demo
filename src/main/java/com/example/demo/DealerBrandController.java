package com.example.demo;

import com.example.demo.dao.domain.DealerBrand;
import com.example.demo.service.DealerBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/queryAll")
    private List<DealerBrand> view() {
        return dealerBrandService.queryAllBand();

    }
    @RequestMapping("/insert")
    private void insert() {
         dealerBrandService.inserBean();
    }
}
