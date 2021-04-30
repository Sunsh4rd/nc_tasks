package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Person Ivan = applicationContext.getBean(Person.class);
        System.out.println(Ivan);
        for (int i = 0; i < 10; i++) {
            RandomGenerator generator = applicationContext.getBean(RandomGenerator.class);
            System.out.print(generator.getValue() + " ");
            //220 99 175 48 424 211 895 35 942 113
        }
    }
}
