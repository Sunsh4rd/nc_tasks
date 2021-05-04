package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//        Test test = applicationContext.getBean(Test.class);
//        System.out.println(test);
//        Dog dog = applicationContext.getBean(Dog.class);
//        System.out.println(dog);
        String contextPath = ClassLoader.getSystemResource("applicationContext.xml").toString();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextPath);
        Owner owner = applicationContext.getBean(Owner.class);
        System.out.println(applicationContext.getBean(Dog.class));
        System.out.println(owner);
    }
}

//@Configuration
//class JavaConfig {
//
//    @Bean
//    public Test test() {
//      return new Test(100, "Testname");
//    }
//
//    @Bean
//    public Dog dog() {
//        return new Dog("Druzhok");
//    }
//
//    @Bean
//    public Owner owner() {
//        return new Owner("Owner");
//    }
//}

