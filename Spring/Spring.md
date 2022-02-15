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

### **Dependency Injection**:  
An Inversion of control pattern, whereby one object supplies the dependencies of another object.  
The dependency injection concept promotes loose coupling among Java objects that makes the application easier to maintain and test.  

The traditional method:  
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
2. **Setter injection**  
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
3. **Property-based injection** 
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

### **ApplicationContext**  
It is an object that loads the configuration and then Spring will start managing the beans.  
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

## **Spring Boot**
Spring Boot is an open-source micro framework that provides Java developers with a platform to get started with an auto configurable production-grade Spring application.  	

### **Spring Boot Architecture**
Spring Boot is a module of the Spring Framework that is developed on top of the core Spring Framework.  
Spring Boot is used to create stand-alone, production-grade Spring Based Applications with minimum efforts.  
Spring Boot follows a layered architecture in which each layer communicates with the layer directly below or above (hierarchical structure) it.  

There are 4 layers in Spring Boot are as follows:  
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

**DAO(Data Access Object) vs DTO(Data Transfer Object)**:
DTO is a value object that is used to transfer data between classes and modules of your application.  
DAO is used to encapsulate and hide implementation details about how your data is stored and retrievend in your data storage (database or file system).  
	
### **Spring vs Spring Boot**
o	Spring is a Java EE framework that is used to build applications. Spring Boot framework is mainly used to develop REST API’s.  
o	Spring's key feature is dependency injection. Spring Boot's key feature is autoconfiguration.  
o	Spring is used to make Java EE developement easier. Spring Boot provides the RAD(Rapid Application Development) feature to the Spring framework for faster application development.  
o	Spring framework helps to create a loosely coupled application. Spring Boot helps to create a stand-alone application.  
o	In the Spring framework to test the Spring Project, we need to set up the servers explicitly. Spring Boot offers built-in or embedded servers such as Tomcat and jetty.  
o	Spring framework does not support in-memory database. Spring Boot provides support for the in-memory database such as H2.  
o	In the Spring framework, you have to build configurations manually. In Spring Boot there are default configurations that allow faster bootstrapping.  
o	Spring requires a number of dependencies to create a web app. Spring Boot, can get an application working with just one dependency.  
o	Testing Spring Boot is easier than testing Spring because of the reduced amount of source code.    
o	Contrarily of the Spring, XML configuration is not a must in Spring Boot.  
o	Contrarily of the Spring, Spring Boot provides a CLI tool for developing and testing Spring Boot applications.  
o	Contrarily of the Spring, Spring Boot provides build tool plugins for Maven and Gradle.

**Spring Boot Autoconfiguration**: The method of automatically configuring a Spring application based on the dependencies found on the classpath.  
Autoconfiguration can speed up and simplify development by removing the need to define some beans that are part of the auto-configuration classes..  
	
**Spring initialzr**: Spring Initializr is a Web-based tool that generates the Spring Boot project structure.  
The Spring Initializr tool takes care of the following configuration for any Spring-based project:  
o	Build tool(Maven or Gradle) to build the application.  
o	Spring Boot version(Dependencies are added based on the version).  
o	Dependencies required for the project.  
o	Language and its version.  
o	Project Metadata like name, packaging (Jar or War), package name etc.  

**application.properties**: In the resources file there is a file called application.properties for setting application's properties.  
You can set application.title, application.version and server.port inside this file.  
Logging.level.org.springframework = debug gives more logs on higher log level(info is default). By doing that we can see what spring is doing at the background in detail.  
Spring.datasource url, driverclassname,username,password etc. values can be given for databse configuration.  
Also in the resources file, you can create a banner.txt file and add a custom text banner that will be shown when the spring boot application starts.  

### **Spring Annotations**
**@Component**: Configures the Bean classes.
```java
@Component
public class Company {
    private Address address;
    public Company(Address address) {
        this.address = address;
    }
    // getter, setter and other properties
}
```
The configuration class supplying bean metadata to an IoC container:   
**@ComponentScan**: Instructs the container to look for beans in the package containing the Company class.  
If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.  

```java
@Component
public class BeanA {
  @Autowired
  @Qualifier("beanB2")
  private BeanInterface dependency;
  ...
}
@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
    @Bean
    public Address getAddress() {
        return new Address("High Street", 1000);
    }
}
```
**@Configuration**: This annotation is used on classes which define beans. It is an alternative for XML configuration file.  

**@Lazy**: Used on Component classes and indicates that the Bean will be created and initialized only when it is first requested for.  
**@Value**: Used at the field or method/constructor parameter level and it indicates a default value for the affected argument.  
Commonly used to inject the configuration values to the spring boot application.  
	
**Stereotype Annotations**: Spring framework provides 3 other specific annotations to be used when marking a class as a Component.  
These specific Component annotations are @Service, @Repository, @Controller.	
**@Service**: Indicates these beans are used in Service layer and holds bussiness logic (utility classes).
**@Repository**: Indicates these beans are used in DAO or Repository and deals with CRUD (create, read, update, delete) operations.
**@Controller**: Indicates these beans are front controllers, used in REST Web Services and responsible to handle user requests.

**@Bean**: It is used at method level and indicates that a method produces a bean to be managed by the Spring container.  
The method annotated with this annotation works as bean ID and it creates and returns the actual bean.  
```java
@Configuration
public class AppConfig{
  @Bean
  public Person person(){
    return new Person(address());
  }
  @Bean
  public Address address(){
    return new Address();
  }
}
```
**@PropertyResources**: Provides property file to Spring Environment.  

**@Autowired**: Used for automatic injection of beans.   
When you use @Autowired on setter methods, Spring tries to perform the by Type autowiring on the method.  
When you use @Autowired on a constructor, constructor injection happens at the time of object creation.  
NOTE: As of Spring 4.3, @Autowired became optional on classes with a single constructor.  
	
