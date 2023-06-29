package com.example.day84thymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day84ThymeleafDemoApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Day84ThymeleafDemoApplication.class, args);
        } catch (Throwable e) {
            if (e.getClass().getName().contains("SilentExitException")) {
                System.out.println("Spring is restarting the main thread - See spring-boot-devtools");
            } else {
                throw e;
            }
        }
    }

}
