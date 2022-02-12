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
