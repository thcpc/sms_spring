# step01 
实现了Spring的最核心基础逻辑
对 Bean 对象的
- 注册
- 获取

# BeanDefinition
管理Bean的对象
# BeanFactory
主要是管理BeanDefinition的注册 和 获取
BeanFactory -> BeanDefinition -> Bean

# Step02的目标
## BeanDefinition 
1. 根据Bean的 Class 反射出 Bean对象
## BeanFactory
拆分 BeanFactory 对象 的行为。拆分为以下三个接口
- 注册接口
- 获取接口
- 实例化接口