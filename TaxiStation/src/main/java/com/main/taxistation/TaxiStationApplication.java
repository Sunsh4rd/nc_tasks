package com.main.taxistation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TaxiStationApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxiStationApplication.class, args);
    }


}
