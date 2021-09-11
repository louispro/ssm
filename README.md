[TOC]



## 一、导包

`pom.xml`内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>org.example</groupId>
  <artifactId>ssm</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <name>ssm Maven Webapp</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.9</maven.compiler.source>
    <maven.compiler.target>1.9</maven.compiler.target>
    <spring.version>5.0.0.RELEASE</spring.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>

    <!--ssm模块-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <!--添加spring dao依赖-->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aspects</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-orm</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <!--日志和事务增强-->
    <dependency>
      <groupId>commons-logging</groupId>
      <artifactId>commons-logging</artifactId>
      <version>1.0.3</version>
    </dependency>
    <dependency>
      <groupId>net.sourceforge.cglib</groupId>
      <artifactId>com.springsource.net.sf.cglib</artifactId>
      <version>2.2.0</version>
    </dependency>
    <dependency>
      <groupId>org.aopalliance</groupId>
      <artifactId>com.springsource.org.aopalliance</artifactId>
      <version>1.0.0</version>
    </dependency>
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>com.springsource.org.aspectj.weaver</artifactId>
      <version>1.6.4.RELEASE</version>
    </dependency>

    <!--jsp和servelt模块-->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
    </dependency>
    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>jsp-api</artifactId>
      <version>2.2.1-b03</version>
    </dependency>

    <!--jstl标签-->
    <dependency>
      <groupId>org.apache.taglibs</groupId>
      <artifactId>taglibs-standard-impl</artifactId>
      <version>1.2.5</version>
    </dependency>
    <dependency>
      <groupId>org.apache.taglibs</groupId>
      <artifactId>taglibs-standard-spec</artifactId>
      <version>1.2.5</version>
    </dependency>

    <!--数据库连接-->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.25</version>
    </dependency>
    <dependency>
      <groupId>com.mchange</groupId>
      <artifactId>c3p0</artifactId>
      <version>0.9.5.5</version>
    </dependency>

    <!--添加后端校验功能-->
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>7.0.1.Final</version>
    </dependency>
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator-annotation-processor</artifactId>
      <version>7.0.1.Final</version>
    </dependency>

    <!--ajax依赖-->
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-annotations</artifactId>
      <version>2.13.0-rc2</version>
    </dependency>
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-core</artifactId>
      <version>2.13.0-rc2</version>
    </dependency>
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.13.0-rc2</version>
    </dependency>
    <!--文件上传和下载-->
    <dependency>
      <groupId>commons-fileupload</groupId>
      <artifactId>commons-fileupload</artifactId>
      <version>1.4</version>
    </dependency>
    <dependency>
      <groupId>commons-io</groupId>
      <artifactId>commons-io</artifactId>
      <version>2.11.0</version>
    </dependency>

    <!--数据库mybatis-->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.5.7</version>
    </dependency>
    <!--mybatis依赖的包-->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.25</version>
    </dependency>
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.12</version>
    </dependency>
    <!--第三方二级缓存依赖-->
    <dependency>
      <groupId>org.mybatis.caches</groupId>
      <artifactId>mybatis-ehcache</artifactId>
      <version>1.2.1</version>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>1.7.32</version>
    </dependency>
    <dependency>
      <groupId>net.sf.ehcache</groupId>
      <artifactId>ehcache-core</artifactId>
      <version>2.6.11</version>
    </dependency>

    <!--spring和mybatis整合-->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>2.0.6</version>
    </dependency>



  </dependencies>

  <build>
    <finalName>ssm</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-war-plugin</artifactId>
          <version>3.2.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>

```

包依赖图：

<div align="center">

<img src="http://ww1.sinaimg.cn/large/006gOimwly1gud4yj8ordj60pq18jakx02.jpg"/>
</div>

## 二、配置web.xml

主要是在`web.xml`中配置`spring`容器和`springmvc`的前端控制器以及中文乱码和rest风格的请求

`web.xml`内容如下：

```xml
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
  <display-name>Archetype Created Web Application</display-name>

  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath:spring/spring.xml</param-value>
  </context-param>
  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>

  <!--配置springmvc-->
  <!--配置前端控制器-->
  <servlet>
    <servlet-name>ssm</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:spring/springmvc.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>ssm</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>

  <!--中文乱码-->
  <filter>
    <filter-name>characterEncodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
    <init-param>
      <param-name>forceEncoding</param-name>
      <param-value>true</param-value>
    </init-param>
  </filter>
  <filter-mapping>
    <filter-name>characterEncodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>

  <!--rest风格的请求-->
  <filter>
    <filter-name>hiddenHttpMethodFilter</filter-name>
    <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
  </filter>
  <filter-mapping>
    <filter-name>hiddenHttpMethodFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
</web-app>

