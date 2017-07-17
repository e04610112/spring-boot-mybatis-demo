package com.example.demo.service;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * 普通类测试
 * Created by yuanjinglin on 17/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//支持web
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//@ActiveProfiles(profiles = "test") 在测试类上面指定profiles，可以改变当前spring 的profile，来达到多环境的测试
public class DealerBrandServiceTest {
    @Autowired
    private DealerBrandService dealerBrandService;
    @Test
    public void testInserByCode() throws Exception {
        dealerBrandService.queryAllBand();

    }
}