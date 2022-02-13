# Spring Notes
## Spring Core

**The Spring Framework** (Spring) is a modular, open-source application framework that provides infrastructure support for developing Java applications.
One of the most popular Java Enterprise Edition (Java EE) frameworks, Spring helps developers create high-performing applications using plain old Java objects (POJOs).  
Rod Johnson created it in 2003 because the EJB had architectural problems. Spring is the most popular framework for java.  

**Plain old java object(POJO)**: An ordinary Java object, not bound by any special restriction. It should not implement or extend any class/interface.  

**Bean**: A special kind of POJO that has some restrictions. Beans must be serializable. Fields must be private. Fields should have getters/setters.  
There must be a no-argument constructor. Fields are only accessed by constructors or getters/setters.  

**Extensible Markup Language(XML)**: simple text-based format for representing structured information. For example : <menu><submenuitem text=”example” file=”example.html”/></menu>  

**Annotation**: In dictionary meaning, annotation is a note added by way of comment or explanation.  
In programming, an annotation is a form of metadata that provides data about a program that is not a part of the program itself (For example @Configuration, @Bean, @Import, and @DependsOn annotations).  

**Aspect-oriented Programming(AOP)**: Modularization of crosscutting concerns(concerns that affect every layer of a software architecture) such as transaction management, logging, security.  

**Dependency of an object**: An object’s dependency is other objects that they work with (dependent to work).  

**Inversion of Control(IoC)**: Taking the control of creating and instantiating the beans from the developer to the framework.  
To make it possible, the Spring frameworks use abstractions and rely on object graphs generated at runtime.  

**Advantages of IoC principle**:
Decouples the task implementation from its execution.  
Modules are pluggable and can be easily replaced with their equivalent.  
Eases out the modular testing.  

**Methods for achieving Inversion Of Control**: Strategy Design Pattern, Service Locator Pattern, or Dependency Injection.

**Dependency Injection**: An Inversion of control pattern, whereby one object supplies the dependencies of another object.  
The dependency injection concept promotes loose coupling among Java objects.  
Traditional method:  
```java
public class Person {
    private Address address;
    public Person() {
        this.address = new Address();
    }
    ...
}
```
We’ll not create objects on our own and rather inject them.
The Following is an example of dependency injection by using constructor:  
```java
public class Person {
    private Address address;
    public Person(Address address) {
        this.address = address;
    }
    ...
}
```

Spring supports **3 types of dependency injection**:  
1.**Constructor-based injection**  

Spring will use the matching constructor to resolve and inject the dependency.  

i. We can either configure the beans in applicationContext.xml:  

```xml
<bean id="address" class="com.programmergirl.domain.Address"/>
<bean id="person" class="com.programmergirl.domain.Person">
    <constructor-arg ref="address"/>
</bean>
```

ii. Or, we can enable the <component-scan/> in our applicationContext.xml:  

```xml
<context:component-scan base-package="com.programmergirl.domain" />
```

Than we make the Spring configurations using the annotations:  

```java
package com.example.domain;
@Component
public class Person {
    private Address address;
    @Autowired
    public Person(Address address) {
        this.address = address;
    }
}
```
Spring, by default, wires the beans by their type.  
If there are more than one beans of the same type, we can use @Qualifier annotation to reference a bean by its name:  

```java
@Component
public class Person {
    private Address address;
    @Autowired
    @Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
    }
}
```
2. Setter injection  
Setter-based dependency injection is achieved through the setter method on the bean after instantiating it using a no-arg constructor or no-argument static factory.  

XML  
```xml
<bean id="address" class="com.programmergirl.domain.Address"/>
<bean id="person" class="com.programmergirl.domain.Person">
    <property name="address" ref="address"/>
</bean>
```
```java
@Component
public class Person {
    
    private Address address;
    ...
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
    
}
```
3. Property-based injection  
We can also inject dependencies using fields or properties of a class.  
To do so, we can simply use the @Autowired annotation over the field:  
```java
@Component
public class Person {
    @Autowired
    private Address address;
    ...
}
```
**Considering the spring documentation**:  
Use constructor injection for mandatory dependencies (the dependencies they use while working).  
Setter-based injections should be used for dependencies that are optional in nature (alternative dependencies).  
Avoid property-based injection because Spring uses reflection for field-injected dependencies and it is costlier.  

