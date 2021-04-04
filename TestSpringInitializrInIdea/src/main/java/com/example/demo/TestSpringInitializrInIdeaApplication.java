package com.example.demo;

import hello.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TestSpringInitializrInIdeaApplication {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        var ctx = SpringApplication.run(TestSpringInitializrInIdeaApplication.class, args);
        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }

}
