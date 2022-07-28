package org.springframework.beans.facotry.support;

import org.springframework.beans.facotry.config.BeanDefinition;
import org.springframework.beans.facotry.BeanFactory;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory  {

    @Override
    public Object getBean(String name) {
        Object bean = getSingletonBean(name);
        if(null!=bean) return bean;
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return this.createBean(name,beanDefinition);

    }

    public abstract BeanDefinition getBeanDefinition(String beanName);
    public abstract Object createBean(String beanName,BeanDefinition beanDefinition);
}
