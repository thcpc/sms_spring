package org.springframework.beans.facotry.config;

public class BeanDefinition {
    private final Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
