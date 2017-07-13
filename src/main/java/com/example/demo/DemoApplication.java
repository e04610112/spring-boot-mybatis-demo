package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//相当于@Configuration,@EnableAutoConfiguration,@ComponentScan
@ServletComponentScan//扫描原生Servlet3.0的注解进行配置、@WebServlet 、@WebListener、@WebFilte
@EnableTransactionManagement
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
