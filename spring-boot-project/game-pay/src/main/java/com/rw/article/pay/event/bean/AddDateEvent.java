package com.rw.article.pay.event.bean;

import org.springframework.context.ApplicationEvent;

/**
 * @author Zhou Zhong Qing
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 新增mongodb数据事件
 * @date 2018/10/18 16:26
 */
public class AddDateEvent extends ApplicationEvent {

    public AddDateEvent(Object source) {
        super(source);
    }
    public AddDateEvent(Object source, Class clz, Object data) {
        super(source);
        this.clz = clz;
        this.data = data;
    }

    public AddDateEvent(Object source, Class clz, Object data, String modelName, String userAgent) {
        super(source);
        this.clz = clz;
        this.data = data;
        this.modelName = modelName;
        this.userAgent = userAgent;
    }



    /** 要更新的表对象 **/
    private Class clz;

    /** 操作的数据**/
    private Object data;


    /** 模块名称**/
    private String modelName;

    /** 浏览器标识 **/
    private String userAgent;


    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