**@Qualifier**: Used in conjunction with Autowired to avoid confusion when we have two of more bean configured for same type.  
Consider and example where an interface is implemented by two classes. Now when a bean autowires this interface we need to specify the class as following:  
```java
@Component
public class BeanA {
  @Autowired
  @Qualifier("beanB2")
  private BeanInterface dependency;
  ...
}
```
**@Primary**: Used with @Qualifier and defines the primary preferenced Bean.  
	
**@SpringBootApplication**: Indicates Spring Boot projects main method. Marks a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.  
**@EnableAutoConfiguration**: Enables Spring Boot to auto-configure the application context, so Spring Boot automatically creates and registers beans.  

**@Target**: The target annotation indicates the targeted elements( such as field, method, parameter etc.) of a class in which the annotation type will be applicable.  
**@Scope**: Indicates the Bean's runtime context(scope). The default scope is Singleton.  
	
### **HTTP Methods and Messages**

**HTTP**: Hyper Text Transfer Protocol is used for fetching resources such as HTML documents.  

**HTTP Methods**:
**GET**: Requests a resource from the server.  
**HEAD**: Requests only headers of resources from server.  
**POST**: Changes the content of the resource located on the server.  
**PUT**: Requests the server to create a resource and replace that resource with another resource.  
**DELETE**: Requests the server to delete a resource.  
**CONNECT**: Requests to start two-way communications with the requested HTTPS resource.  
**OPTIONS**: Requests permitted communication options for a given URL or server.  
**TRACE**:  Used for debugging which echo's back input back to the user.  

**Error messages**:  
**1xx**: Informative messages.  
**2xx**: Success messages.  
**3xx**: Redirecting messages.  
**4xx**: Request error messages.  
**5xx**: Server error messages.  
		
### **Lombok**
Lombok is a java library tool that is used to minimize/remove the boilerplate code and save time to developers during development by increasing the readability of the source code and saving space with using some annotations.   
Lombok works by plugging into our build process and auto-generating Java bytecode into our .class files.  

```java
@Getter @Setter @NoArgsConstructor // Adding getters, setters and no-argument constructor
public class User implements Serializable {

    private Long id;
	
    @NonNull  
    private String firstName;
    @NonNull  
    private String lastName;
    @NonNull  
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
```

@**Getter**: Used at field or class level to generate getters for private fields.  
@**Setter**: Used at field or class level to generate setters for private fields.  

@**NoArgsConstructor**: Generates a constructor with no parameters.  
@**AllArgsConstructor**: Generates a constructor with all fields as parameters.  
@**RequiredArgsConstructor**: Generates a constructor with with required parameters (final fields). 
Does not generate any argument for non-final, initialized final, static, initialized non-null fields.  

@**toString**:	Generates a toString() method including all class attributes. Updates itself as we enrich our data model.  
@**EqualsHashCode**: Generates both equals() and hashCode() methods by default considering all relevant fields.  

@**Data**: Sets @Getter, @Setter, @RequiredArgsConstructor, @toString, @equalsHashcode.  
Configuring @Data by excluding example:  

```java
@Data
public class User4 {
  @Setter(value = AccessLevel.NONE)
  private Long id;
  @Getter(value = AccessLevel.NONE)
  private String username;
  
  @ToString.Exclude
  private boolean active;
  
  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private int role;
}
```

@**Builder**: Produces complex builder APIs for your classes.  
If you are using @Data and @Builder annotations together, all-args constructor (Package access level) is generated.  
The difference between Builder and Factory pattern is that the Builder pattern is only required when an object cannot be produced in one step. After all of the steps are done, the builder creates the instance.  

Note: The elimination of boilerplate code can also be done by implementing kotlin data classes into java projects.  

### **Hibernate**
	
**H2 Database**: H2 is a lightweight relational database management system written in Java that can be embedded in Java applications or run in client-server mode.  
To use H2, add dependency to pom.xml file than change application.properties file.  
Later, arrying out CRUD operations with H2 within Spring Boot is the same as with other SQL databases.  
To access H2 console, add "spring.h2.console.enabled=true" to application.properties.  
Then go to "http://localhost:8080/h2-console" url which is the login page.  
After we enter our credentials, a comprehensive H2 console webpage will welcome us.  
	
**Swagger**: Set of open-source tools that can help you design, build, document and consume REST APIs.  
**REST API**: An API that conforms to the design principles of the REST, or representational state transfer architectural style.  
**API(Applicaiton Programming Interface)**: Set of rules that define how applications or devices can connect to and communicate with each other.  
**REST (Representational State Transfer)**: Roy Fielding's derivation of the Web's architectural style.  
In a RESTful Web service, requests to a resource's URI are answered with data in the form of HTML, XML, JSON, or some other format.  
**URI( Uniform Resource Identifier)**: A syntax that assigns each web document a unique address.  
	
![image](https://user-images.githubusercontent.com/43732258/153911790-ba6c772f-e541-4ba3-befe-94ad9a9dee9d.png)  
	
**Designing REST APIs**:
Decide the 3-letter abbreviations of the tables and attributes inside them. Packages are created with the same name.   
Inside each of these 3-letter abbrevation named packages, create dao, dto, entity, service( and entityservice in service), controller, converter, enums packages.     


**Java Reflection**:  

**References**:  
Sadık Bahadır Memiş    
https://www.programmergirl.com/spring-dependency-injection/  
https://springframework.guru/spring-framework-annotations/  
https://www.baeldung.com/spring-boot-h2-database  
https://www.baeldung.com/intro-to-project-lombok  
https://javabydeveloper.com/lombok-requiredargsconstructor-examples/  
