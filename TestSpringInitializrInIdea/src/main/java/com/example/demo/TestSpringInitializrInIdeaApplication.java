package com.example.demo;

import hello.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TestSpringInitializrInIdeaApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        var ctx = SpringApplication.run(TestSpringInitializrInIdeaApplication.class, args);
        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM Patients";
        List<Patient> customers = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Patient.class));

        customers.forEach(System.out :: println);
    }
}
