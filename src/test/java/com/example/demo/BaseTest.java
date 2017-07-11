package com.example.demo;

import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yuanjinglin on 17/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Config.class )
//@WebIntegrationTest({"server.port=0","management.port=0"})
@ActiveProfiles("test")
public abstract class BaseTest {
}


