package tester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Tester {

    public static void main(String[] args) {
        System.out.println("Checking dependencies");
        var ctx = SpringApplication.run(Tester.class, args);
        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }
}
