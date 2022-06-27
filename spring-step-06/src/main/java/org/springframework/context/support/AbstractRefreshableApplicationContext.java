package org.springframework.context.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.DefaultListableBeanFactory;

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
    private DefaultListableBeanFactory beanFactory;


    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = this.createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {return new DefaultListableBeanFactory();}

    protected  abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    protected ConfigurableListableBeanFactory getBeanFactory(){return beanFactory;}
}
