package org.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionsMaps = new ConcurrentHashMap<>();


    public Object getBean(String beanName){
        return beanDefinitionsMaps.get(beanName);
    }

    public void registerBeanDefinition(String beanName, Object bean){
        beanDefinitionsMaps.put(beanName, new BeanDefinition(bean));
    }


}
