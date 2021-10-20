# Spring Boot Walk Through 

This is different from spring-boot-rs-parent-pom, it doesn't use Spring's
parent pom.xml. Instead, it imports the parent pom.xml. The extra work is the
dependent management and the Spring plugin.

The java code is the same as spring-boot-rs-parent-pom.

We should be able to start the app from IntelliJ, java -jar, and 
spring-boot:run.

References:
- https://www.baeldung.com/spring-boot-dependency-management-custom-parent
- https://javadeveloperzone.com/spring-boot/spring-boot-without-parent-pom/
- https://www.baeldung.com/spring-boot-start
