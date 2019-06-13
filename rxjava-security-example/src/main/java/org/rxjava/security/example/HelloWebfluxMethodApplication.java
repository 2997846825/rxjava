package org.rxjava.security.example;

import org.rxjava.security.example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author happy 2019-06-11 01:04
 */
@SpringBootApplication
public class HelloWebfluxMethodApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWebfluxMethodApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {

        };
    }
}