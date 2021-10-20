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
    
## Notes
To run without the web server and spring-boot-starter-web is in the classpath,
follow this link: https://stackoverflow.com/questions/26105061/spring-boot-without-the-web-server
we could turn off the server using API or settings.

## References
- https://mkyong.com/spring-boot/spring-boot-non-web-application-example/
