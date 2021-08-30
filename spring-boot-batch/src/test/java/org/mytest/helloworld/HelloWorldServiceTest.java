package org.mytest.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing
// web server is *not* started with SpringBootTest

// https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing.spring-boot-applications.autoconfigured-tests
// We want to load minimal context for each test, and/or Spring caches the context
// according to https://spring.io/guides/gs/testing-web/.

@SpringBootTest
public class HelloWorldServiceTest
{
    @Autowired private HelloworldService hws;

    @Test
    void testSayHello() {
        String resp = hws.sayHello("ChatBot");
        assertEquals("<b>Hello ChatBot, how are you?</b>", resp);
    }
}
