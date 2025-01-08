1) IOC : 
    DI is the implementation of IOC
    It is more flexible way to manage object dependency and its lifecycle through Dependency Injection.
2) Benefit of Spring
    Before we use servlet in which we need to write web.xml and filetes in web.xml, which is not user friendly
    Unit testing is difficult becase mocking will not work here
    Make restfull easy to have multiple get mapping in single class without 
3) Spring MVC VS Spring Boot

   a) Dependency Management : No need to add different dependecny separately and also their compatible version headche.
   b) Auto Configuration: No need for seprately configuring "Dispatcher servlet", "Appconfig", "EnableWebMVC", "ComponentScan"
    Spring boot Add internally by default.
    c) Embedded Server: We do not have create  war or jar and deploy to the **servlet container like tomcat**.
    In springboot we can run this direclty.
4) Spring boot Architecture
    /Users/bansal/Documents/workspace/spring-prep/SpringArchGeneral.png

Vedios 5

1) @Controller || @RestController (controller + responsebody)
    There main purpose to register with spring that any https request comes, ans can be in anyone of these controller
    Both are almost same with minor diff controller + responsebody
    If controller is not annotated with @ResponseBody, it will try to find the "view name" of the jsp and try to render it.
2) All the annotation will get resolved by reflection
3) Response Entity:
   It represent the entire HTTP Response e.g. Header, status, Response body etc...
Vedios 6
1) Diff between @Bean or @Component

Vedios 9
Circular dependency -- think of lazy
Unsatisfied Dependency problem -- 2 ways to resove this

Vedios 10
@ConditionalOnProperty (prefix=""sqlconnection", value = "enabled", havingValue = "true", matchIfMissing=false)

Vedios 11
How to set profile 
    3 ways
    Set spring.active.profile=dev in main application.properties
    mvn spring-boot:run -Dspring-boot.run.profiles=prod
    POM.xml
    