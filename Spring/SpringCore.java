@Configuration
Public class JavaBasedApplication{
  Public static void main(String[] args){
	ApplicationContext context = new AnnotaitonCOnfigApplicationCOntext(JavaBasedApplicaiton.class);

  Service service = context.getBean(Service.class);
  service.testService();
  }

  @Bean
  Public Dao dao(){
	  Return new Dao();
  }
  @Bean
  Public Service service(){
	  Return new Service(dao());
  }

}