```

## 三、配置`springmvc.xml`和`spring.xml`

`springmvc`和`spring`最好整合成两个容器，这样便于管理组件，分工明确。

`springmvc`主要负责视图解析，文件上传，请求转发重定向等。

`springmvc.xml`内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd">
    <!--包扫描-->
    <context:component-scan base-package="com.louis.ssm" use-default-filters="false">
        <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>

    <!--视图解析器-->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/pages/"></property>
        <property name="suffix" value=".jsp"></property>
    </bean>

    <!--文件上传-->
    <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
        <property name="maxUploadSize" value="#{1024*1024*20}"></property>
        <property name="defaultEncoding" value="utf-8"></property>
    </bean>
    <!--扫描静态资源-->
    <mvc:default-servlet-handler/>
    <!--扫描动态资源-->
    <mvc:annotation-driven></mvc:annotation-driven>


</beans>
```

`spring`则主要负责`service`层和`dao`持久层

`spring.xml`内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd
                           http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd
                           http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">

    <!--包扫描-->
    <context:component-scan base-package="com.louis.ssm">
        <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>

    <!--数据库配置信息-->
    <context:property-placeholder location="classpath:dbconfig.properties"></context:property-placeholder>
    <!--配置数据源-->
    <bean id="c3p0" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="user" value="${jdbc.user}"></property>
        <property name="password" value="${jdbc.password}"></property>
        <property name="jdbcUrl" value="${jdbc.jdbcUrl}"></property>
        <property name="driverClass" value="${jdbc.driverClass}"></property>
        <property name="maxPoolSize" value="${jdbc.maxPoolSize}"></property>
        <property name="minPoolSize" value="${jdbc.minPoolSize}"></property>
    </bean>

    <!--配置mybatis操作数据库-->
    <bean id="sqlSessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
        <!--配置mybatis配置文件-->
        <property name="configLocation" value="classpath:mybatis/mybatis-config.xml"></property>
        <property name="dataSource" ref="c3p0"></property>
        <!--指定xml映射文件的位置-->
        <property name="mapperLocations" value="classpath:com/louis/ssm/dao/EmployeeDao.xml"></property>
    </bean>
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <!--指定dao接口所在的包-->
        <property name="basePackage" value="com.louis.ssm.dao"></property>
    </bean>
    <!--配置事务控制，事务管理器，控制数据源里面的关闭和提交-->
    <bean id="tm" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="c3p0"></property>
    </bean>

    <!--基于xml配置事务，哪些方法切入事务-->
    <aop:config>
        <!--配置切入点-->
        <aop:pointcut id="myPoint" expression="execution(* com.louis.ssm.service.*.*(..))"/>
        <aop:advisor advice-ref="myTx" pointcut-ref="myPoint"/>
    </aop:config>

    <!--配置十五增强，事务属性，事务建议-->
    <tx:advice id="myTx" transaction-manager="tm">
        <!--配置事务属性-->
        <tx:attributes>
            <tx:method name="*"/>
        </tx:attributes>
    </tx:advice>
</beans>
```

其中`spring.xml`中也整合了`mybatis`：

其配置如下：

```xml
<!--配置mybatis操作数据库-->
<bean id="sqlSessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
    <!--配置mybatis配置文件-->
    <property name="configLocation" value="classpath:mybatis/mybatis-config.xml"></property>
    <property name="dataSource" ref="c3p0"></property>
    <!--指定xml映射文件的位置-->
    <property name="mapperLocations" value="classpath:com/louis/ssm/dao/EmployeeDao.xml"></property>
</bean>
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <!--指定dao接口所在的包-->
    <property name="basePackage" value="com.louis.ssm.dao"></property>
</bean>
```

`mybatis-config.xml`是`mybatis`的全局配置文件，其内容和正常的`mybatis-config.xml`配置不同，数据库的配置和数据`xml`映射文件的配置都放在了`spring.xml`中，其内容如下：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <settings>
        <setting name="mapUnderscoreToCamelCase" value="false"/>
        <!--开启属性延迟加载-->
        <setting name="lazyLoadingEnabled" value="true"/>
        <!--开启属性按需加载-->
        <setting name="aggressiveLazyLoading" value="false"/>
        <!--开启二级缓存-->
<!--        <setting name="cacheEnabled" value="true"/>-->
    </settings>
</configuration>
```



## 四、整合过程中遇到的问题

### 4.1、java.lang.NoClassDefFoundError: org/aspectj/weaver/reflect/ReflectionWorld$ReflectionWorldException

原因：缺少`spring-aspects`

解决：

```xml
<!--缺少的包-->
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-aspects</artifactId>
  <version>5.1.12.RELEASE</version>
<dependency>
```

### 4.2、异常java.lang.NoSuchMethodError

原因：`mybatis`版本过低

解决：`mybatis`版本得在`3.4.2`或者以上版本

### 4.3、java.lang.ClassNotFoundException: org.springframework.web.context.ContextLoaderListener

原因：项目在部署之后`spring-web`并没有部署到`WEB-INF/lib`目录下

解决：

`File->Project Structure`点击左侧的`Artifacts`,然后找到`Output Layout`选项卡

右键单击`Available Elements`下面的项目名称，选择`Put into Output Root`

<img src="http://ww1.sinaimg.cn/large/006gOimwly1gud4z3fqwbj60pg0jo7dt02.jpg"/>

