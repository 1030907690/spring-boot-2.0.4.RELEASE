package com.rw.starter.conf;

import com.rw.starter.bean.TestBean;
import com.rw.starter.init.ApplicationInitialize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterGenericConfiguration {
	@Bean
	public TestBean testBean(){
		System.out.println("创建TestBean对象");
		return new TestBean();
	}

	@Bean
	public ApplicationInitialize applicationInitialize(){
		return new ApplicationInitialize();
	}
}
