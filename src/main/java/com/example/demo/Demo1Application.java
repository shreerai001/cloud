package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo1Application {


    @RestController
    class HelloworldController {
        @GetMapping("/")
        String hello() {
            return "Hello " + "there!";
        }

        @GetMapping("/test")
        String test() {
            return "est";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
