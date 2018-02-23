package com.example.demo;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication//相当于@Configuration,@EnableAutoConfiguration,@ComponentScan
@ServletComponentScan//扫描原生Servlet3.0的注解进行配置、@WebServlet 、@WebListener、@WebFilte
@EnableTransactionManagement//开启注解事务
@EnableDiscoveryClient//服务发现注册
@EnableCircuitBreaker
@EnableHystrixDashboard
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
