package com.xbj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement//开启事务管理
@MapperScan("com.xbj.website.dao")
public class ApplicationStart extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

	/**
	 * 用于部署服务器
	 */
	/*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SpringBootApplication.class);
    } */
}
