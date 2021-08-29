package org.mytest.helloworld.web;

import org.mytest.helloworld.resp.ResponseEnricher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @Autowired
    private ResponseEnricher responseEnricher;

    @GetMapping("/hello")
    public String sayHello(String name) {
        String resp = "Hello " + name + ", how are you?";
        return responseEnricher.enrich(resp);
    }
}
