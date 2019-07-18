package com.rw.article.common.configuration;

/**
 * @author Zhou Zhong Qing
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 条件注解的测试
 * @date 2019/7/18 9:49
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnProperty(prefix ="study", name="enable" , havingValue="true") // 当有了study.enable属性  ConditionalOnPropertyConfiguration 才会被创建
public class ConditionalOnPropertyConfiguration {

	public ConditionalOnPropertyConfiguration(){
		System.out.println("ConditionalOnPropertyConfiguration ");
	}


	@Value("${study.enable}")
	private String enable;


	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}
}
