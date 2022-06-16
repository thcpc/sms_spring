package org.springframework.beans.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory{
        BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
