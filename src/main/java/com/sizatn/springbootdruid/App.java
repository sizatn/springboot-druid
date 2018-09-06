package com.sizatn.springbootdruid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		DruidDataSource bean = ctx.getBean(DruidDataSource.class);
		System.out.println(bean.isOracle());
	}
}
