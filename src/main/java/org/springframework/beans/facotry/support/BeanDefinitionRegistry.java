package org.springframework.beans.facotry.support;

import org.springframework.beans.facotry.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
