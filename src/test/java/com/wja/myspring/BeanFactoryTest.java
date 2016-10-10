package com.wja.myspring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangweixin on 16/10/10.
 */
public class BeanFactoryTest {

    @Test
    public void test(){
        /**
         * 1.初始化BeanFactory
         */
        BeanFactory beanFactory = new BeanFactory();
        /**
         * 2.注入bean
         */
        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("HelloService",beanDefinition);
        /**
         * 3.获取bean
         */
        HelloService helloService= (HelloService) beanFactory.getBean("HelloService");
        helloService.sayHello();
    }

}