package com.rw.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamePayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamePayApplication.class, args);
	}


	/*
	*如果加入JPA不配置可能报错Hikari是因为 DataSourceAutoConfiguration 会自动注入初始化
	* */


}
