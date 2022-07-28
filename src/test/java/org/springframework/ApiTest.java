package org.springframework;

import org.springframework.bean.UserService;
import org.springframework.beans.facotry.config.BeanDefinition;
import org.springframework.beans.facotry.support.DefaultListableBeanFactory;

import org.testng.annotations.Test;

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.再次获取bean
        UserService userService_singleton = (UserService) beanFactory.getSingletonBean("userService");
        userService.queryUserInfo();

        assert userService==userService_singleton;
    }
}
