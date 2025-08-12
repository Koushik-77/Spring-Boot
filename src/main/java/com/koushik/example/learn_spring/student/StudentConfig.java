package com.koushik.example.learn_spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student koushik = new Student(
                    "Koushik",
                    "koushikrachamalla@gmail.com",
                    LocalDate.of(2004, Month.MAY,7)

            );
            Student sunny = new Student(
                    "Sunny",
                    "sunny@gmail.com",
                    LocalDate.of(2003, Month.MAY,7)

            );
            studentRepository.saveAll(
                    List.of(koushik, sunny)
            );
        };
    }

}
