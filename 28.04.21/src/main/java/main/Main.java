package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {
        initAppContext();
        context.getBean("service2", Service2.class).print();
    }

    private static void initAppContext() {
        String contextPath = ClassLoader.getSystemResource("context.xml").toString();
        context = new ClassPathXmlApplicationContext(contextPath);
    }
}
