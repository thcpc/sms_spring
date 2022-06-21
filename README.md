# sms_spring
smple code for study spring
# 基础的设计思路[step01-step03]
## 容器包含如下行为
- 注册 Bean 信息
- 获取 Bean 信息
- 根据 Bean 信息, 创建 Bean 实例
- 保存 Bean 实例
- 获取 Bean 实例

## Bean 信息
### BeanDefinition
包括Class信息，属性信息Properties

## 基础行为
### BeanFactory
定义 获取Bean的行为
### BeanDefinitionRegistry
定义 容器注册Bean的行为
### SingletonBeanRegistry
定义 容器注册Bean的单态行为

