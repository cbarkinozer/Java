# Spring Notes
## Spring Core

**The Spring Framework** (Spring) is a modular, open-source application framework that provides infrastructure support for developing Java applications.
One of the most popular Java Enterprise Edition (Java EE) frameworks, Spring helps developers create high-performing applications using plain old Java objects (POJOs).  
Rod Johnson created it in 2003 because the EJB had architectural problems. Spring is the most popular framework for java.  

**Dependency of an object**: An object’s dependency is other objects that they work with (dependent to work).  

**Dependency Injection**: A technique whereby one object supplies the dependencies of another object.  

**Inversion of Control(IoC)**: Taking the control of creating and instantiating the beans from the developer to the framework.  

**Plain old java object(POJO)**: An ordinary Java object, not bound by any special restriction. It should not implement or extend any class/interface.  

**Bean**: A special kind of POJO that has some restrictions. Beans must be serializable. Fields must be private. Fields should have getters/setters.  
There must be a no-argument constructor. Fields are only accessed by constructors or getters/setters.  

**ApplicationContext**: It is an object that loads the configuration(XML or annotation-based) and then Spring will start managing the beans.
This technique benefits: beans declared in a package, beans declared by annotations, constructor, and method auto writing, bean injection, configuration, .properties, and .yaml file loading, etc.  

**Extensible Markup Language(XML)**: simple text-based format for representing structured information. For example : <menu><submenuitem text=”example” file=”example.html”/></menu>  

**Annotation**: In dictionary meaning, annotation is a note added by way of comment or explanation.  
In programming, an annotation is a form of metadata that provides data about a program that is not a part of the program itself (For example @Configuration, @Bean, @Import, and @DependsOn annotations).  

**Aspect-oriented Programming(AOP)**: Modularization of crosscutting concerns(concerns that affect every layer of a software architecture) such as transaction management, logging, security.  

**Spring IoC container**: The core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle.  
The Container uses Dependency Injection(DI) to manage the components that make up the application.  
It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. These objects are called Beans.  

Following is how Spring works:  
![image](https://user-images.githubusercontent.com/43732258/153714507-fa2d5bec-fafc-4fdf-9f46-6020688d374f.png)

Once the ApplicationContext is created and initialized, your application classes are combined with the configuration metadata so that you have a fully configured and executable system.
  



```java
//java-based
@Configuration
Public class JavaBasedApplication{
  Public static void main(String[] args){
	ApplicationContext context = new AnnotaitonCOnfigApplicationCOntext(JavaBasedApplicaiton.class);

  Service service = context.getBean(Service.class);
  service.testService();
  }

  @Bean
  Public Dao dao(){
	  return new Dao();
  }
  @Bean
  Public Service service(){
	  return new Service(dao());
  }

}
```

```java
//xml-based
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
    http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="dao" class="com.softtech.model.Dao"></bean>

    <bean id="service" class="com.softtech.model.Service">
        <constructor-arg name="dao" ref="dao"/>
    </bean>

</beans>
```
## Spring Boot
