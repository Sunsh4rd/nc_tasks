package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("main")
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(applicationContext.getBean(Rating.class));
    }
}

@Configuration
class SpringConfiguration {

    @Bean
    public Rating getRating() {
        return new Rating((float) -5.2);
    }
}