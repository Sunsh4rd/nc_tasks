package com.main.taxistation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TaxistationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxistationApplication.class, args);

    }
}
