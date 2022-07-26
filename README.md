# sms_spring
simple code for study spring
# Step 02
一个容器实例的行为主要包含两个部分
1. 注册 BeanDefinition
2. 获取 Bean
3. 缓存 Bean

## 实现思想
主要是通过多态继承的方式来实现，并且通过"模板模式"来定义"获取Bean"的过程.

参考 UML实现 ”sms_spring\Uml\step2UML.drawio“
## 注册 BeanDefinition
通过实现 BeanDefinitionRegistry 接口

## 缓存 Bean
通过 继承 DefaultSingletonBeanRegistry

| 名称          | 类型  | 继承方式                                                         | 作用                                    |
|-------------|-----|--------------------------------------------------------------|---------------------------------------|
| SingletonBeanRegistry | 接口  |                                                              | 定义单态的的行为                              |
| DefaultSingletonBeanRegistry| 实现类 | implements SingletonBeanRegistry | 实现了 Bean的单态模式                         |
| AbstractBeanFactory | 抽象类 | extends DefaultSingletonBeanRegistry | 使 AbstractBeanFactory 具备 单态缓存已实例的Bean |

## 获取 Bean
通过实现 BeanFactory 系列抽象类

| 名称          | 类型  | 继承方式                                 | 作用             |
|-------------|-----|--------------------------------------|----------------|
| BeanFactory | 接口  |                                      | 定义 获取Bean 的行为  |
| AbstractBeanFactory| 抽象类 | implements BeanFactory               | 模板模式 定义 getBean |
 | AbstractAutowireCapableBeanFactory | 抽象类 | extends DefaultSingletonBeanRegistry | 定义了 创建Bean 的方式 |

