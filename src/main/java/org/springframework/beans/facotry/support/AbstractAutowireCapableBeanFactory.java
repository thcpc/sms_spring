package org.springframework.beans.facotry.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.facotry.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        this.addSingleton(beanName, bean);
        return bean;
    }
}