**ApplicationContext**: It is an object that loads the configuration and then Spring will start managing the beans.
This technique benefits: beans declared in a package, beans declared by annotations, constructor, and method auto writing, bean injection, configuration, .properties, and .yaml file loading, etc.  
There are 3 ways to configure applicationContext: XML based(configuring beans in xml), java based, annotation based( enabling <component-scan> in xml and using annotation in java code).  

The Spring ApplicationContext interface represents its IoC container and has several implementation classes available.  
Some of these include **ClassPathXmlApplicationContext**, **FileSystemXmlApplicationContext**, and **WebApplicationContext**.  

Let’s instantiate the Spring container using ClassPathXmlApplicationContext:  

```java
//The applicationContext.xml is the file that holds the metadata required to assemble beans at runtime.
ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
```

**Spring IoC container**: The core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle.  
The Container uses Dependency Injection(DI) to manage the components that make up the application.  
It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. These objects are called Beans.  

Following is how Spring Core works:  
![image](https://user-images.githubusercontent.com/43732258/153714507-fa2d5bec-fafc-4fdf-9f46-6020688d374f.png)

Once the ApplicationContext is created and initialized, your application classes are combined with the configuration metadata so that you have a fully configured and executable system.  

## Spring Boot
	
**Spring Boot Architecture**
Spring Boot is a module of the Spring Framework that is developed on top of the core Spring Framework.  
Spring Boot is used to create stand-alone, production-grade Spring Based Applications with minimum efforts.  
Spring Boot follows a layered architecture in which each layer communicates with the layer directly below or above (hierarchical structure) it.  

There are four layers in Spring Boot are as follows:  
![image](https://user-images.githubusercontent.com/43732258/153719029-cf9a5f60-7b51-41e2-82b7-7a20390d008e.png)  
o	Presentation Layer (handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business layer).  
o	Business Layer (authorization and validation, bussiness logic,service classes).  
o	Persistence Layer (storage logic and translates business objects from and to database rows).  
o	Database Layer(CRUD (create, retrieve, update, delete) operations on databases  are performed).  

**Spring Boot Flow Architecture**
![image](https://user-images.githubusercontent.com/43732258/153742576-aa78883c-4394-4022-a478-fa3b9d2c808e.png)
The architecture of Spring Boot is the same as the architecture of Spring MVC, except one thing: there is no need for DAO and DAOImpl classes in Spring boot.  
o	Creates a data access layer and performs CRUD operation.  
o	The client makes the HTTP requests (PUT or GET).  
o	The request goes to the controller, and the controller maps that request and handles it. After that, it calls the service logic if required.  
o	In the service layer, all the business logic performs. It performs the logic on the data that is mapped to JPA with model classes.  
o	A JSP page or Spring Data is returned to the user if no error occurred.  
	
**Maven**: Maven is a open-source build tool developed by the Apache Group to build, publish, and deploy several projects at once for better project management.  
Maven adds a pom.xml file to projects files. By using this file you can add or remove .jar files from your project easily.  

**pom.xml(Project Object Model)**: The core business unit in Maven. An XML file containing information about the project and configuration details used by Maven to build the project.  

**Spring initialzr**: Spring Initializr is a Web-based tool that generates the Spring Boot project structure.  
The Spring Initializr tool takes care of the following configuration for any Spring-based project:  
o	Build tool(Maven or Gradle) to build the application.  
o	Spring Boot version(Dependencies are added based on the version).  
o	Dependencies required for the project.  
o	Language and its version.  
o	Project Metadata like name, packaging (Jar or War), package name etc.  
