package org.springframework.beans.factory.config;

import org.springframework.beans.factory.HierarchicalBeanFactory;

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";
}
