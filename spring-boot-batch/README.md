# Spring Boot without Server

## Steps
To start Spring boot apps without a web server
- use ```spring-boot-starter``` instead of ```spring-boot-starter-web```
- implement ```CommandLineRunner```

## Result
We should be able to run the app
- From IntelliJ
- Maven
    - mvn clean package
    - mvn spring-boot:run
    - java -jar target/spring-boot-batch-1.0-SNAPSHOT.jar
    
## References
- https://mkyong.com/spring-boot/spring-boot-non-web-application-example/
