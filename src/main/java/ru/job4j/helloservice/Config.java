package ru.job4j.helloservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.job4j.helloservice")
public class Config {
    @Bean
    public String name() {
        return "Spring User";
    }
}
