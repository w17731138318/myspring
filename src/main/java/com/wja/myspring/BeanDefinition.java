package com.wja.myspring;

/**
 * Created by wangweixin on 16/10/10
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
