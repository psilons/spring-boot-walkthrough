package org.mytest.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApp implements CommandLineRunner
{
    @Autowired HelloworldService hws;

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        String name = "ChatBot";
        if (args.length > 0)
            name = args[0];
        String msg = hws.sayHello(name);
        System.out.println("response: " + msg);
        System.out.println("done!");
    }
}
