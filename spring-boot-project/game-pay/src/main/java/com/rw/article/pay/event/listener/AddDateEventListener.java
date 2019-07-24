package com.rw.article.pay.event.listener;
import com.alibaba.fastjson.JSON;
import com.rw.article.pay.event.bean.AddDateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Zhou Zhong Qing
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 新增数据的事件监听
 * @date 2018/10/18 16:29
 */
@Component
public class AddDateEventListener {
    private static Logger log = LoggerFactory.getLogger(AddDateEventListener.class);

    /*
    * 在AnnotationConfigUtils#registerAnnotationConfigProcessors注册了BeanDefinition 对应的是EventListenerMethodProcessor对象   ， AnnotationConfigUtils在AnnotationConfigServletWebServerApplicationContext构造方法里被加载
    * */

 	/**
	 * DefaultListableBeanFactory#中preInstantiateSingletons -> (beanName为org.springframework.context.event.internalEventListenerProcessor时得到EventListenerMethodProcessor)EventListenerMethodProcessor#afterSingletonsInstantiated this.processBean(factories, beanName, type)
	 * 然后把要执行的方法封装为ApplicationListenerMethodAdapter -> 添加到listener中 AbstractApplicationEventMulticaster#addApplicationListener
	 * */
 	// 该方法在 ApplicationListenerMethodAdapter 利用反射执行
    /**
     * 处理新增数据的事件
     **/
    @EventListener
    public void handleAddEvent(AddDateEvent event) {
        log.info("发布的data为:{}  ", JSON.toJSONString(event));
        
    }
}
