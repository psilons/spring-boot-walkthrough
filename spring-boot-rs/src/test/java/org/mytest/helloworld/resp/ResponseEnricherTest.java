package org.mytest.helloworld.resp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.mytest.helloworld.resp"}) // to load beans only from this dir.
class LocalScan {
}

@SpringBootTest(classes= LocalScan.class)  // remove this param to see diff
public class ResponseEnricherTest
{
    @Autowired private ApplicationContext appContext;

    @Autowired private ResponseEnricher enricher;

    @Test
    void testEnrich() {
        for (String bean : appContext.getBeanDefinitionNames())
            System.out.println(bean);

        assertEquals("<b>Hello</b>", enricher.enrich("Hello"));
    }
}
