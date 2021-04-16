package com.example.springbootoracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringbootOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOracleApplication.class, args);
    }

}
