package org.mytest.helloworld;

import org.mytest.helloworld.resp.ResponseEnricher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloworldService {
    @Autowired private ResponseEnricher responseEnricher;

    public String sayHello(String name) {
        String resp = "Hello " + name + ", how are you?";
        return responseEnricher.enrich(resp);
    }
}
