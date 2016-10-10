package com.wja.myspring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangweixin on 16/10/10.
 * BeanFactory
 */
public class BeanFactory {

    /**
     * 容器:存储各种bean
     */
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    /**
     * 根据beanName获取bean
     * @param beanName
     * @return
     */
    public Object getBean(String beanName){
        return beanDefinitionMap.get(beanName).getBean();
    }

    /**
     * 将bean放入beanDefinitionMap
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition){
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
