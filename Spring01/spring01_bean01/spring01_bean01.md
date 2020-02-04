## Spring 管理对象的创建的细节.

### 创建 bean 的三种方式

#### 使用默认的构造函数

如果类中没有默认构造函数, 比如被重载, 则会创建失败.

```xml
<bean id="accountService" class="com.flying.service.impl.AccountServiceImpl"/>
```

#### 使用提供的方法创建对象

```xml
<bean id="instanceFactory" class="com.flying.factory.InstanceFactory" />
<bean id="accountService" factory-bean="instanceFactory" factory-method="getAccountService"/>
```

#### 使用提供的静态方法创建对象

```xml
<bean id="accountService" class="com.flying.factory.StaticFactory" factory-method="getAccountService"/>
```

### bean 对象的作用范围

默认是单例对象

调整:

使用 `bean` 标签的 `scope` 属性

| 属性值          | 说明                                                       |
| --------------- | ---------------------------------------------------------- |
| singleton(常用) | 单例(Default)                                              |
| prototype(常用) | 多例                                                       |
| request         | 作用于 web 应用的请求范围                                  |
| session         | 作用于 web 应用的会话范围                                  |
| global-session  | 作用于集群环境的会话范围(如果不是集群环境, 等同于 session) |

### bean 对象的生命周期

单例对象和多例对象的生命周期一致.

