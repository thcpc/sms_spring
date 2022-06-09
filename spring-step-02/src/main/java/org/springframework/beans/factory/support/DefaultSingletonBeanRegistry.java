package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String, Object> stringObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return this.stringObjects.get(beanName);
    }

    public void addSingleton(String name, Object singletonObject){
        this.stringObjects.put(name, singletonObject);
    }


}
