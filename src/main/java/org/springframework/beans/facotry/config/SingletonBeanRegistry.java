package org.springframework.beans.facotry.config;

public interface SingletonBeanRegistry {
    Object getSingletonBean(String name);
}
