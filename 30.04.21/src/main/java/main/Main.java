package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Person Ivan = applicationContext.getBean(Person.class);
        System.out.println(Ivan);
        RandomGenerator generator = applicationContext.getBean(RandomGenerator.class);
        System.out.println(generator.getValue());
    }
}
