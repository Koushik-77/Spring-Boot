package com.koushik.example.learn_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class LearnSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringApplication.class, args);
    }



}
