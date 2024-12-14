package ru.job4j.helloservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello();
    }
}
