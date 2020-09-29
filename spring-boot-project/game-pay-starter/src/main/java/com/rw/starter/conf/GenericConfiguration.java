package com.rw.starter.conf;

import com.rw.starter.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericConfiguration {
	@Bean
	public TestBean testBean(){
		System.out.println("创建TestBean对象");
		return new TestBean();
	}
}
