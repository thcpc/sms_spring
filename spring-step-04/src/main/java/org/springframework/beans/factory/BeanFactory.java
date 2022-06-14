package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    Object getBean(String name, Object... args) throws BeansException;
}
