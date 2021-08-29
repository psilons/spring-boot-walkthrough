# Spring Boot Walk Through Using Spring Parent pom.xml 

## Run
There are several ways to run:
- Run within IntelliJ
- Maven
    - mvn clean package
    - java -jar target/spring-boot-rs-parent-pom-1.0-SNAPSHOT.jar
    - mvn spring-boot:run
    
## Testing
First, we don't want to start the web server during testing.

Secondly, we want to load only relevant beans in a test, not the entire context.

References:
- https://javahungry.blogspot.com/2019/09/spring-boot-hello-world-example-maven-eclipse.html
- https://mkyong.com/tutorials/spring-boot-tutorials/
