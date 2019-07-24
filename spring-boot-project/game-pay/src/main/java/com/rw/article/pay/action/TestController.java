package com.rw.article.pay.action;

import com.rw.article.pay.event.bean.AddDateEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Zhou Zhong Qing
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 测试的controller
 * @date 2019/7/24 17:13
 */
@Controller
@RequestMapping("/test")
public class TestController {


	@Resource
	private ApplicationContext applicationContext;


	@ResponseBody
	@RequestMapping("/testListener")
	public String testListener(){
		applicationContext.publishEvent(new AddDateEvent(this,TestController.class,"test"));
		return "success";
	}
}
