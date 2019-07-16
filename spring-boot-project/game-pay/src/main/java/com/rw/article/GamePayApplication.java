package com.rw.article;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
public class GamePayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamePayApplication.class, args);
		//loadYml();
	}


	/***
	 * 解析Properties 、xml
	 * */
	public static void loadProperties(){

		// 第一种
		Properties props = new Properties();
		//查找配置文件的属性 并且都合并到props
		FileSystemResource location = new FileSystemResource(new File("F:\\work\\unknown\\unknown-admin\\config\\application.properties"));
		try {
			PropertiesLoaderUtils.fillProperties(props, new EncodedResource(location, (String) null));
			System.out.println(props.getProperty("zookeeper.address"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		//第二种 spring boot的
		try {
			List<PropertySource<?>>  propertySourceList = new PropertiesPropertySourceLoader().load("app",new FileSystemResource("F:\\work\\unknown\\unknown-admin\\config\\application.properties"));
			System.out.println(propertySourceList.get(0).getProperty("zookeeper.address"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/***
	 * 目前从源码中找到的读取yml、yaml文件的两种方式
	 * */
	public static void loadYml(){
		// 第一种  spring boot解析yml https://blog.csdn.net/luckyrocks/article/details/79248016
		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		//yaml.setResources(new FileSystemResource("config.yml"));//File引入
		yaml.setResources(new ClassPathResource("/application-dev.yml"));//class引入
		System.out.println(yaml.getObject().get("spring.data.mongodb.uri"));



		//第二种  YamlPropertySourceLoader
		Resource resource = new ClassPathResource("/application-dev.yml");
		//List<Map<String, Object>> loaded = new OriginTrackedYamlLoader(resource).load();
		try {
			List<PropertySource<?>>  propertySourceList = new YamlPropertySourceLoader().load("/application.yml",resource);
			System.out.println(propertySourceList.get(0).getProperty("spring.data.mongodb.uri"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

}
