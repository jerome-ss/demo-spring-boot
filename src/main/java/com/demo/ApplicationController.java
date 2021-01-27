package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot启用类
 * Bean装配默认规则是根据Application类所在的包位置从上往下扫描
 * 
 * @author jerome
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
//@EnableScheduling
public class ApplicationController {

	public static void main(String[] args) {
		// 启动Spring Boot项目的唯一入口
		SpringApplication.run(ApplicationController.class, args);
	}

}
